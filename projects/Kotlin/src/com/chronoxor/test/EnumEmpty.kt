//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
class EnumEmpty : Comparable<EnumEmpty>
{
    companion object
    {
    }

    var value: EnumEmptyEnum? = EnumEmptyEnum.values()[0]
        private set

    val raw: Int
        get() = value!!.raw

    constructor()
    constructor(value: Int) { setEnum(value) }
    constructor(value: EnumEmptyEnum) { setEnum(value) }
    constructor(value: EnumEmpty) { setEnum(value) }

    fun setDefault() { setEnum(0.toInt()) }

    fun setEnum(value: Int) { this.value = EnumEmptyEnum.mapValue(value) }
    fun setEnum(value: EnumEmptyEnum) { this.value = value }
    fun setEnum(value: EnumEmpty) { this.value = value.value }

    override fun compareTo(other: EnumEmpty): Int
    {
        if (value == null)
            return -1
        if (other.value == null)
            return 1
        return (value!!.raw - other.value!!.raw).toInt()
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!EnumEmpty::class.java.isAssignableFrom(other.javaClass))
            return false

        val enm = other as EnumEmpty? ?: return false

        if (enm.value == null)
            return false
        if (value!!.raw != enm.value!!.raw)
            return false
        return true
    }

    override fun hashCode(): Int
    {
        var hash = 17
        hash = hash * 31 + if (value != null) value!!.hashCode() else 0
        return hash
    }

    override fun toString(): String
    {
        return if (value != null) value!!.toString() else "<unknown>"
    }
}
