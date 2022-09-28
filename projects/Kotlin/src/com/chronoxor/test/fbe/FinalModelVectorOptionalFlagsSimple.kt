//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding OptionalFlagsSimple vector final model
class FinalModelVectorOptionalFlagsSimple(buffer: com.chronoxor.fbe.Buffer, offset: Long) : com.chronoxor.fbe.FinalModel(buffer, offset)
{
    private val _model = FinalModelOptionalFlagsSimple(buffer, offset)

    // Get the allocation size
    fun fbeAllocationSize(values: java.util.ArrayList<com.chronoxor.test.FlagsSimple?>): Long
    {
        var size: Long = 4
        for (value in values)
            size += _model.fbeAllocationSize(value)
        return size
    }
    fun fbeAllocationSize(values: java.util.LinkedList<com.chronoxor.test.FlagsSimple?>): Long
    {
        var size: Long = 4
        for (value in values)
            size += _model.fbeAllocationSize(value)
        return size
    }
    fun fbeAllocationSize(values: java.util.HashSet<com.chronoxor.test.FlagsSimple?>): Long
    {
        var size: Long = 4
        for (value in values)
            size += _model.fbeAllocationSize(value)
        return size
    }

    // Check if the vector is valid
    override fun verify(): Long
    {
        if ((_buffer.offset + fbeOffset + 4) > _buffer.size)
            return Long.MAX_VALUE

        val fbeVectorSize = readUInt32(fbeOffset).toLong()

        var size: Long = 4
        _model.fbeOffset = fbeOffset + 4
        var i = fbeVectorSize
        while (i-- > 0)
        {
            val offset = _model.verify()
            if (offset == Long.MAX_VALUE)
                return Long.MAX_VALUE
            _model.fbeShift(offset)
            size += offset
        }
        return size
    }

    // Get the vector as java.util.ArrayList
    fun get(values: java.util.ArrayList<com.chronoxor.test.FlagsSimple?>): Long
    {
        values.clear()

        assert((_buffer.offset + fbeOffset + 4) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + 4) > _buffer.size)
            return 0

        val fbeVectorSize = readUInt32(fbeOffset).toLong()
        if (fbeVectorSize == 0L)
            return 4

        values.ensureCapacity(fbeVectorSize.toInt())

        var size: Long = 4
        val offset = com.chronoxor.fbe.Size()
        _model.fbeOffset = fbeOffset + 4
        for (i in 0 until fbeVectorSize)
        {
            offset.value = 0
            val value = _model.get(offset)
            values.add(value)
            _model.fbeShift(offset.value)
            size += offset.value
        }
        return size
    }

    // Get the vector as java.util.LinkedList
    fun get(values: java.util.LinkedList<com.chronoxor.test.FlagsSimple?>): Long
    {
        values.clear()

        assert((_buffer.offset + fbeOffset + 4) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + 4) > _buffer.size)
            return 0

        val fbeVectorSize = readUInt32(fbeOffset).toLong()
        if (fbeVectorSize == 0L)
            return 4

        var size: Long = 4
        val offset = com.chronoxor.fbe.Size()
        _model.fbeOffset = fbeOffset + 4
        for (i in 0 until fbeVectorSize)
        {
            offset.value = 0
            val value = _model.get(offset)
            values.add(value)
            _model.fbeShift(offset.value)
            size += offset.value
        }
        return size
    }

    // Get the vector as java.util.HashSet
    fun get(values: java.util.HashSet<com.chronoxor.test.FlagsSimple?>): Long
    {
        values.clear()

        assert((_buffer.offset + fbeOffset + 4) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + 4) > _buffer.size)
            return 0

        val fbeVectorSize = readUInt32(fbeOffset).toLong()
        if (fbeVectorSize == 0L)
            return 4

        var size: Long = 4
        val offset = com.chronoxor.fbe.Size()
        _model.fbeOffset = fbeOffset + 4
        for (i in 0 until fbeVectorSize)
        {
            offset.value = 0
            val value = _model.get(offset)
            values.add(value)
            _model.fbeShift(offset.value)
            size += offset.value
        }
        return size
    }

    // Set the vector as java.util.ArrayList
    fun set(values: java.util.ArrayList<com.chronoxor.test.FlagsSimple?>): Long
    {
        assert((_buffer.offset + fbeOffset + 4) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + 4) > _buffer.size)
            return 0

        write(fbeOffset, values.size.toUInt())

        var size: Long = 4
        _model.fbeOffset = fbeOffset + 4
        for (value in values)
        {
            val offset = _model.set(value)
            _model.fbeShift(offset)
            size += offset
        }
        return size
    }

    // Set the vector as java.util.LinkedList
    fun set(values: java.util.LinkedList<com.chronoxor.test.FlagsSimple?>): Long
    {
        assert((_buffer.offset + fbeOffset + 4) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + 4) > _buffer.size)
            return 0

        write(fbeOffset, values.size.toUInt())

        var size: Long = 4
        _model.fbeOffset = fbeOffset + 4
        for (value in values)
        {
            val offset = _model.set(value)
            _model.fbeShift(offset)
            size += offset
        }
        return size
    }

    // Set the vector as java.util.HashSet
    fun set(values: java.util.HashSet<com.chronoxor.test.FlagsSimple?>): Long
    {
        assert((_buffer.offset + fbeOffset + 4) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + 4) > _buffer.size)
            return 0

        write(fbeOffset, values.size.toUInt())

        var size: Long = 4
        _model.fbeOffset = fbeOffset + 4
        for (value in values)
        {
            val offset = _model.set(value)
            _model.fbeShift(offset)
            size += offset
        }
        return size
    }
}
