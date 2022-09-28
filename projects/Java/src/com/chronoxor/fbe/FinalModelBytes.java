//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package com.chronoxor.fbe;

// Fast Binary Encoding bytes final model
public final class FinalModelBytes extends FinalModel
{
    public FinalModelBytes(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the allocation size
    public long fbeAllocationSize(java.nio.ByteBuffer value) { return 4 + value.array().length; }

    // Check if the bytes value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return Long.MAX_VALUE;

        int fbeBytesSize = readInt32(fbeOffset());
        if ((_buffer.getOffset() + fbeOffset() + 4 + fbeBytesSize) > _buffer.getSize())
            return Long.MAX_VALUE;

        return 4 + fbeBytesSize;
    }

    // Get the bytes value
    public java.nio.ByteBuffer get(Size size)
    {
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
        {
            size.value = 0;
            return java.nio.ByteBuffer.allocate(0);
        }

        int fbeBytesSize = readInt32(fbeOffset());
        assert ((_buffer.getOffset() + fbeOffset() + 4 + fbeBytesSize) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4 + fbeBytesSize) > _buffer.getSize())
        {
            size.value = 4;
            return java.nio.ByteBuffer.allocate(0);
        }

        size.value = 4 + fbeBytesSize;
        return java.nio.ByteBuffer.wrap(readBytes(fbeOffset() + 4, fbeBytesSize));
    }

    // Set the bytes value
    public long set(java.nio.ByteBuffer value)
    {
        assert (value != null) : "Invalid bytes value!";
        if (value == null)
            throw new IllegalArgumentException("Invalid bytes value!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        int fbeBytesSize = value.array().length;
        assert ((_buffer.getOffset() + fbeOffset() + 4 + fbeBytesSize) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4 + fbeBytesSize) > _buffer.getSize())
            return 4;

        write(fbeOffset(), fbeBytesSize);
        write(fbeOffset() + 4, value.array());
        return 4 + fbeBytesSize;
    }
}
