//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

import ChronoxorFbe

// Fast Binary Encoding BalanceMessage final model
public class FinalModelBalanceMessage: FinalModel {
    public var _buffer: Buffer
    public var _offset: Int

    let body: FinalModelBalance

    // Field type
    public var fbeType: Int = fbeTypeConst

    public static let fbeTypeConst: Int = 2

    public required init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset

        body = FinalModelBalance(buffer: buffer, offset: 0)
    }

    // Get the allocation size
    public func fbeAllocationSize(value fbeValue: BalanceMessage) -> Int {
        return 0
            + body.fbeAllocationSize(value: fbeValue.body)
    }

    // Check if the struct value is valid
    public func verify() -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeResult = verifyFields()
        _buffer.unshift(offset: fbeOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    public func verifyFields() -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeFieldSize: Int = 0

        body.fbeOffset = fbeCurrentOffset
        fbeFieldSize = body.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        return fbeCurrentOffset
    }

    // Get the struct value
    public func get(size: inout Size) -> BalanceMessage {
        var fbeValue = BalanceMessage()
        return get(size: &size, fbeValue: &fbeValue)
    }

    // Get the struct value
    public func get(size: inout Size, fbeValue: inout BalanceMessage) -> BalanceMessage {
        _buffer.shift(offset: fbeOffset)
        size.value = getFields(fbeValue: &fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeValue
    }

    // Get the struct fields values
    public func getFields(fbeValue: inout BalanceMessage) -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        var fbeFieldSize = Size()

        body.fbeOffset = fbeCurrentOffset
        fbeValue.body = body.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }

    // Set the struct value
    public func set(value fbeValue: BalanceMessage) throws -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeSize = try setFields(fbeValue: fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeSize
    }

    // Set the struct fields values
    public func setFields(fbeValue: BalanceMessage) throws -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        let fbeFieldSize = Size()

        body.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try body.set(value: fbeValue.body)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }
}
