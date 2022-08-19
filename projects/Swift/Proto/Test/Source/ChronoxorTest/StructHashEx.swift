//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe
import ChronoxorProto

public protocol StructHashExBase {
    var f1: Dictionary<StructSimple, StructNested> { get set }
    var f2: Dictionary<StructSimple, StructNested?> { get set }
}

public protocol StructHashExInheritance {
    var parent: StructHashEx { get set }
}

extension StructHashExInheritance {
    public var f1: Dictionary<StructSimple, StructNested> {
        get { return parent.f1 }
        set { parent.f1 = newValue }
    }
    public var f2: Dictionary<StructSimple, StructNested?> {
        get { return parent.f2 }
        set { parent.f2 = newValue }
    }
}

public struct StructHashEx: StructHashExBase, Comparable, Hashable, Codable {
    public var f1: Dictionary<StructSimple, StructNested> = Dictionary()
    public var f2: Dictionary<StructSimple, StructNested?> = Dictionary()

    public init() { }
    public init(f1: Dictionary<StructSimple, StructNested>, f2: Dictionary<StructSimple, StructNested?>) {

        self.f1 = f1
        self.f2 = f2
    }

    public init(other: StructHashEx) {
        self.f1 = other.f1
        self.f2 = other.f2
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        f1 = try container.decode(Dictionary<ChronoxorTest.StructSimple, ChronoxorTest.StructNested>.self, forKey: .f1)
        f2 = try container.decode(Dictionary<ChronoxorTest.StructSimple, ChronoxorTest.StructNested?>.self, forKey: .f2)
    }

    public func clone() throws -> StructHashEx {
        // Serialize the struct to the FBE stream
        let writer = StructHashExModel()
        try _ = writer.serialize(value: self)

        // Deserialize the struct from the FBE stream
        let reader = StructHashExModel()
        reader.attach(buffer: writer.buffer)
        return reader.deserialize()
    }

    public static func < (lhs: StructHashEx, rhs: StructHashEx) -> Bool {
        return true
    }

    public static func == (lhs: StructHashEx, rhs: StructHashEx) -> Bool {
        return true
    }

    public func hash(into hasher: inout Hasher) {
    }

    public var description: String {
        var sb = String()
        sb.append("StructHashEx(")
        if true {
            var first = true
            sb.append("f1=["); sb.append(f1.count.description); sb.append("][{")
            for (key, value) in f1 {
                sb.append(first ? "" : ","); sb.append(key.description)
                sb.append("->")
                sb.append(value.description)
                first = false
            }
            sb.append("}]")
        }
        if true {
            var first = true
            sb.append(",f2=["); sb.append(f2.count.description); sb.append("][{")
            for (key, value) in f2 {
                sb.append(first ? "" : ","); sb.append(key.description)
                sb.append("->")
                 if let value = value { sb.append(value.description) } else { sb.append("null") }
                first = false
            }
            sb.append("}]")
        }
        sb.append(")")
        return sb
    }
    private enum CodingKeys: String, CodingKey {
        case f1
        case f2
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(f1, forKey: .f1)
        try container.encode(f2, forKey: .f2)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> StructHashEx {
        return try JSONDecoder().decode(StructHashEx.self, from: json.data(using: .utf8)!)
    }
}
