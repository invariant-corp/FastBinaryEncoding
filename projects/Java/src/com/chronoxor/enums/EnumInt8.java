//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

package com.chronoxor.enums;

public final class EnumInt8 implements Comparable<EnumInt8>
{
    public static final EnumInt8 ENUM_VALUE_0 = new EnumInt8(EnumInt8Enum.ENUM_VALUE_0);
    public static final EnumInt8 ENUM_VALUE_1 = new EnumInt8(EnumInt8Enum.ENUM_VALUE_1);
    public static final EnumInt8 ENUM_VALUE_2 = new EnumInt8(EnumInt8Enum.ENUM_VALUE_2);
    public static final EnumInt8 ENUM_VALUE_3 = new EnumInt8(EnumInt8Enum.ENUM_VALUE_3);
    public static final EnumInt8 ENUM_VALUE_4 = new EnumInt8(EnumInt8Enum.ENUM_VALUE_4);
    public static final EnumInt8 ENUM_VALUE_5 = new EnumInt8(EnumInt8Enum.ENUM_VALUE_5);

    private EnumInt8Enum value = EnumInt8Enum.values()[0];

    public EnumInt8() {}
    public EnumInt8(byte value) { setEnum(value); }
    public EnumInt8(EnumInt8Enum value) { setEnum(value); }
    public EnumInt8(EnumInt8 value) { setEnum(value); }

    public EnumInt8Enum getEnum() { return value; }
    public byte getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((byte)0); }

    public void setEnum(byte value) { this.value = EnumInt8Enum.mapValue(value); }
    public void setEnum(EnumInt8Enum value) { this.value = value; }
    public void setEnum(EnumInt8 value) { this.value = value.value; }

    @Override
    public int compareTo(EnumInt8 other)
    {
        if (value == null)
            return -1;
        if (other.value == null)
            return 1;
        return (int)(value.getRaw() - other.value.getRaw());
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!EnumInt8.class.isAssignableFrom(other.getClass()))
            return false;

        final EnumInt8 enm = (EnumInt8)other;

        if ((value == null) || (enm.value == null))
            return false;
        if (value.getRaw() != enm.value.getRaw())
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + ((value != null) ? value.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() { return (value != null) ? value.toString() : "<unknown>"; }
}
