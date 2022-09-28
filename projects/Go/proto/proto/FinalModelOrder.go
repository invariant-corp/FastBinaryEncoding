//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package proto

import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// Fast Binary Encoding Order final model
type FinalModelOrder struct {
    buffer *fbe.Buffer  // Final model buffer
    offset int          // Final model buffer offset

    Id *fbe.FinalModelInt32
    Symbol *fbe.FinalModelString
    Side *FinalModelOrderSide
    Type *FinalModelOrderType
    Price *fbe.FinalModelDouble
    Volume *fbe.FinalModelDouble
}

// Create a new Order final model
func NewFinalModelOrder(buffer *fbe.Buffer, offset int) *FinalModelOrder {
    fbeResult := FinalModelOrder{buffer: buffer, offset: offset}
    fbeResult.Id = fbe.NewFinalModelInt32(buffer, 0)
    fbeResult.Symbol = fbe.NewFinalModelString(buffer, 0)
    fbeResult.Side = NewFinalModelOrderSide(buffer, 0)
    fbeResult.Type = NewFinalModelOrderType(buffer, 0)
    fbeResult.Price = fbe.NewFinalModelDouble(buffer, 0)
    fbeResult.Volume = fbe.NewFinalModelDouble(buffer, 0)
    return &fbeResult
}

// Get the allocation size
func (fm *FinalModelOrder) FBEAllocationSize(fbeValue *Order) int {
    fbeResult := 0 +
        fm.Id.FBEAllocationSize(fbeValue.Id) +
        fm.Symbol.FBEAllocationSize(fbeValue.Symbol) +
        fm.Side.FBEAllocationSize(&fbeValue.Side) +
        fm.Type.FBEAllocationSize(&fbeValue.Type) +
        fm.Price.FBEAllocationSize(fbeValue.Price) +
        fm.Volume.FBEAllocationSize(fbeValue.Volume) +
        0
    return fbeResult
}

// Get the final size
func (fm *FinalModelOrder) FBESize() int { return 0 }

// Get the final extra size
func (fm *FinalModelOrder) FBEExtra() int { return 0 }

// Get the final type
func (fm *FinalModelOrder) FBEType() int { return 1 }

// Get the final offset
func (fm *FinalModelOrder) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelOrder) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelOrder) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelOrder) FBEUnshift(size int) { fm.offset -= size }

// Check if the struct value is valid
func (fm *FinalModelOrder) Verify() int {
    fm.buffer.Shift(fm.FBEOffset())
    fbeResult := fm.VerifyFields()
    fm.buffer.Unshift(fm.FBEOffset())
    return fbeResult
}

// Check if the struct fields are valid
func (fm *FinalModelOrder) VerifyFields() int {
    fbeCurrentOffset := 0
    fbeFieldSize := 0


    fm.Id.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.Id.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.Symbol.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.Symbol.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.Side.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.Side.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.Type.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.Type.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.Price.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.Price.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    fm.Volume.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize = fm.Volume.Verify(); fbeFieldSize == fbe.MaxInt {
        return fbe.MaxInt
    }
    fbeCurrentOffset += fbeFieldSize

    return fbeCurrentOffset
}

// Get the struct value
func (fm *FinalModelOrder) Get() (*Order, int, error) {
    fbeResult := NewOrder()
    fbeSize, err := fm.GetValue(fbeResult)
    return fbeResult, fbeSize, err
}

// Get the struct value by the given pointer
func (fm *FinalModelOrder) GetValue(fbeValue *Order) (int, error) {
    fm.buffer.Shift(fm.FBEOffset())
    fbeSize, err := fm.GetFields(fbeValue)
    fm.buffer.Unshift(fm.FBEOffset())
    return fbeSize, err
}

// Get the struct fields values
func (fm *FinalModelOrder) GetFields(fbeValue *Order) (int, error) {
    var err error = nil
    fbeCurrentSize := 0
    fbeCurrentOffset := 0
    fbeFieldSize := 0

    fm.Id.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.Id, fbeFieldSize, err = fm.Id.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.Symbol.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.Symbol, fbeFieldSize, err = fm.Symbol.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.Side.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.Side.GetValue(&fbeValue.Side); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.Type.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.Type.GetValue(&fbeValue.Type); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.Price.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.Price, fbeFieldSize, err = fm.Price.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.Volume.SetFBEOffset(fbeCurrentOffset)
    if fbeValue.Volume, fbeFieldSize, err = fm.Volume.Get(); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    return fbeCurrentSize, err
}

// Set the struct value
func (fm *FinalModelOrder) Set(fbeValue *Order) (int, error) {
    fm.buffer.Shift(fm.FBEOffset())
    fbeResult, err := fm.SetFields(fbeValue)
    fm.buffer.Unshift(fm.FBEOffset())
    return fbeResult, err
}

// Set the struct fields values
func (fm *FinalModelOrder) SetFields(fbeValue *Order) (int, error) {
    var err error = nil
    fbeCurrentSize := 0
    fbeCurrentOffset := 0
    fbeFieldSize := 0

    fm.Id.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.Id.Set(fbeValue.Id); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.Symbol.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.Symbol.Set(fbeValue.Symbol); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.Side.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.Side.Set(&fbeValue.Side); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.Type.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.Type.Set(&fbeValue.Type); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.Price.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.Price.Set(fbeValue.Price); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    fm.Volume.SetFBEOffset(fbeCurrentOffset)
    if fbeFieldSize, err = fm.Volume.Set(fbeValue.Volume); err != nil {
        return fbeCurrentSize, err
    }
    fbeCurrentOffset += fbeFieldSize
    fbeCurrentSize += fbeFieldSize

    return fbeCurrentSize, err
}
