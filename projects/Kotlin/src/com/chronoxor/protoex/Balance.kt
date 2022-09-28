//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.protoex

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class Balance : com.chronoxor.proto.Balance
{
    var locked: Double

    @Transient override var fbeType: Long = com.chronoxor.proto.Balance.fbeTypeConst

    constructor(parent: com.chronoxor.proto.Balance = com.chronoxor.proto.Balance(), locked: Double = 0.0): super(parent)
    {
        this.locked = locked
    }

    @Suppress("UNUSED_PARAMETER")
    constructor(other: Balance): super(other)
    {
        this.locked = other.locked
    }

    override fun clone(): Balance
    {
        // Serialize the struct to the FBE stream
        val writer = com.chronoxor.protoex.fbe.BalanceModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = com.chronoxor.protoex.fbe.BalanceModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!Balance::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as Balance? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        result = super.compareTo(obj)
        if (result != 0)
            return result
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!Balance::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as Balance? ?: return false

        if (!super.equals(obj))
            return false
        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        hash = hash * 31 + super.hashCode()
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("Balance(")
        sb.append(super.toString())
        sb.append(",locked="); sb.append(locked)
        sb.append(")")
        return sb.toString()
    }

    override fun toJson(): String = com.chronoxor.protoex.fbe.Json.engine.toJson(this)

    companion object
    {
        fun fromJson(json: String): Balance = com.chronoxor.protoex.fbe.Json.engine.fromJson(json, Balance::class.java)
    }
}
