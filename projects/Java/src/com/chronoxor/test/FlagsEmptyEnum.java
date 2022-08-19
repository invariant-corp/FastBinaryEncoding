//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

package com.chronoxor.test;

public enum FlagsEmptyEnum
{
    ;

    private int value;

    FlagsEmptyEnum(int value) { this.value = (int)value; }
    FlagsEmptyEnum(FlagsEmptyEnum value) { this.value = value.value; }

    public int getRaw() { return value; }

    public static FlagsEmptyEnum mapValue(int value) { return mapping.get(value); }

    public boolean hasFlags(int flags) { return (((value & flags) != 0) && ((value & flags) == flags)); }
    public boolean hasFlags(FlagsEmptyEnum flags) { return hasFlags(flags.value); }

    public java.util.EnumSet<FlagsEmptyEnum> getAllSet() { return java.util.EnumSet.allOf(FlagsEmptyEnum.class); }
    public java.util.EnumSet<FlagsEmptyEnum> getNoneSet() { return java.util.EnumSet.noneOf(FlagsEmptyEnum.class); }
    public java.util.EnumSet<FlagsEmptyEnum> getCurrentSet()
    {
        java.util.EnumSet<FlagsEmptyEnum> result = java.util.EnumSet.noneOf(FlagsEmptyEnum.class);
        return result;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        return sb.toString();
    }

    private static final java.util.Map<Integer, FlagsEmptyEnum> mapping = new java.util.HashMap<>();
    static
    {
        for (var value : FlagsEmptyEnum.values())
            mapping.put(value.value, value);
    }
}
