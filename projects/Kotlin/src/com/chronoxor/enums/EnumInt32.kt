//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
class EnumInt32 : Comparable<EnumInt32>
{
    companion object
    {
        val ENUM_VALUE_0 = EnumInt32(EnumInt32Enum.ENUM_VALUE_0)
        val ENUM_VALUE_1 = EnumInt32(EnumInt32Enum.ENUM_VALUE_1)
        val ENUM_VALUE_2 = EnumInt32(EnumInt32Enum.ENUM_VALUE_2)
        val ENUM_VALUE_3 = EnumInt32(EnumInt32Enum.ENUM_VALUE_3)
        val ENUM_VALUE_4 = EnumInt32(EnumInt32Enum.ENUM_VALUE_4)
        val ENUM_VALUE_5 = EnumInt32(EnumInt32Enum.ENUM_VALUE_5)
    }

    var value: EnumInt32Enum? = EnumInt32Enum.values()[0]
        private set

    val raw: Int
        get() = value!!.raw

    constructor()
    constructor(value: Int) { setEnum(value) }
    constructor(value: EnumInt32Enum) { setEnum(value) }
    constructor(value: EnumInt32) { setEnum(value) }

    fun setDefault() { setEnum(0.toInt()) }

    fun setEnum(value: Int) { this.value = EnumInt32Enum.mapValue(value) }
    fun setEnum(value: EnumInt32Enum) { this.value = value }
    fun setEnum(value: EnumInt32) { this.value = value.value }

    override fun compareTo(other: EnumInt32): Int
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

        if (!EnumInt32::class.java.isAssignableFrom(other.javaClass))
            return false

        val enm = other as EnumInt32? ?: return false

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
