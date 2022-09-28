//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

import Foundation

public struct EnumInt32: Comparable, Hashable, Codable {
    typealias RawValue = Int32
    public static let ENUM_VALUE_0 = EnumInt32(value: EnumInt32Enum.ENUM_VALUE_0)
    public static let ENUM_VALUE_1 = EnumInt32(value: EnumInt32Enum.ENUM_VALUE_1)
    public static let ENUM_VALUE_2 = EnumInt32(value: EnumInt32Enum.ENUM_VALUE_2)
    public static let ENUM_VALUE_3 = EnumInt32(value: EnumInt32Enum.ENUM_VALUE_3)
    public static let ENUM_VALUE_4 = EnumInt32(value: EnumInt32Enum.ENUM_VALUE_4)
    public static let ENUM_VALUE_5 = EnumInt32(value: EnumInt32Enum.ENUM_VALUE_5)

    var value: EnumInt32Enum?

    public var raw: Int32 { return value!.rawValue }

    public init() { setDefault() }
    public init(value: Int32) { setEnum(value: value) }
    public init(value: EnumInt32Enum) { setEnum(value: value) }
    public init(value: EnumInt32) { setEnum(value: value) }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        setEnum(value: try container.decode(RawValue.self))
    }
    public mutating func setDefault() { setEnum(value: NSNumber(value: 0).int32Value) }

    public mutating func setEnum(value: Int32) { self.value = EnumInt32Enum.mapValue(value: value) }
    public mutating func setEnum(value: EnumInt32Enum) { self.value = value }
    public mutating func setEnum(value: EnumInt32) { self.value = value.value }

    public static func < (lhs: EnumInt32, rhs: EnumInt32) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue < rhsValue.rawValue
    }

    public static func == (lhs: EnumInt32, rhs: EnumInt32) -> Bool {
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

    public static func fromJson(_ json: String) throws -> EnumInt32 {
        return try JSONDecoder().decode(EnumInt32.self, from: json.data(using: .utf8)!)
    }
}
