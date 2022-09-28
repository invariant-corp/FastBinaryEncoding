//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe
import ChronoxorProto

public protocol OrderMessageBase {
    var body: Order { get set }
}

public protocol OrderMessageInheritance {
    var parent: OrderMessage { get set }
}

extension OrderMessageInheritance {
    public var body: Order {
        get { return parent.body }
        set { parent.body = newValue }
    }
}

public struct OrderMessage: OrderMessageBase, Comparable, Hashable, Codable {
    public var body: Order = ChronoxorProtoex.Order()

    public init() { }
    public init(body: Order) {

        self.body = body
    }

    public init(other: OrderMessage) {
        self.body = other.body
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        body = try container.decode(ChronoxorProtoex.Order.self, forKey: .body)
    }

    public func clone() throws -> OrderMessage {
        // Serialize the struct to the FBE stream
        let writer = OrderMessageModel()
        try _ = writer.serialize(value: self)

        // Deserialize the struct from the FBE stream
        let reader = OrderMessageModel()
        reader.attach(buffer: writer.buffer)
        return reader.deserialize()
    }

    public static func < (lhs: OrderMessage, rhs: OrderMessage) -> Bool {
        return true
    }

    public static func == (lhs: OrderMessage, rhs: OrderMessage) -> Bool {
        return true
    }

    public func hash(into hasher: inout Hasher) {
    }

    public var description: String {
        var sb = String()
        sb.append("OrderMessage(")
        sb.append("body="); sb.append(body.description)
        sb.append(")")
        return sb
    }
    private enum CodingKeys: String, CodingKey {
        case body
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(body, forKey: .body)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> OrderMessage {
        return try JSONDecoder().decode(OrderMessage.self, from: json.data(using: .utf8)!)
    }
}
