//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

package com.chronoxor.fbe;

// Fast Binary Encoding double field model
public final class FieldModelDouble extends FieldModel
{
    public FieldModelDouble(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 8; }

    // Get the value
    public double get() { return get(0.0d); }
    public double get(double defaults)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        return readDouble(fbeOffset());
    }

    // Set the value
    public void set(double value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        write(fbeOffset(), value);
    }
}
