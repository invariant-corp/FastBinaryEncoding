//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package com.chronoxor.enums;

public final class EnumInt32 implements Comparable<EnumInt32>
{
    public static final EnumInt32 ENUM_VALUE_0 = new EnumInt32(EnumInt32Enum.ENUM_VALUE_0);
    public static final EnumInt32 ENUM_VALUE_1 = new EnumInt32(EnumInt32Enum.ENUM_VALUE_1);
    public static final EnumInt32 ENUM_VALUE_2 = new EnumInt32(EnumInt32Enum.ENUM_VALUE_2);
    public static final EnumInt32 ENUM_VALUE_3 = new EnumInt32(EnumInt32Enum.ENUM_VALUE_3);
    public static final EnumInt32 ENUM_VALUE_4 = new EnumInt32(EnumInt32Enum.ENUM_VALUE_4);
    public static final EnumInt32 ENUM_VALUE_5 = new EnumInt32(EnumInt32Enum.ENUM_VALUE_5);

    private EnumInt32Enum value = EnumInt32Enum.values()[0];

    public EnumInt32() {}
    public EnumInt32(int value) { setEnum(value); }
    public EnumInt32(EnumInt32Enum value) { setEnum(value); }
    public EnumInt32(EnumInt32 value) { setEnum(value); }

    public EnumInt32Enum getEnum() { return value; }
    public int getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((int)0); }

    public void setEnum(int value) { this.value = EnumInt32Enum.mapValue(value); }
    public void setEnum(EnumInt32Enum value) { this.value = value; }
    public void setEnum(EnumInt32 value) { this.value = value.value; }

    @Override
    public int compareTo(EnumInt32 other)
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

        if (!EnumInt32.class.isAssignableFrom(other.getClass()))
            return false;

        final EnumInt32 enm = (EnumInt32)other;

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
