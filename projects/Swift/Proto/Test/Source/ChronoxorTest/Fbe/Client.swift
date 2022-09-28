//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding Test client
open class Client: ChronoxorFbe.ClientProtocol {
    // Imported clients
    let ProtoClient: ChronoxorProto.Client

    // Client sender models accessors

    // Client receiver values accessors

    // Client receiver models accessors

    public var sendBuffer: Buffer = Buffer()
    public var receiveBuffer: Buffer = Buffer()
    public var final: Bool = false

    public init() {
        ProtoClient = ChronoxorProto.Client(sendBuffer: sendBuffer, receiveBuffer: receiveBuffer)
        build(with: false)
    }

    public init(sendBuffer: ChronoxorFbe.Buffer, receiveBuffer: ChronoxorFbe.Buffer) {
        ProtoClient = ChronoxorProto.Client(sendBuffer: sendBuffer, receiveBuffer: receiveBuffer)
        build(with: sendBuffer, receiveBuffer: receiveBuffer, final: false)
    }

    public func send(obj: Any) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(obj: obj, listener: listener)
    }

    public func send(obj: Any, listener: ChronoxorFbe.SenderListener) throws -> Int {

        // Try to send using imported clients
        var result: Int = 0
        result = try ProtoClient.send(obj: obj, listener: listener)
        if result > 0 { return result }

        return 0
    }
    open func onReceive(type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        guard let listener = self as? ReceiverListener else { return false }
        return onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size)
    }

    open func onReceiveListener(listener: ReceiverListener, type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        switch type {
        default: break
        }

        if ProtoClient.onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size) {
            return true
        }

        return false
    }
}
