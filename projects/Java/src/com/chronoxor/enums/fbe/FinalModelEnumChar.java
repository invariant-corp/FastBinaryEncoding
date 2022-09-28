//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package com.chronoxor.enums.fbe;

// Fast Binary Encoding EnumChar final model
public final class FinalModelEnumChar extends com.chronoxor.fbe.FinalModel
{
    public FinalModelEnumChar(com.chronoxor.fbe.Buffer buffer, long offset) { super(buffer, offset); }

    // Get the allocation size
    public long fbeAllocationSize(com.chronoxor.enums.EnumChar value) { return fbeSize(); }

    // Get the final size
    @Override
    public long fbeSize() { return 1; }

    // Check if the value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return Long.MAX_VALUE;

        return fbeSize();
    }

    // Get the value
    public com.chronoxor.enums.EnumChar get(com.chronoxor.fbe.Size size)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return new com.chronoxor.enums.EnumChar();

        size.value = fbeSize();
        return new com.chronoxor.enums.EnumChar(readInt8(fbeOffset()));
    }

    // Set the value
    public long set(com.chronoxor.enums.EnumChar value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        write(fbeOffset(), value.getRaw());
        return fbeSize();
    }
}
