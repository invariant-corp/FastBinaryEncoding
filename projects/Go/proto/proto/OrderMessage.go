//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package proto

import "fmt"
import "strconv"
import "strings"
import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// Workaround for Go unused imports issue
var _ = fmt.Print
var _ = strconv.FormatInt

// OrderMessage key
type OrderMessageKey struct {
}

// Convert OrderMessage flags key to string
func (k *OrderMessageKey) String() string {
    var sb strings.Builder
    sb.WriteString("OrderMessageKey(")
    sb.WriteString(")")
    return sb.String()
}

// OrderMessage struct
type OrderMessage struct {
    Body Order `json:"body"`
}

// Create a new OrderMessage struct
func NewOrderMessage() *OrderMessage {
    return &OrderMessage{
        Body: *NewOrder(),
    }
}

// Create a new OrderMessage struct from the given field values
func NewOrderMessageFromFieldValues(Body Order) *OrderMessage {
    return &OrderMessage{Body}
}

// Create a new OrderMessage struct from JSON
func NewOrderMessageFromJSON(buffer []byte) (*OrderMessage, error) {
    result := *NewOrderMessage()
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return nil, err
    }
    return &result, nil
}

// Struct shallow copy
func (s *OrderMessage) Copy() *OrderMessage {
    var result = *s
    return &result
}

// Struct deep clone
func (s *OrderMessage) Clone() *OrderMessage {
    // Serialize the struct to the FBE stream
    writer := NewOrderMessageModel(fbe.NewEmptyBuffer())
    _, _ = writer.Serialize(s)

    // Deserialize the struct from the FBE stream
    reader := NewOrderMessageModel(writer.Buffer())
    result, _, _ := reader.Deserialize()
    return result
}

// Get the struct key
func (s *OrderMessage) Key() OrderMessageKey {
    return OrderMessageKey{
    }
}

// Convert struct to optional
func (s *OrderMessage) Optional() *OrderMessage {
    return s
}

// Get the FBE type
func (s *OrderMessage) FBEType() int { return 1 }

// Convert struct to string
func (s *OrderMessage) String() string {
    var sb strings.Builder
    sb.WriteString("OrderMessage(")
    sb.WriteString("body=")
    sb.WriteString(s.Body.String())
    sb.WriteString(")")
    return sb.String()
}

// Convert struct to JSON
func (s *OrderMessage) JSON() ([]byte, error) {
    return fbe.Json.Marshal(s)
}
