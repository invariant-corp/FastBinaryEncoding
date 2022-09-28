//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package enums

import "errors"
import "../fbe"

// Fast Binary Encoding EnumWChar field model
type FieldModelEnumWChar struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int
}

// Create a new EnumWChar field model
func NewFieldModelEnumWChar(buffer *fbe.Buffer, offset int) *FieldModelEnumWChar {
    return &FieldModelEnumWChar{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelEnumWChar) FBESize() int { return 4 }
// Get the field extra size
func (fm *FieldModelEnumWChar) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelEnumWChar) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelEnumWChar) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelEnumWChar) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelEnumWChar) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FieldModelEnumWChar) Verify() bool { return true }

// Get the value
func (fm *FieldModelEnumWChar) Get() (*EnumWChar, error) {
    var value EnumWChar
    return &value, fm.GetValueDefault(&value, EnumWChar(0))
}

// Get the value with provided default value
func (fm *FieldModelEnumWChar) GetDefault(defaults EnumWChar) (*EnumWChar, error) {
    var value EnumWChar
    err := fm.GetValueDefault(&value, defaults)
    return &value, err
}

// Get the value by the given pointer
func (fm *FieldModelEnumWChar) GetValue(value *EnumWChar) error {
    return fm.GetValueDefault(value, EnumWChar(0))
}

// Get the value by the given pointer with provided default value
func (fm *FieldModelEnumWChar) GetValueDefault(value *EnumWChar, defaults EnumWChar) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return nil
    }

    *value = EnumWChar(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return nil
}

// Set the value by the given pointer
func (fm *FieldModelEnumWChar) Set(value *EnumWChar) error {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FieldModelEnumWChar) SetValue(value EnumWChar) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint32(value))
    return nil
}
