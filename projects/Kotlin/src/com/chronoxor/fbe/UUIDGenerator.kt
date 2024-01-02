//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.fbe

// Fast Binary Encoding UUID generator
object UUIDGenerator
{
    // Gregorian epoch
    private const val GregorianEpoch = 0xFFFFF4E2F964AC00uL

    // Kotlin constants workaround
    private val Sign = java.lang.Long.parseUnsignedLong("8000000000000000", 16)
    private val Low = java.lang.Long.parseUnsignedLong("00000000FFFFFFFF", 16)
    private val Mid = java.lang.Long.parseUnsignedLong("0000FFFF00000000", 16)
    private val High = java.lang.Long.parseUnsignedLong("FFFF000000000000", 16)

    // Lock and random generator
    private val lock = Object()
    private val generator = java.util.Random()

    // Node & clock sequence bytes
    private val node = makeNode()
    private var nodeAndClockSequence = makeNodeAndClockSequence()

    // Last UUID generated timestamp
    private var last = GregorianEpoch

    private fun makeNode(): ULong = generator.nextLong().toULong() or 0x0000010000000000uL

    private fun makeNodeAndClockSequence(): ULong
    {
        val clock = generator.nextLong().toULong()

        var lsb: ULong = 0u
        // Variant (2 bits)
        lsb = lsb or 0x8000000000000000uL
        // Clock sequence (14 bits)
        lsb = lsb or ((clock and 0x0000000000003FFFuL) shl 48)
        // 6 bytes
        lsb = lsb or node
        return lsb
    }

    // Generate nil UUID0 (all bits set to zero)
    fun nil(): java.util.UUID = java.util.UUID(0, 0)

    // Generate sequential UUID1 (time based version)
    fun sequential(): java.util.UUID
    {
        val now = System.currentTimeMillis().toULong()

        // Generate new clock sequence bytes to get rid of UUID duplicates
        synchronized(lock)
        {
            if (now <= last)
                nodeAndClockSequence = makeNodeAndClockSequence()
            last = now
        }

        val nanosSince = (now - GregorianEpoch) * 10000u

        var msb = 0uL
        msb = msb or (0x00000000FFFFFFFFuL and nanosSince).shl(32)
        msb = msb or (0x0000FFFF00000000uL and nanosSince).shr(16)
        msb = msb or (0xFFFF000000000000uL and nanosSince).shr(48)
        // Sets the version to 1
        msb = msb or 0x0000000000001000uL

        return java.util.UUID(msb.toLong(), nodeAndClockSequence.toLong())
    }

    // Generate random UUID4 (randomly or pseudo-randomly generated version)
    fun random(): java.util.UUID = java.util.UUID.randomUUID()
}
