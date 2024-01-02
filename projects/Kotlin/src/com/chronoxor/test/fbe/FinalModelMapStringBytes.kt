//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding String->Bytes map final model
class FinalModelMapStringBytes(buffer: com.chronoxor.fbe.Buffer, offset: Long) : com.chronoxor.fbe.FinalModel(buffer, offset)
{
    private val _modelKey = com.chronoxor.fbe.FinalModelString(buffer, offset)
    private val _modelValue = com.chronoxor.fbe.FinalModelBytes(buffer, offset)

    // Get the allocation size
    fun fbeAllocationSize(values: java.util.TreeMap<String, ByteArray>): Long
    {
        var size: Long = 4
        for ((key, value1) in values)
        {
            size += _modelKey.fbeAllocationSize(key)
            size += _modelValue.fbeAllocationSize(value1)
        }
        return size
    }
    fun fbeAllocationSize(values: java.util.HashMap<String, ByteArray>): Long
    {
        var size: Long = 4
        for ((key, value1) in values)
        {
            size += _modelKey.fbeAllocationSize(key)
            size += _modelValue.fbeAllocationSize(value1)
        }
        return size
    }

    // Check if the map is valid
    override fun verify(): Long
    {
        if ((_buffer.offset + fbeOffset + 4) > _buffer.size)
            return Long.MAX_VALUE

        val fbeMapSize = readUInt32(fbeOffset).toLong()

        var size: Long = 4
        _modelKey.fbeOffset = fbeOffset + 4
        _modelValue.fbeOffset = fbeOffset + 4
        var i = fbeMapSize
        while (i-- > 0)
        {
            val offsetKey = _modelKey.verify()
            if (offsetKey == Long.MAX_VALUE)
                return Long.MAX_VALUE
            _modelKey.fbeShift(offsetKey)
            _modelValue.fbeShift(offsetKey)
            size += offsetKey
            val offsetValue = _modelValue.verify()
            if (offsetValue == Long.MAX_VALUE)
                return Long.MAX_VALUE
            _modelKey.fbeShift(offsetValue)
            _modelValue.fbeShift(offsetValue)
            size += offsetValue
        }
        return size
    }

    // Get the map as java.util.TreeMap
    fun get(values: java.util.TreeMap<String, ByteArray>): Long
    {
        values.clear()

        assert((_buffer.offset + fbeOffset + 4) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + 4) > _buffer.size)
            return 0

        val fbeMapSize = readUInt32(fbeOffset).toLong()
        if (fbeMapSize == 0L)
            return 4

        var size: Long = 4
        val offset = com.chronoxor.fbe.Size()
        _modelKey.fbeOffset = fbeOffset + 4
        _modelValue.fbeOffset = fbeOffset + 4
        var i = fbeMapSize
        while (i-- > 0)
        {
            offset.value = 0
            val key = _modelKey.get(offset)
            _modelKey.fbeShift(offset.value)
            _modelValue.fbeShift(offset.value)
            size += offset.value
            offset.value = 0
            val value = _modelValue.get(offset)
            _modelKey.fbeShift(offset.value)
            _modelValue.fbeShift(offset.value)
            size += offset.value
            values[key] = value
        }
        return size
    }

    // Get the map as java.util.HashMap
    fun get(values: java.util.HashMap<String, ByteArray>): Long
    {
        values.clear()

        assert((_buffer.offset + fbeOffset + 4) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + 4) > _buffer.size)
            return 0

        val fbeMapSize = readUInt32(fbeOffset).toLong()
        if (fbeMapSize == 0L)
            return 4

        var size: Long = 4
        val offset = com.chronoxor.fbe.Size()
        _modelKey.fbeOffset = fbeOffset + 4
        _modelValue.fbeOffset = fbeOffset + 4
        var i = fbeMapSize
        while (i-- > 0)
        {
            offset.value = 0
            val key = _modelKey.get(offset)
            _modelKey.fbeShift(offset.value)
            _modelValue.fbeShift(offset.value)
            size += offset.value
            offset.value = 0
            val value = _modelValue.get(offset)
            _modelKey.fbeShift(offset.value)
            _modelValue.fbeShift(offset.value)
            size += offset.value

            values[key] = value
        }
        return size
    }

    // Set the map as java.util.TreeMap
    fun set(values: java.util.TreeMap<String, ByteArray>): Long
    {
        assert((_buffer.offset + fbeOffset + 4) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + 4) > _buffer.size)
            return 0

        write(fbeOffset, values.size.toUInt())

        var size: Long = 4
        _modelKey.fbeOffset = fbeOffset + 4
        _modelValue.fbeOffset = fbeOffset + 4
        for ((key, value1) in values)
        {
            val offsetKey = _modelKey.set(key)
            _modelKey.fbeShift(offsetKey)
            _modelValue.fbeShift(offsetKey)
            val offsetValue = _modelValue.set(value1)
            _modelKey.fbeShift(offsetValue)
            _modelValue.fbeShift(offsetValue)
            size += offsetKey + offsetValue
        }
        return size
    }

    // Set the map as java.util.HashMap
    fun set(values: java.util.HashMap<String, ByteArray>): Long
    {
        assert((_buffer.offset + fbeOffset + 4) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + 4) > _buffer.size)
            return 0

        write(fbeOffset, values.size.toUInt())

        var size: Long = 4
        _modelKey.fbeOffset = fbeOffset + 4
        _modelValue.fbeOffset = fbeOffset + 4
        for ((key, value1) in values)
        {
            val offsetKey = _modelKey.set(key)
            _modelKey.fbeShift(offsetKey)
            _modelValue.fbeShift(offsetKey)
            val offsetValue = _modelValue.set(value1)
            _modelKey.fbeShift(offsetValue)
            _modelValue.fbeShift(offsetValue)
            size += offsetKey + offsetValue
        }
        return size
    }
}
