//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

package com.chronoxor.fbe;

// Fast Binary Encoding int field model
public final class FieldModelInt32 extends FieldModel
{
    public FieldModelInt32(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 4; }

    // Get the value
    public int get() { return get(0); }
    public int get(int defaults)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        return readInt32(fbeOffset());
    }

    // Set the value
    public void set(int value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        write(fbeOffset(), value);
    }
}
