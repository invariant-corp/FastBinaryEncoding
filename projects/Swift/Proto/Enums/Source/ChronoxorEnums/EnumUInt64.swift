//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

import Foundation

public struct EnumUInt64: Comparable, Hashable, Codable {
    typealias RawValue = UInt64
    public static let ENUM_VALUE_0 = EnumUInt64(value: EnumUInt64Enum.ENUM_VALUE_0)
    public static let ENUM_VALUE_1 = EnumUInt64(value: EnumUInt64Enum.ENUM_VALUE_1)
    public static let ENUM_VALUE_2 = EnumUInt64(value: EnumUInt64Enum.ENUM_VALUE_2)
    public static let ENUM_VALUE_3 = EnumUInt64(value: EnumUInt64Enum.ENUM_VALUE_3)
    public static let ENUM_VALUE_4 = EnumUInt64(value: EnumUInt64Enum.ENUM_VALUE_4)
    public static let ENUM_VALUE_5 = EnumUInt64(value: EnumUInt64Enum.ENUM_VALUE_5)

    var value: EnumUInt64Enum?

    public var raw: UInt64 { return value!.rawValue }

    public init() { setDefault() }
    public init(value: UInt64) { setEnum(value: value) }
    public init(value: EnumUInt64Enum) { setEnum(value: value) }
    public init(value: EnumUInt64) { setEnum(value: value) }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        setEnum(value: try container.decode(RawValue.self))
    }
    public mutating func setDefault() { setEnum(value: NSNumber(value: 0).uint64Value) }

    public mutating func setEnum(value: UInt64) { self.value = EnumUInt64Enum.mapValue(value: value) }
    public mutating func setEnum(value: EnumUInt64Enum) { self.value = value }
    public mutating func setEnum(value: EnumUInt64) { self.value = value.value }

    public static func < (lhs: EnumUInt64, rhs: EnumUInt64) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue < rhsValue.rawValue
    }

    public static func == (lhs: EnumUInt64, rhs: EnumUInt64) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue == rhsValue.rawValue
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(value?.rawValue ?? 0)
    }

    public var description: String {
        return value?.description ?? "<unknown>"
    }
    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        try container.encode(raw)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> EnumUInt64 {
        return try JSONDecoder().decode(EnumUInt64.self, from: json.data(using: .utf8)!)
    }
}
