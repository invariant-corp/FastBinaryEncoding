//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe
import ChronoxorProto

public protocol StructHashBase {
    var f1: Dictionary<String, UInt8> { get set }
    var f2: Dictionary<String, UInt8?> { get set }
    var f3: Dictionary<String, Data> { get set }
    var f4: Dictionary<String, Data?> { get set }
    var f5: Dictionary<String, EnumSimple> { get set }
    var f6: Dictionary<String, EnumSimple?> { get set }
    var f7: Dictionary<String, FlagsSimple> { get set }
    var f8: Dictionary<String, FlagsSimple?> { get set }
    var f9: Dictionary<String, StructSimple> { get set }
    var f10: Dictionary<String, StructSimple?> { get set }
}

public protocol StructHashInheritance {
    var parent: StructHash { get set }
}

extension StructHashInheritance {
    public var f1: Dictionary<String, UInt8> {
        get { return parent.f1 }
        set { parent.f1 = newValue }
    }
    public var f2: Dictionary<String, UInt8?> {
        get { return parent.f2 }
        set { parent.f2 = newValue }
    }
    public var f3: Dictionary<String, Data> {
        get { return parent.f3 }
        set { parent.f3 = newValue }
    }
    public var f4: Dictionary<String, Data?> {
        get { return parent.f4 }
        set { parent.f4 = newValue }
    }
    public var f5: Dictionary<String, EnumSimple> {
        get { return parent.f5 }
        set { parent.f5 = newValue }
    }
    public var f6: Dictionary<String, EnumSimple?> {
        get { return parent.f6 }
        set { parent.f6 = newValue }
    }
    public var f7: Dictionary<String, FlagsSimple> {
        get { return parent.f7 }
        set { parent.f7 = newValue }
    }
    public var f8: Dictionary<String, FlagsSimple?> {
        get { return parent.f8 }
        set { parent.f8 = newValue }
    }
    public var f9: Dictionary<String, StructSimple> {
        get { return parent.f9 }
        set { parent.f9 = newValue }
    }
    public var f10: Dictionary<String, StructSimple?> {
        get { return parent.f10 }
        set { parent.f10 = newValue }
    }
}

public struct StructHash: StructHashBase, Comparable, Hashable, Codable {
    public var f1: Dictionary<String, UInt8> = Dictionary()
    public var f2: Dictionary<String, UInt8?> = Dictionary()
    public var f3: Dictionary<String, Data> = Dictionary()
    public var f4: Dictionary<String, Data?> = Dictionary()
    public var f5: Dictionary<String, EnumSimple> = Dictionary()
    public var f6: Dictionary<String, EnumSimple?> = Dictionary()
    public var f7: Dictionary<String, FlagsSimple> = Dictionary()
    public var f8: Dictionary<String, FlagsSimple?> = Dictionary()
    public var f9: Dictionary<String, StructSimple> = Dictionary()
    public var f10: Dictionary<String, StructSimple?> = Dictionary()

    public init() { }
    public init(f1: Dictionary<String, UInt8>, f2: Dictionary<String, UInt8?>, f3: Dictionary<String, Data>, f4: Dictionary<String, Data?>, f5: Dictionary<String, EnumSimple>, f6: Dictionary<String, EnumSimple?>, f7: Dictionary<String, FlagsSimple>, f8: Dictionary<String, FlagsSimple?>, f9: Dictionary<String, StructSimple>, f10: Dictionary<String, StructSimple?>) {

        self.f1 = f1
        self.f2 = f2
        self.f3 = f3
        self.f4 = f4
        self.f5 = f5
        self.f6 = f6
        self.f7 = f7
        self.f8 = f8
        self.f9 = f9
        self.f10 = f10
    }

    public init(other: StructHash) {
        self.f1 = other.f1
        self.f2 = other.f2
        self.f3 = other.f3
        self.f4 = other.f4
        self.f5 = other.f5
        self.f6 = other.f6
        self.f7 = other.f7
        self.f8 = other.f8
        self.f9 = other.f9
        self.f10 = other.f10
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        f1 = try container.decode(Dictionary<String, UInt8>.self, forKey: .f1)
        f2 = try container.decode(Dictionary<String, UInt8?>.self, forKey: .f2)
        f3 = try container.decode(Dictionary<String, Data>.self, forKey: .f3)
        f4 = try container.decode(Dictionary<String, Data?>.self, forKey: .f4)
        f5 = try container.decode(Dictionary<String, ChronoxorTest.EnumSimple>.self, forKey: .f5)
        f6 = try container.decode(Dictionary<String, ChronoxorTest.EnumSimple?>.self, forKey: .f6)
        f7 = try container.decode(Dictionary<String, ChronoxorTest.FlagsSimple>.self, forKey: .f7)
        f8 = try container.decode(Dictionary<String, ChronoxorTest.FlagsSimple?>.self, forKey: .f8)
        f9 = try container.decode(Dictionary<String, ChronoxorTest.StructSimple>.self, forKey: .f9)
        f10 = try container.decode(Dictionary<String, ChronoxorTest.StructSimple?>.self, forKey: .f10)
    }

    public func clone() throws -> StructHash {
        // Serialize the struct to the FBE stream
        let writer = StructHashModel()
        try _ = writer.serialize(value: self)

        // Deserialize the struct from the FBE stream
        let reader = StructHashModel()
        reader.attach(buffer: writer.buffer)
        return reader.deserialize()
    }

    public static func < (lhs: StructHash, rhs: StructHash) -> Bool {
        return true
    }

    public static func == (lhs: StructHash, rhs: StructHash) -> Bool {
        return true
    }

    public func hash(into hasher: inout Hasher) {
    }

    public var description: String {
        var sb = String()
        sb.append("StructHash(")
        if true {
            var first = true
            sb.append("f1=["); sb.append(f1.count.description); sb.append("][{")
            for (key, value) in f1 {
                sb.append(first ? "" : ","); sb.append("\""); sb.append(key); sb.append("\"")
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
                sb.append(first ? "" : ","); sb.append("\""); sb.append(key); sb.append("\"")
                sb.append("->")
                 if let value = value { sb.append(value.description) } else { sb.append("null") }
                first = false
            }
            sb.append("}]")
        }
        if true {
            var first = true
            sb.append(",f3=["); sb.append(f3.count.description); sb.append("][{")
            for (key, value) in f3 {
                sb.append(first ? "" : ","); sb.append("\""); sb.append(key); sb.append("\"")
                sb.append("->")
                sb.append("bytes["); sb.append("\(value.count)"); sb.append("]")
                first = false
            }
            sb.append("}]")
        }
        if true {
            var first = true
            sb.append(",f4=["); sb.append(f4.count.description); sb.append("][{")
            for (key, value) in f4 {
                sb.append(first ? "" : ","); sb.append("\""); sb.append(key); sb.append("\"")
                sb.append("->")
                 if let value = value { sb.append("bytes["); sb.append("\(value.count)"); sb.append("]") } else { sb.append("null") }
                first = false
            }
            sb.append("}]")
        }
        if true {
            var first = true
            sb.append(",f5=["); sb.append(f5.count.description); sb.append("][{")
            for (key, value) in f5 {
                sb.append(first ? "" : ","); sb.append("\""); sb.append(key); sb.append("\"")
                sb.append("->")
                sb.append(value.description)
                first = false
            }
            sb.append("}]")
        }
        if true {
            var first = true
            sb.append(",f6=["); sb.append(f6.count.description); sb.append("][{")
            for (key, value) in f6 {
                sb.append(first ? "" : ","); sb.append("\""); sb.append(key); sb.append("\"")
                sb.append("->")
                 if let value = value { sb.append(value.description) } else { sb.append("null") }
                first = false
            }
            sb.append("}]")
        }
        if true {
            var first = true
            sb.append(",f7=["); sb.append(f7.count.description); sb.append("][{")
            for (key, value) in f7 {
                sb.append(first ? "" : ","); sb.append("\""); sb.append(key); sb.append("\"")
                sb.append("->")
                sb.append(value.description)
                first = false
            }
            sb.append("}]")
        }
        if true {
            var first = true
            sb.append(",f8=["); sb.append(f8.count.description); sb.append("][{")
            for (key, value) in f8 {
                sb.append(first ? "" : ","); sb.append("\""); sb.append(key); sb.append("\"")
                sb.append("->")
                 if let value = value { sb.append(value.description) } else { sb.append("null") }
                first = false
            }
            sb.append("}]")
        }
        if true {
            var first = true
            sb.append(",f9=["); sb.append(f9.count.description); sb.append("][{")
            for (key, value) in f9 {
                sb.append(first ? "" : ","); sb.append("\""); sb.append(key); sb.append("\"")
                sb.append("->")
                sb.append(value.description)
                first = false
            }
            sb.append("}]")
        }
        if true {
            var first = true
            sb.append(",f10=["); sb.append(f10.count.description); sb.append("][{")
            for (key, value) in f10 {
                sb.append(first ? "" : ","); sb.append("\""); sb.append(key); sb.append("\"")
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
        case f3
        case f4
        case f5
        case f6
        case f7
        case f8
        case f9
        case f10
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(f1, forKey: .f1)
        try container.encode(f2, forKey: .f2)
        try container.encode(f3, forKey: .f3)
        try container.encode(f4, forKey: .f4)
        try container.encode(f5, forKey: .f5)
        try container.encode(f6, forKey: .f6)
        try container.encode(f7, forKey: .f7)
        try container.encode(f8, forKey: .f8)
        try container.encode(f9, forKey: .f9)
        try container.encode(f10, forKey: .f10)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> StructHash {
        return try JSONDecoder().decode(StructHash.self, from: json.data(using: .utf8)!)
    }
}
