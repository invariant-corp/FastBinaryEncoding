//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

import Foundation

public struct OrderType: Comparable, Hashable, Codable {
    typealias RawValue = UInt8
    public static let market = OrderType(value: OrderTypeEnum.market)
    public static let limit = OrderType(value: OrderTypeEnum.limit)
    public static let stop = OrderType(value: OrderTypeEnum.stop)
    public static let stoplimit = OrderType(value: OrderTypeEnum.stoplimit)

    var value: OrderTypeEnum?

    public var raw: UInt8 { return value!.rawValue }

    public init() { setDefault() }
    public init(value: UInt8) { setEnum(value: value) }
    public init(value: OrderTypeEnum) { setEnum(value: value) }
    public init(value: OrderType) { setEnum(value: value) }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        setEnum(value: try container.decode(RawValue.self))
    }
    public mutating func setDefault() { setEnum(value: NSNumber(value: 0).uint8Value) }

    public mutating func setEnum(value: UInt8) { self.value = OrderTypeEnum.mapValue(value: value) }
    public mutating func setEnum(value: OrderTypeEnum) { self.value = value }
    public mutating func setEnum(value: OrderType) { self.value = value.value }

    public static func < (lhs: OrderType, rhs: OrderType) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue < rhsValue.rawValue
    }

    public static func == (lhs: OrderType, rhs: OrderType) -> Bool {
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

    public static func fromJson(_ json: String) throws -> OrderType {
        return try JSONDecoder().decode(OrderType.self, from: json.data(using: .utf8)!)
    }
}
