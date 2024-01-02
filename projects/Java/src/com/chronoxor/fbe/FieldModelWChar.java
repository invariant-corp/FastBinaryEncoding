//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

package com.chronoxor.fbe;

// Fast Binary Encoding char field model
public final class FieldModelWChar extends FieldModel
{
    public FieldModelWChar(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 4; }

    // Get the value
    public char get() { return get('\u0000'); }
    public char get(char defaults)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        return readWChar(fbeOffset());
    }

    // Set the value
    public void set(char value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        write(fbeOffset(), (int)value);
    }
}
