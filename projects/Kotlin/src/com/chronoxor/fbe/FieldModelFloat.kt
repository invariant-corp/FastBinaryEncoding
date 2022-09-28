//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.fbe

// Fast Binary Encoding Float field model
class FieldModelFloat(buffer: Buffer, offset: Long) : FieldModel(buffer, offset)
{
    // Field size
    override val fbeSize: Long = 4

    // Get the value
    fun get(defaults: Float = 0.0f): Float
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return defaults

        return readFloat(fbeOffset)
    }

    // Set the value
    fun set(value: Float)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        write(fbeOffset, value)
    }
}
