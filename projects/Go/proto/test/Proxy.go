//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding test proxy
type Proxy struct {
    *fbe.Receiver
    protoProxy *proto.Proxy

}

// Create a new test proxy with an empty buffer
func NewProxy() *Proxy {
    return NewProxyWithBuffer(fbe.NewEmptyBuffer())
}

// Create a new test proxy with the given buffer
func NewProxyWithBuffer(buffer *fbe.Buffer) *Proxy {
    proxy := &Proxy{
        fbe.NewReceiver(buffer, false),
        proto.NewProxyWithBuffer(buffer),
    }
    proxy.SetupHandlerOnReceive(proxy)
    return proxy
}

// Imported proxy

// Get the proto proxy
func (p *Proxy) ProtoProxy() *proto.Proxy { return p.protoProxy }
// Set the proto proxy
func (p *Proxy) SetProtoProxy(proxy *proto.Proxy) { p.protoProxy = proxy }

// Setup handlers
func (p *Proxy) SetupHandlers(handlers interface{}) {
    p.Receiver.SetupHandlers(handlers)
    p.protoProxy.SetupHandlers(handlers)
}


// Receive message handler
func (p *Proxy) OnReceive(fbeType int, buffer []byte) (bool, error) {
    switch fbeType {
    default:
        _ = fbeType
        break
    }

    if p.protoProxy != nil {
        if ok, err := p.protoProxy.OnReceive(fbeType, buffer); ok {
            return ok, err
        }
    }

    return false, nil
}
