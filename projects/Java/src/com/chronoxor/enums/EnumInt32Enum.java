//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

package com.chronoxor.enums;

public enum EnumInt32Enum
{
    ENUM_VALUE_0((int)0 + 0)
    , ENUM_VALUE_1((int)-2147483648 + 0)
    , ENUM_VALUE_2((int)-2147483648 + 1)
    , ENUM_VALUE_3((int)2147483646 + 0)
    , ENUM_VALUE_4((int)2147483646 + 1)
    , ENUM_VALUE_5(ENUM_VALUE_3.getRaw())
    ;

    private int value;

    EnumInt32Enum(int value) { this.value = (int)value; }
    EnumInt32Enum(EnumInt32Enum value) { this.value = value.value; }

    public int getRaw() { return value; }

    public static EnumInt32Enum mapValue(int value) { return mapping.get(value); }

    @Override
    public String toString()
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0";
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1";
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2";
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3";
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4";
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5";
        return "<unknown>";
    }

    private static final java.util.Map<Integer, EnumInt32Enum> mapping = new java.util.HashMap<>();
    static
    {
        for (var value : EnumInt32Enum.values())
            mapping.put(value.value, value);
    }
}
