//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package com.chronoxor.test.fbe;

// Fast Binary Encoding EnumSimple field model
public final class FieldModelEnumSimple extends com.chronoxor.fbe.FieldModel
{
    public FieldModelEnumSimple(com.chronoxor.fbe.Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 4; }

    // Get the value
    public com.chronoxor.test.EnumSimple get() { return get(new com.chronoxor.test.EnumSimple()); }
    public com.chronoxor.test.EnumSimple get(com.chronoxor.test.EnumSimple defaults)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        return new com.chronoxor.test.EnumSimple(readInt32(fbeOffset()));
    }

    // Set the value
    public void set(com.chronoxor.test.EnumSimple value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        write(fbeOffset(), value.getRaw());
    }
}
