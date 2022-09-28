//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

import Foundation

public struct StateExEnum: OptionSet {
    public static let unknown = StateExEnum(rawValue: 0x00)
    public static let invalid = StateExEnum(rawValue: 0x01)
    public static let initialized = StateExEnum(rawValue: 0x02)
    public static let calculated = StateExEnum(rawValue: 0x04)
    public static let broken = StateExEnum(rawValue: 0x08)
    public static let happy = StateExEnum(rawValue: 0x10)
    public static let sad = StateExEnum(rawValue: 0x20)
    public static let good = StateExEnum(rawValue: Self.initialized.rawValue | Self.calculated.rawValue)
    public static let bad = StateExEnum(rawValue: Self.unknown.rawValue | Self.invalid.rawValue | Self.broken.rawValue)

    public var rawValue: UInt8

    public init(rawValue: UInt8) { self.rawValue = rawValue }
    public init(value: UInt8) { self.rawValue = NSNumber(value: value).uint8Value }
    public init(value: UInt16) { self.rawValue = NSNumber(value: value).uint8Value }
    public init(value: UInt32) { self.rawValue = NSNumber(value: value).uint8Value }
    public init(value: UInt64) { self.rawValue = NSNumber(value: value).uint8Value }
    public init(value: StateExEnum) { self.rawValue = value.rawValue }

    public func hasFlags(flags: UInt8) -> Bool { return ((NSNumber(value: rawValue).intValue & NSNumber(value: flags).intValue) != 0) && (NSNumber(value: rawValue).intValue & NSNumber(value: flags).intValue == NSNumber(value: flags).intValue) }
    public func hasFlags(flags: StateExEnum) -> Bool { return hasFlags(flags: flags.rawValue) }

    public static let allSet: StateExEnum = [
        .unknown,
        .invalid,
        .initialized,
        .calculated,
        .broken,
        .happy,
        .sad,
        .good,
        .bad,
    ]
    public static let noneSet: StateExEnum = []
    public var currentSet: StateExEnum {
        var result = StateExEnum.noneSet
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateExEnum.unknown.rawValue).intValue) != 0 {
            result = result.union(.unknown)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateExEnum.invalid.rawValue).intValue) != 0 {
            result = result.union(.invalid)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateExEnum.initialized.rawValue).intValue) != 0 {
            result = result.union(.initialized)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateExEnum.calculated.rawValue).intValue) != 0 {
            result = result.union(.calculated)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateExEnum.broken.rawValue).intValue) != 0 {
            result = result.union(.broken)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateExEnum.happy.rawValue).intValue) != 0 {
            result = result.union(.happy)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateExEnum.sad.rawValue).intValue) != 0 {
            result = result.union(.sad)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateExEnum.good.rawValue).intValue) != 0 {
            result = result.union(.good)
        }
        if (NSNumber(value: rawValue).intValue & NSNumber(value: StateExEnum.bad.rawValue).intValue) != 0 {
            result = result.union(.bad)
        }
        return result
    }

    public var description: String {
        var sb = String()
        var first = true
        if hasFlags(flags: .unknown) {
            sb.append(first ? "" : "|"); sb.append("unknown")
            first = false
        }
        if hasFlags(flags: .invalid) {
            sb.append(first ? "" : "|"); sb.append("invalid")
            first = false
        }
        if hasFlags(flags: .initialized) {
            sb.append(first ? "" : "|"); sb.append("initialized")
            first = false
        }
        if hasFlags(flags: .calculated) {
            sb.append(first ? "" : "|"); sb.append("calculated")
            first = false
        }
        if hasFlags(flags: .broken) {
            sb.append(first ? "" : "|"); sb.append("broken")
            first = false
        }
        if hasFlags(flags: .happy) {
            sb.append(first ? "" : "|"); sb.append("happy")
            first = false
        }
        if hasFlags(flags: .sad) {
            sb.append(first ? "" : "|"); sb.append("sad")
            first = false
        }
        if hasFlags(flags: .good) {
            sb.append(first ? "" : "|"); sb.append("good")
            first = false
        }
        if hasFlags(flags: .bad) {
            sb.append(first ? "" : "|"); sb.append("bad")
            first = false
        }
        return sb
    }

    static let rawValuesMap: [RawValue: StateExEnum] = {
        var value = [RawValue: StateExEnum]()
        value[StateExEnum.unknown.rawValue] = .unknown
        value[StateExEnum.invalid.rawValue] = .invalid
        value[StateExEnum.initialized.rawValue] = .initialized
        value[StateExEnum.calculated.rawValue] = .calculated
        value[StateExEnum.broken.rawValue] = .broken
        value[StateExEnum.happy.rawValue] = .happy
        value[StateExEnum.sad.rawValue] = .sad
        value[StateExEnum.good.rawValue] = .good
        value[StateExEnum.bad.rawValue] = .bad
        return value
    }()

    public static func mapValue(value: RawValue) -> StateExEnum? {
        return rawValuesMap[value]
    }
}
