//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

package test

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

// StructEmpty key
type StructEmptyKey struct {
}

// Convert StructEmpty flags key to string
func (k *StructEmptyKey) String() string {
    var sb strings.Builder
    sb.WriteString("StructEmptyKey(")
    sb.WriteString(")")
    return sb.String()
}

// StructEmpty struct
type StructEmpty struct {
}

// Create a new StructEmpty struct
func NewStructEmpty() *StructEmpty {
    return &StructEmpty{
    }
}

// Create a new StructEmpty struct from the given field values
func NewStructEmptyFromFieldValues() *StructEmpty {
    return &StructEmpty{}
}

// Create a new StructEmpty struct from JSON
func NewStructEmptyFromJSON(buffer []byte) (*StructEmpty, error) {
    result := *NewStructEmpty()
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return nil, err
    }
    return &result, nil
}

// Struct shallow copy
func (s *StructEmpty) Copy() *StructEmpty {
    var result = *s
    return &result
}

// Struct deep clone
func (s *StructEmpty) Clone() *StructEmpty {
    // Serialize the struct to the FBE stream
    writer := NewStructEmptyModel(fbe.NewEmptyBuffer())
    _, _ = writer.Serialize(s)

    // Deserialize the struct from the FBE stream
    reader := NewStructEmptyModel(writer.Buffer())
    result, _, _ := reader.Deserialize()
    return result
}

// Get the struct key
func (s *StructEmpty) Key() StructEmptyKey {
    return StructEmptyKey{
    }
}

// Convert struct to optional
func (s *StructEmpty) Optional() *StructEmpty {
    return s
}

// Get the FBE type
func (s *StructEmpty) FBEType() int { return 143 }

// Convert struct to string
func (s *StructEmpty) String() string {
    var sb strings.Builder
    sb.WriteString("StructEmpty(")
    sb.WriteString(")")
    return sb.String()
}

// Convert struct to JSON
func (s *StructEmpty) JSON() ([]byte, error) {
    return fbe.Json.Marshal(s)
}
