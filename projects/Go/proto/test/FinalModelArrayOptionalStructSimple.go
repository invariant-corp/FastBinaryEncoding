// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.1.0.0

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding *StructSimple array final model
type FinalModelArrayOptionalStructSimple struct {
    // Final model buffer
    buffer *fbe.Buffer
    // Final model buffer offset
    offset int

    // Array item final model
    model *FinalModelOptionalStructSimple
    // Array size
    size int
}

// Create a new *StructSimple array final model
func NewFinalModelArrayOptionalStructSimple(buffer *fbe.Buffer, offset int, size int) *FinalModelArrayOptionalStructSimple {
    fbeResult := FinalModelArrayOptionalStructSimple{buffer: buffer, offset: offset}
    fbeResult.model = NewFinalModelOptionalStructSimple(buffer, offset)
    fbeResult.size = size
    return &fbeResult
}

// Get the allocation size
func (fm *FinalModelArrayOptionalStructSimple) FBEAllocationSize(values []*StructSimple) int {
    result := 0

    size := len(values)
    if size > fm.size {
        size = fm.size
    }

    for i := 0; i < size; i++ {
        result += fm.model.FBEAllocationSize(values[i])
    }

    return result
}

// Get the final offset
func (fm *FinalModelArrayOptionalStructSimple) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelArrayOptionalStructSimple) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelArrayOptionalStructSimple) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelArrayOptionalStructSimple) FBEUnshift(size int) { fm.offset -= size }

// Get the array offset
func (fm *FinalModelArrayOptionalStructSimple) Offset() int { return 0 }
// Get the array size
func (fm *FinalModelArrayOptionalStructSimple) Size() int { return fm.size }

// Check if the array is valid
func (fm *FinalModelArrayOptionalStructSimple) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset()) > fm.buffer.Size() {
        return fbe.MaxInt
    }

    result := 0
    fm.model.SetFBEOffset(fm.FBEOffset())
    for i := 0; i < fm.size; i++ {
        offset := fm.model.Verify()
        if offset == fbe.MaxInt {
            return fbe.MaxInt
        }
        fm.model.FBEShift(offset)
        result += offset
    }
    return result
}

// Get the array
func (fm *FinalModelArrayOptionalStructSimple) Get(values []*StructSimple) (int, error) {
    values = values[:0]

    if (fm.buffer.Offset() + fm.FBEOffset()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    result := 0
    fm.model.SetFBEOffset(fm.FBEOffset())
    for i := 0; i < fm.size; i++ {
        value, offset, err := fm.model.Get()
        if err != nil {
            return result, err
        }
        values = append(values, value)
        fm.model.FBEShift(offset)
        result += offset
    }
    return result, nil
}

// Set the array
func (fm *FinalModelArrayOptionalStructSimple) Set(values []*StructSimple) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    size := len(values)
    if size > fm.size {
        size = fm.size
    }

    result := 0
    fm.model.SetFBEOffset(fm.FBEOffset())
    for i := 0; i < size; i++ {
        offset, err := fm.model.Set(values[i])
        if err == nil {
            return result, err
        }
        fm.model.FBEShift(offset)
        result += offset
    }
    return result, nil
}
