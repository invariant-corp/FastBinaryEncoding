//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

import Foundation

public enum EnumEmptyEnum {
    typealias RawValue = Int32

    var rawValue: RawValue {
        switch self {
        }
    }

    init(value: Int8) { self = EnumEmptyEnum(rawValue: NSNumber(value: value).int32Value) }
    init(value: Int16) { self = EnumEmptyEnum(rawValue: NSNumber(value: value).int32Value) }
    init(value: Int32) { self = EnumEmptyEnum(rawValue: NSNumber(value: value).int32Value) }
    init(value: Int64) { self = EnumEmptyEnum(rawValue: NSNumber(value: value).int32Value) }
    init(value: EnumEmptyEnum) { self = EnumEmptyEnum(rawValue: value.rawValue) }
    init(rawValue: Int32) { self = Self.mapValue(value: rawValue)! }

    var description: String {
        return "<empty>"
    }

    static let rawValuesMap: [RawValue: EnumEmptyEnum] = {
        var value = [RawValue: EnumEmptyEnum]()
        return value
    }()

    static func mapValue(value: Int32) -> EnumEmptyEnum? {
        return rawValuesMap[value]
    }
}
