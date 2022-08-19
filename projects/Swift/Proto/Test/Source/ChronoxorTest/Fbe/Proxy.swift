//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding Test proxy
open class Proxy: ChronoxorFbe.ReceiverProtocol {
    // Imported proxy
    let ProtoProxy: ChronoxorProto.Proxy?

    // Proxy models accessors

    public var buffer: Buffer = Buffer()
    public var final: Bool = false

    public init() {
        ProtoProxy = ChronoxorProto.Proxy(buffer: buffer)
        build(final: false)
    }

    public init(buffer: ChronoxorFbe.Buffer) {
        ProtoProxy = ChronoxorProto.Proxy(buffer: buffer)
        build(with: buffer, final: false)
    }

    open func onReceive(type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        guard let listener = self as? ProxyListener else { return false }
        return onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size)
    }

    open func onReceiveListener(listener: ProxyListener, type: Int, buffer: Data, offset: Int, size: Int) -> Bool {

        if let ProtoProxy = ProtoProxy, ProtoProxy.onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size) {
            return true
        }

        return false
    }
}
