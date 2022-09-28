//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package protoex

import "fmt"
import "strconv"
import "strings"
import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Workaround for Go unused imports issue
var _ = fmt.Print
var _ = strconv.FormatInt

// Order key
type OrderKey struct {
    Id int32
}

// Convert Order flags key to string
func (k *OrderKey) String() string {
    var sb strings.Builder
    sb.WriteString("OrderKey(")
    sb.WriteString("id=")
    sb.WriteString(strconv.FormatInt(int64(k.Id), 10))
    sb.WriteString(")")
    return sb.String()
}

// Order struct
type Order struct {
    Id int32 `json:"id"`
    Symbol string `json:"symbol"`
    Side OrderSide `json:"side"`
    Type OrderType `json:"type"`
    Price float64 `json:"price"`
    Volume float64 `json:"volume"`
    Tp float64 `json:"tp"`
    Sl float64 `json:"sl"`
}

// Create a new Order struct
func NewOrder() *Order {
    return &Order{
        Id: 0,
        Symbol: "",
        Side: *NewOrderSide(),
        Type: *NewOrderType(),
        Price: float64(0.0),
        Volume: float64(0.0),
        Tp: float64(10.0),
        Sl: float64(-10.0),
    }
}

// Create a new Order struct from the given field values
func NewOrderFromFieldValues(Id int32, Symbol string, Side OrderSide, Type OrderType, Price float64, Volume float64, Tp float64, Sl float64) *Order {
    return &Order{Id, Symbol, Side, Type, Price, Volume, Tp, Sl}
}

// Create a new Order struct from JSON
func NewOrderFromJSON(buffer []byte) (*Order, error) {
    result := *NewOrder()
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return nil, err
    }
    return &result, nil
}

// Struct shallow copy
func (s *Order) Copy() *Order {
    var result = *s
    return &result
}

// Struct deep clone
func (s *Order) Clone() *Order {
    // Serialize the struct to the FBE stream
    writer := NewOrderModel(fbe.NewEmptyBuffer())
    _, _ = writer.Serialize(s)

    // Deserialize the struct from the FBE stream
    reader := NewOrderModel(writer.Buffer())
    result, _, _ := reader.Deserialize()
    return result
}

// Get the struct key
func (s *Order) Key() OrderKey {
    return OrderKey{
        Id: s.Id,
    }
}

// Convert struct to optional
func (s *Order) Optional() *Order {
    return s
}

// Get the FBE type
func (s *Order) FBEType() int { return 1 }

// Convert struct to string
func (s *Order) String() string {
    var sb strings.Builder
    sb.WriteString("Order(")
    sb.WriteString("id=")
    sb.WriteString(strconv.FormatInt(int64(s.Id), 10))
    sb.WriteString(",symbol=")
    sb.WriteString("\"" + s.Symbol + "\"")
    sb.WriteString(",side=")
    sb.WriteString(s.Side.String())
    sb.WriteString(",type=")
    sb.WriteString(s.Type.String())
    sb.WriteString(",price=")
    sb.WriteString(strconv.FormatFloat(float64(s.Price), 'g', -1, 64))
    sb.WriteString(",volume=")
    sb.WriteString(strconv.FormatFloat(float64(s.Volume), 'g', -1, 64))
    sb.WriteString(",tp=")
    sb.WriteString(strconv.FormatFloat(float64(s.Tp), 'g', -1, 64))
    sb.WriteString(",sl=")
    sb.WriteString(strconv.FormatFloat(float64(s.Sl), 'g', -1, 64))
    sb.WriteString(")")
    return sb.String()
}

// Convert struct to JSON
func (s *Order) JSON() ([]byte, error) {
    return fbe.Json.Marshal(s)
}
