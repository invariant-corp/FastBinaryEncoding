//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package com.chronoxor.protoex.fbe;

// Fast Binary Encoding OrderType field model
public final class FieldModelOrderType extends com.chronoxor.fbe.FieldModel
{
    public FieldModelOrderType(com.chronoxor.fbe.Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 1; }

    // Get the value
    public com.chronoxor.protoex.OrderType get() { return get(new com.chronoxor.protoex.OrderType()); }
    public com.chronoxor.protoex.OrderType get(com.chronoxor.protoex.OrderType defaults)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        return new com.chronoxor.protoex.OrderType(readByte(fbeOffset()));
    }

    // Set the value
    public void set(com.chronoxor.protoex.OrderType value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        write(fbeOffset(), value.getRaw());
    }
}
