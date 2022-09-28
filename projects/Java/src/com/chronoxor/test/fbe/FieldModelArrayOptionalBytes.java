//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package com.chronoxor.test.fbe;

// Fast Binary Encoding OptionalBytes array field model
public final class FieldModelArrayOptionalBytes extends com.chronoxor.fbe.FieldModel
{
    private final FieldModelOptionalBytes _model;
    private final long _size;

    public FieldModelArrayOptionalBytes(com.chronoxor.fbe.Buffer buffer, long offset, long size)
    {
        super(buffer, offset);
        _model = new FieldModelOptionalBytes(buffer, offset);
        _size = size;
    }

    // Get the field size
    @Override
    public long fbeSize() { return _size * _model.fbeSize(); }
    // Get the field extra size
    @Override
    public long fbeExtra() { return 0; }

    // Get the array offset
    public long getOffset() { return 0; }
    // Get the array size
    public long getSize() { return _size; }

    // Array index operator
    public FieldModelOptionalBytes getItem(long index)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        assert (index < _size) : "Index is out of bounds!";

        _model.fbeOffset(fbeOffset());
        _model.fbeShift(index * _model.fbeSize());
        return _model;
    }

    // Check if the array is valid
    @Override
    public boolean verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return false;

        _model.fbeOffset(fbeOffset());
        for (long i = _size; i-- > 0;)
        {
            if (!_model.verify())
                return false;
            _model.fbeShift(_model.fbeSize());
        }

        return true;
    }

    // Get the array
    public java.nio.ByteBuffer[] get()
    {
        var values = new java.nio.ByteBuffer[(int)_size];

        var fbeModel = getItem(0);
        for (long i = 0; i < _size; i++)
        {
            values[(int)i] = fbeModel.get();
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
        return values;
    }

    // Get the array
    public void get(java.nio.ByteBuffer[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        var fbeModel = getItem(0);
        for (long i = 0; (i < values.length) && (i < _size); i++)
        {
            values[(int)i] = fbeModel.get();
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }

    // Get the array as java.util.ArrayList
    public void get(java.util.ArrayList<java.nio.ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();
        values.ensureCapacity((int)_size);

        var fbeModel = getItem(0);
        for (long i = _size; i-- > 0;)
        {
            java.nio.ByteBuffer value = fbeModel.get();
            values.add(value);
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }

    // Set the array
    public void set(java.nio.ByteBuffer[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        var fbeModel = getItem(0);
        for (long i = 0; (i < values.length) && (i < _size); i++)
        {
            fbeModel.set(values[(int)i]);
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }

    // Set the array as java.util.ArrayList
    public void set(java.util.ArrayList<java.nio.ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        var fbeModel = getItem(0);
        for (long i = 0; (i < values.size()) && (i < _size); i++)
        {
            fbeModel.set(values.get((int)i));
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }
}
