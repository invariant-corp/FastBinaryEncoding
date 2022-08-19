//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

// Fast Binary Encoding string field model
public class FieldModelString: FieldModel {
    public var _buffer: Buffer
    public var _offset: Int

    // Field size
    public let fbeSize: Int = 4

    public required init() {
        _buffer = Buffer()
        _offset = 0
    }

    public required init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset
    }

    public var fbeExtra: Int {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return 0
        }

        let fbeStringOffset = Int(readUInt32(offset: fbeOffset))
        if (fbeStringOffset == 0) || ((_buffer.offset + fbeStringOffset + 4) > _buffer.size) {
            return 0
        }

        let fbeStringSize = Int(readUInt32(offset: fbeStringOffset))
        return 4 + fbeStringSize
    }

    // Check if the string value is valid
    public func verify() -> Bool {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return true
        }

        let fbeStringOffset = Int(readUInt32(offset: fbeOffset))
        if fbeStringOffset == 0 {
            return true
        }

        if _buffer.offset + fbeStringOffset + 4 > _buffer.size {
            return false
        }

        let fbeStringSize = Int(readUInt32(offset: fbeStringOffset))
        if (_buffer.offset + fbeStringOffset + 4 + fbeStringSize) > _buffer.size {
            return false
        }

        return true
    }

    // Get the value
    public func get(defaults: String = "") -> String {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return defaults
        }

        let fbeStringOffset = Int(readUInt32(offset: fbeOffset))
        if fbeStringOffset == 0 {
            return defaults
        }

        if (_buffer.offset + fbeStringOffset + 4) > _buffer.size {
            return defaults
        }

        let fbeStringSize = Int(readUInt32(offset: fbeStringOffset))
        if (_buffer.offset + fbeStringOffset + 4 + fbeStringSize) > _buffer.size {
            return defaults
        }

        return readString(offset: fbeStringOffset + 4, size: fbeStringSize)
    }

    // Set the value
    public func set(value: String) throws {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return
        }

        let fbeStringSize = value.count
        let fbeStringOffset = try _buffer.allocate(size: 4 + fbeStringSize) - _buffer.offset
        if (fbeStringOffset <= 0) || ((_buffer.offset + fbeStringOffset + 4 + fbeStringSize) > _buffer.size) {
            return
        }

        write(offset: fbeOffset, value: UInt32(fbeStringOffset))
        write(offset: fbeStringOffset, value: value)
    }
}
