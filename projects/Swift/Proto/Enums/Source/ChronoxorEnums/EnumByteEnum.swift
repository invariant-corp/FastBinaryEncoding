//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

import Foundation

public enum EnumByteEnum {
    typealias RawValue = UInt8
    case ENUM_VALUE_0
    case ENUM_VALUE_1
    case ENUM_VALUE_2
    case ENUM_VALUE_3
    case ENUM_VALUE_4
    case ENUM_VALUE_5

    var rawValue: RawValue {
        switch self {
        case .ENUM_VALUE_0: return 0 + 0
        case .ENUM_VALUE_1: return 0 + 0
        case .ENUM_VALUE_2: return 0 + 1
        case .ENUM_VALUE_3: return 254 + 0
        case .ENUM_VALUE_4: return 254 + 1
        case .ENUM_VALUE_5: return Self.ENUM_VALUE_3.rawValue
        }
    }

    init(value: UInt8) { self = EnumByteEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: UInt16) { self = EnumByteEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: UInt32) { self = EnumByteEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: UInt64) { self = EnumByteEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: EnumByteEnum) { self = EnumByteEnum(rawValue: value.rawValue) }
    init(rawValue: UInt8) { self = Self.mapValue(value: rawValue)! }

    var description: String {
        switch self {
        case .ENUM_VALUE_0: return "ENUM_VALUE_0"
        case .ENUM_VALUE_1: return "ENUM_VALUE_1"
        case .ENUM_VALUE_2: return "ENUM_VALUE_2"
        case .ENUM_VALUE_3: return "ENUM_VALUE_3"
        case .ENUM_VALUE_4: return "ENUM_VALUE_4"
        case .ENUM_VALUE_5: return "ENUM_VALUE_5"
        }
    }

    static let rawValuesMap: [RawValue: EnumByteEnum] = {
        var value = [RawValue: EnumByteEnum]()
        value[EnumByteEnum.ENUM_VALUE_0.rawValue] = .ENUM_VALUE_0
        value[EnumByteEnum.ENUM_VALUE_1.rawValue] = .ENUM_VALUE_1
        value[EnumByteEnum.ENUM_VALUE_2.rawValue] = .ENUM_VALUE_2
        value[EnumByteEnum.ENUM_VALUE_3.rawValue] = .ENUM_VALUE_3
        value[EnumByteEnum.ENUM_VALUE_4.rawValue] = .ENUM_VALUE_4
        value[EnumByteEnum.ENUM_VALUE_5.rawValue] = .ENUM_VALUE_5
        return value
    }()

    static func mapValue(value: UInt8) -> EnumByteEnum? {
        return rawValuesMap[value]
    }
}
