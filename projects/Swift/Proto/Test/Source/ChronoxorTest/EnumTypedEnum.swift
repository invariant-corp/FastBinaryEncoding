//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

import Foundation

public enum EnumTypedEnum {
    typealias RawValue = UInt8
    case ENUM_VALUE_0
    case ENUM_VALUE_1
    case ENUM_VALUE_2
    case ENUM_VALUE_3
    case ENUM_VALUE_4
    case ENUM_VALUE_5

    var rawValue: RawValue {
        switch self {
        case .ENUM_VALUE_0: return "0".utf8.map { UInt8($0) }[0] + 0
        case .ENUM_VALUE_1: return "1".utf8.map { UInt8($0) }[0] + 0
        case .ENUM_VALUE_2: return "1".utf8.map { UInt8($0) }[0] + 1
        case .ENUM_VALUE_3: return "3".utf8.map { UInt8($0) }[0] + 0
        case .ENUM_VALUE_4: return "3".utf8.map { UInt8($0) }[0] + 1
        case .ENUM_VALUE_5: return Self.ENUM_VALUE_3.rawValue
        }
    }

    init(value: Character) { self = EnumTypedEnum(rawValue: NSNumber(value: Int(String(value))!).uint8Value ) }
    init(value: Int8) { self = EnumTypedEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: Int16) { self = EnumTypedEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: Int32) { self = EnumTypedEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: Int64) { self = EnumTypedEnum(rawValue: NSNumber(value: value).uint8Value) }
    init(value: EnumTypedEnum) { self = EnumTypedEnum(rawValue: value.rawValue) }
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

    static let rawValuesMap: [RawValue: EnumTypedEnum] = {
        var value = [RawValue: EnumTypedEnum]()
        value[EnumTypedEnum.ENUM_VALUE_0.rawValue] = .ENUM_VALUE_0
        value[EnumTypedEnum.ENUM_VALUE_1.rawValue] = .ENUM_VALUE_1
        value[EnumTypedEnum.ENUM_VALUE_2.rawValue] = .ENUM_VALUE_2
        value[EnumTypedEnum.ENUM_VALUE_3.rawValue] = .ENUM_VALUE_3
        value[EnumTypedEnum.ENUM_VALUE_4.rawValue] = .ENUM_VALUE_4
        value[EnumTypedEnum.ENUM_VALUE_5.rawValue] = .ENUM_VALUE_5
        return value
    }()

    static func mapValue(value: UInt8) -> EnumTypedEnum? {
        return rawValuesMap[value]
    }
}
