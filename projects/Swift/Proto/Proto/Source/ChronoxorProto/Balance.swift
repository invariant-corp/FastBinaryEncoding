//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe

public protocol BalanceBase {
    var currency: String { get set }
    var amount: Double { get set }
}

public protocol BalanceInheritance {
    var parent: Balance { get set }
}

extension BalanceInheritance {
    public var currency: String {
        get { return parent.currency }
        set { parent.currency = newValue }
    }
    public var amount: Double {
        get { return parent.amount }
        set { parent.amount = newValue }
    }
}

public struct Balance: BalanceBase, Comparable, Hashable, Codable {
    public var currency: String = ""
    public var amount: Double = 0.0

    public init() { }
    public init(currency: String, amount: Double) {

        self.currency = currency
        self.amount = amount
    }

    public init(other: Balance) {
        self.currency = other.currency
        self.amount = other.amount
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        currency = try container.decode(String.self, forKey: .currency)
        amount = try container.decode(Double.self, forKey: .amount)
    }

    public func clone() throws -> Balance {
        // Serialize the struct to the FBE stream
        let writer = BalanceModel()
        try _ = writer.serialize(value: self)

        // Deserialize the struct from the FBE stream
        let reader = BalanceModel()
        reader.attach(buffer: writer.buffer)
        return reader.deserialize()
    }

    public static func < (lhs: Balance, rhs: Balance) -> Bool {
        if !(lhs.currency < rhs.currency) { return false }
        return true
    }

    public static func == (lhs: Balance, rhs: Balance) -> Bool {
        if !(lhs.currency == rhs.currency) { return false }
        return true
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(currency)
    }

    public var description: String {
        var sb = String()
        sb.append("Balance(")
        sb.append("currency="); sb.append("\""); sb.append(currency); sb.append("\"")
        sb.append(",amount="); sb.append(amount.description)
        sb.append(")")
        return sb
    }
    private enum CodingKeys: String, CodingKey {
        case currency
        case amount
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(currency, forKey: .currency)
        try container.encode(amount, forKey: .amount)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> Balance {
        return try JSONDecoder().decode(Balance.self, from: json.data(using: .utf8)!)
    }
}
