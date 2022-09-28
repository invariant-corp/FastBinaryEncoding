//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package enums

import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// Fast Binary Encoding Enums model
type EnumsModel struct {
    // Model buffer
    buffer *fbe.Buffer

    // Field model
    model *FieldModelEnums
}

// Create a new Enums model
func NewEnumsModel(buffer *fbe.Buffer) *EnumsModel {
    return &EnumsModel{buffer: buffer, model: NewFieldModelEnums(buffer, 4)}
}

// Get the model buffer
func (m *EnumsModel) Buffer() *fbe.Buffer { return m.buffer }
// Get the field model
func (m *EnumsModel) Model() *FieldModelEnums { return m.model }

// Get the model size
func (m *EnumsModel) FBESize() int { return m.model.FBESize() + m.model.FBEExtra() }
// // Get the model type
func (m *EnumsModel) FBEType() int { return m.model.FBEType() }

// Check if the struct value is valid
func (m *EnumsModel) Verify() bool {
    if (m.buffer.Offset() + m.model.FBEOffset() - 4) > m.buffer.Size() {
        return false
    }

    fbeFullSize := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4))
    if fbeFullSize < m.model.FBESize() {
        return false
    }

    return m.model.Verify()
}

// Create a new model (begin phase)
func (m *EnumsModel) CreateBegin() int {
    fbeBegin := m.buffer.Allocate(4 + m.model.FBESize())
    return fbeBegin
}

// Create a new model (end phase)
func (m *EnumsModel) CreateEnd(fbeBegin int) int {
    fbeEnd := m.buffer.Size()
    fbeFullSize := fbeEnd - fbeBegin
    fbe.WriteUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4, uint32(fbeFullSize))
    return fbeFullSize
}

// Serialize the struct value
func (m *EnumsModel) Serialize(value *Enums) (int, error) {
    fbeBegin := m.CreateBegin()
    err := m.model.Set(value)
    fbeFullSize := m.CreateEnd(fbeBegin)
    return fbeFullSize, err
}

// Deserialize the struct value
func (m *EnumsModel) Deserialize() (*Enums, int, error) {
    value := NewEnums()
    fbeFullSize, err := m.DeserializeValue(value)
    return value, fbeFullSize, err
}

// Deserialize the struct value by the given pointer
func (m *EnumsModel) DeserializeValue(value *Enums) (int, error) {
    if (m.buffer.Offset() + m.model.FBEOffset() - 4) > m.buffer.Size() {
        value = NewEnums()
        return 0, nil
    }

    fbeFullSize := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4))
    if fbeFullSize < m.model.FBESize() {
        value = NewEnums()
        return 0, errors.New("model is broken")
    }

    err := m.model.GetValue(value)
    return fbeFullSize, err
}

// Move to the next struct value
func (m *EnumsModel) Next(prev int) {
    m.model.FBEShift(prev)
}
