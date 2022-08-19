//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

import Foundation

// Fast Binary Encoding bytes final model
public class FinalModelData: FinalModel {
    public var _buffer = Buffer()
    public var _offset: Int = 0

    public init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset
    }

    public func fbeAllocationSize(value: Data) -> Int {
        return 4 + value.count
    }

    public func verify() -> Int {
        if (_buffer.offset + fbeOffset) + 4 > _buffer.size {
            return Int.max
        }

        let fbeBytesSize = Int(readUInt32(offset: fbeOffset))
        if (_buffer.offset + fbeOffset + 4 + fbeBytesSize) > _buffer.size {
            return Int.max
        }

        return 4 + fbeBytesSize
    }

    // Get the value
    public func get(size: inout Size) -> Data {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            size.value = 0
            return Data()
        }

        let fbeBytesSize = Int(readUInt32(offset: fbeOffset))
        if _buffer.offset + fbeOffset + 4 + fbeBytesSize > _buffer.size {
            assertionFailure("Model is broken!")
            size.value = 4
            return Data()
        }

        size.value = 4 + fbeBytesSize
        return readBytes(offset: fbeOffset + 4, size: fbeBytesSize)
    }

    // Set the value
    public func set(value: Data) throws -> Int {
        if (_buffer.offset + fbeOffset + 4) > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        let fbeBytesSize = value.count
        if _buffer.offset + fbeOffset + 4 + fbeBytesSize > _buffer.size {
            assertionFailure("Model is broken!")
            return 4
        }

        write(offset: fbeOffset, value: UInt32(fbeBytesSize))
        write(offset: fbeOffset + 4, value: value)
        return 4 + fbeBytesSize
    }
}
