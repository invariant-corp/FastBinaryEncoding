//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package com.chronoxor.test;

public class StructBytes implements Comparable<Object>
{
    public java.nio.ByteBuffer f1 = java.nio.ByteBuffer.allocate(0);
    public java.nio.ByteBuffer f2 = null;
    public java.nio.ByteBuffer f3 = null;

    public static final long fbeTypeConst = 120;
    public long fbeType() { return fbeTypeConst; }

    public StructBytes() {}

    public StructBytes(java.nio.ByteBuffer f1, java.nio.ByteBuffer f2, java.nio.ByteBuffer f3)
    {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
    }

    public StructBytes(StructBytes other)
    {
        this.f1 = other.f1;
        this.f2 = other.f2;
        this.f3 = other.f3;
    }

    public StructBytes clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new com.chronoxor.test.fbe.StructBytesModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new com.chronoxor.test.fbe.StructBytesModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object other)
    {
        if (other == null)
            return -1;

        if (!StructBytes.class.isAssignableFrom(other.getClass()))
            return -1;

        final StructBytes obj = (StructBytes)other;

        int result = 0;
        return result;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!StructBytes.class.isAssignableFrom(other.getClass()))
            return false;

        final StructBytes obj = (StructBytes)other;

        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        sb.append("StructBytes(");
        sb.append("f1="); if (f1 != null) sb.append("bytes[").append(f1.array().length).append("]"); else sb.append("null");
        sb.append(",f2="); if (f2 != null) sb.append("bytes[").append(f2.array().length).append("]"); else sb.append("null");
        sb.append(",f3="); if (f3 != null) sb.append("bytes[").append(f3.array().length).append("]"); else sb.append("null");
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return com.chronoxor.test.fbe.Json.getEngine().toJson(this); }
    public static StructBytes fromJson(String json) { return com.chronoxor.test.fbe.Json.getEngine().fromJson(json, StructBytes.class); }
}
