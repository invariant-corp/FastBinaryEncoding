//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.proto.fbe

// Fast Binary Encoding Order field model
@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods", "ReplaceGetOrSet")
class FieldModelOrder(buffer: com.chronoxor.fbe.Buffer, offset: Long) : com.chronoxor.fbe.FieldModel(buffer, offset)
{
    val id: com.chronoxor.fbe.FieldModelInt32 = com.chronoxor.fbe.FieldModelInt32(buffer, 4 + 4)
    val symbol: com.chronoxor.fbe.FieldModelString = com.chronoxor.fbe.FieldModelString(buffer, id.fbeOffset + id.fbeSize)
    val side: FieldModelOrderSide = FieldModelOrderSide(buffer, symbol.fbeOffset + symbol.fbeSize)
    val type: FieldModelOrderType = FieldModelOrderType(buffer, side.fbeOffset + side.fbeSize)
    val price: com.chronoxor.fbe.FieldModelDouble = com.chronoxor.fbe.FieldModelDouble(buffer, type.fbeOffset + type.fbeSize)
    val volume: com.chronoxor.fbe.FieldModelDouble = com.chronoxor.fbe.FieldModelDouble(buffer, price.fbeOffset + price.fbeSize)

    // Field size
    override val fbeSize: Long = 4

    // Field body size
    val fbeBody: Long = (4 + 4
        + id.fbeSize
        + symbol.fbeSize
        + side.fbeSize
        + type.fbeSize
        + price.fbeSize
        + volume.fbeSize
        )

    // Field extra size
    override val fbeExtra: Long get()
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeStructOffset = readUInt32(fbeOffset).toLong()
        if ((fbeStructOffset == 0L) || ((_buffer.offset + fbeStructOffset + 4) > _buffer.size))
            return 0

        _buffer.shift(fbeStructOffset)

        val fbeResult = (fbeBody
            + id.fbeExtra
            + symbol.fbeExtra
            + side.fbeExtra
            + type.fbeExtra
            + price.fbeExtra
            + volume.fbeExtra
            )

        _buffer.unshift(fbeStructOffset)

        return fbeResult
    }

    // Field type
    var fbeType: Long = fbeTypeConst

    companion object
    {
        const val fbeTypeConst: Long = 1
    }

    // Check if the struct value is valid
    fun verify(fbeVerifyType: Boolean = true): Boolean
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return true

        val fbeStructOffset = readUInt32(fbeOffset).toLong()
        if ((fbeStructOffset == 0L) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size))
            return false

        val fbeStructSize = readUInt32(fbeStructOffset).toLong()
        if (fbeStructSize < (4 + 4))
            return false

        val fbeStructType = readUInt32(fbeStructOffset + 4).toLong()
        if (fbeVerifyType && (fbeStructType != fbeType))
            return false

        _buffer.shift(fbeStructOffset)
        val fbeResult = verifyFields(fbeStructSize)
        _buffer.unshift(fbeStructOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    @Suppress("UNUSED_PARAMETER")
    fun verifyFields(fbeStructSize: Long): Boolean
    {
        var fbeCurrentSize = 4L + 4L

        if ((fbeCurrentSize + id.fbeSize) > fbeStructSize)
            return true
        if (!id.verify())
            return false
        fbeCurrentSize += id.fbeSize

        if ((fbeCurrentSize + symbol.fbeSize) > fbeStructSize)
            return true
        if (!symbol.verify())
            return false
        fbeCurrentSize += symbol.fbeSize

        if ((fbeCurrentSize + side.fbeSize) > fbeStructSize)
            return true
        if (!side.verify())
            return false
        fbeCurrentSize += side.fbeSize

        if ((fbeCurrentSize + type.fbeSize) > fbeStructSize)
            return true
        if (!type.verify())
            return false
        fbeCurrentSize += type.fbeSize

        if ((fbeCurrentSize + price.fbeSize) > fbeStructSize)
            return true
        if (!price.verify())
            return false
        fbeCurrentSize += price.fbeSize

        if ((fbeCurrentSize + volume.fbeSize) > fbeStructSize)
            return true
        if (!volume.verify())
            return false
        fbeCurrentSize += volume.fbeSize

        return true
    }

    // Get the struct value (begin phase)
    fun getBegin(): Long
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeStructOffset = readUInt32(fbeOffset).toLong()
        assert((fbeStructOffset > 0) && ((_buffer.offset + fbeStructOffset + 4 + 4) <= _buffer.size)) { "Model is broken!" }
        if ((fbeStructOffset == 0L) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size))
            return 0

        val fbeStructSize = readUInt32(fbeStructOffset).toLong()
        assert(fbeStructSize >= (4 + 4)) { "Model is broken!" }
        if (fbeStructSize < (4 + 4))
            return 0

        _buffer.shift(fbeStructOffset)
        return fbeStructOffset
    }

    // Get the struct value (end phase)
    fun getEnd(fbeBegin: Long)
    {
        _buffer.unshift(fbeBegin)
    }

    // Get the struct value
    fun get(fbeValue: com.chronoxor.proto.Order = com.chronoxor.proto.Order()): com.chronoxor.proto.Order
    {
        val fbeBegin = getBegin()
        if (fbeBegin == 0L)
            return fbeValue

        val fbeStructSize = readUInt32(0).toLong()
        getFields(fbeValue, fbeStructSize)
        getEnd(fbeBegin)
        return fbeValue
    }

    // Get the struct fields values
    @Suppress("UNUSED_PARAMETER")
    fun getFields(fbeValue: com.chronoxor.proto.Order, fbeStructSize: Long)
    {
        var fbeCurrentSize = 4L + 4L

        if ((fbeCurrentSize + id.fbeSize) <= fbeStructSize)
            fbeValue.id = id.get()
        else
            fbeValue.id = 0
        fbeCurrentSize += id.fbeSize

        if ((fbeCurrentSize + symbol.fbeSize) <= fbeStructSize)
            fbeValue.symbol = symbol.get()
        else
            fbeValue.symbol = ""
        fbeCurrentSize += symbol.fbeSize

        if ((fbeCurrentSize + side.fbeSize) <= fbeStructSize)
            fbeValue.side = side.get()
        else
            fbeValue.side = com.chronoxor.proto.OrderSide()
        fbeCurrentSize += side.fbeSize

        if ((fbeCurrentSize + type.fbeSize) <= fbeStructSize)
            fbeValue.type = type.get()
        else
            fbeValue.type = com.chronoxor.proto.OrderType()
        fbeCurrentSize += type.fbeSize

        if ((fbeCurrentSize + price.fbeSize) <= fbeStructSize)
            fbeValue.price = price.get(0.0)
        else
            fbeValue.price = 0.0
        fbeCurrentSize += price.fbeSize

        if ((fbeCurrentSize + volume.fbeSize) <= fbeStructSize)
            fbeValue.volume = volume.get(0.0)
        else
            fbeValue.volume = 0.0
        fbeCurrentSize += volume.fbeSize
    }

    // Set the struct value (begin phase)
    fun setBegin(): Long
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeStructSize = fbeBody
        val fbeStructOffset = _buffer.allocate(fbeStructSize) - _buffer.offset
        assert((fbeStructOffset > 0) && ((_buffer.offset + fbeStructOffset + fbeStructSize) <= _buffer.size)) { "Model is broken!" }
        if ((fbeStructOffset <= 0) || ((_buffer.offset + fbeStructOffset + fbeStructSize) > _buffer.size))
            return 0

        write(fbeOffset, fbeStructOffset.toUInt())
        write(fbeStructOffset, fbeStructSize.toUInt())
        write(fbeStructOffset + 4, fbeType.toUInt())

        _buffer.shift(fbeStructOffset)
        return fbeStructOffset
    }

    // Set the struct value (end phase)
    fun setEnd(fbeBegin: Long)
    {
        _buffer.unshift(fbeBegin)
    }

    // Set the struct value
    fun set(fbeValue: com.chronoxor.proto.Order)
    {
        val fbeBegin = setBegin()
        if (fbeBegin == 0L)
            return

        setFields(fbeValue)
        setEnd(fbeBegin)
    }

    // Set the struct fields values
    @Suppress("UNUSED_PARAMETER")
    fun setFields(fbeValue: com.chronoxor.proto.Order)
    {
        id.set(fbeValue.id)
        symbol.set(fbeValue.symbol)
        side.set(fbeValue.side)
        type.set(fbeValue.type)
        price.set(fbeValue.price)
        volume.set(fbeValue.volume)
    }
}
