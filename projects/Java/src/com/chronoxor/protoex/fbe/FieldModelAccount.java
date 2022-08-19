//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

package com.chronoxor.protoex.fbe;

// Fast Binary Encoding Account field model
public final class FieldModelAccount extends com.chronoxor.fbe.FieldModel
{
    public final com.chronoxor.fbe.FieldModelInt32 id;
    public final com.chronoxor.fbe.FieldModelString name;
    public final FieldModelStateEx state;
    public final FieldModelBalance wallet;
    public final FieldModelOptionalBalance asset;
    public final FieldModelVectorOrder orders;

    public FieldModelAccount(com.chronoxor.fbe.Buffer buffer, long offset)
    {
        super(buffer, offset);
        id = new com.chronoxor.fbe.FieldModelInt32(buffer, 4 + 4);
        name = new com.chronoxor.fbe.FieldModelString(buffer, id.fbeOffset() + id.fbeSize());
        state = new FieldModelStateEx(buffer, name.fbeOffset() + name.fbeSize());
        wallet = new FieldModelBalance(buffer, state.fbeOffset() + state.fbeSize());
        asset = new FieldModelOptionalBalance(buffer, wallet.fbeOffset() + wallet.fbeSize());
        orders = new FieldModelVectorOrder(buffer, asset.fbeOffset() + asset.fbeSize());
    }

    // Get the field size
    @Override
    public long fbeSize() { return 4; }
    // Get the field body size
    public long fbeBody()
    {
        long fbeResult = 4 + 4
            + id.fbeSize()
            + name.fbeSize()
            + state.fbeSize()
            + wallet.fbeSize()
            + asset.fbeSize()
            + orders.fbeSize()
            ;
        return fbeResult;
    }
    // Get the field extra size
    @Override
    public long fbeExtra()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(fbeOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4) > _buffer.getSize()))
            return 0;

        _buffer.shift(fbeStructOffset);

        long fbeResult = fbeBody()
            + id.fbeExtra()
            + name.fbeExtra()
            + state.fbeExtra()
            + wallet.fbeExtra()
            + asset.fbeExtra()
            + orders.fbeExtra()
            ;

        _buffer.unshift(fbeStructOffset);

        return fbeResult;
    }
    // Get the field type
    public static final long fbeTypeConst = 3;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    @Override
    public boolean verify() { return verify(true); }
    public boolean verify(boolean fbeVerifyType)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return true;

        int fbeStructOffset = readInt32(fbeOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return false;

        int fbeStructSize = readInt32(fbeStructOffset);
        if (fbeStructSize < (4 + 4))
            return false;

        int fbeStructType = readInt32(fbeStructOffset + 4);
        if (fbeVerifyType && (fbeStructType != fbeType()))
            return false;

        _buffer.shift(fbeStructOffset);
        boolean fbeResult = verifyFields(fbeStructSize);
        _buffer.unshift(fbeStructOffset);
        return fbeResult;
    }

    // Check if the struct fields are valid
    public boolean verifyFields(long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + id.fbeSize()) > fbeStructSize)
            return true;
        if (!id.verify())
            return false;
        fbeCurrentSize += id.fbeSize();

        if ((fbeCurrentSize + name.fbeSize()) > fbeStructSize)
            return true;
        if (!name.verify())
            return false;
        fbeCurrentSize += name.fbeSize();

        if ((fbeCurrentSize + state.fbeSize()) > fbeStructSize)
            return true;
        if (!state.verify())
            return false;
        fbeCurrentSize += state.fbeSize();

        if ((fbeCurrentSize + wallet.fbeSize()) > fbeStructSize)
            return true;
        if (!wallet.verify())
            return false;
        fbeCurrentSize += wallet.fbeSize();

        if ((fbeCurrentSize + asset.fbeSize()) > fbeStructSize)
            return true;
        if (!asset.verify())
            return false;
        fbeCurrentSize += asset.fbeSize();

        if ((fbeCurrentSize + orders.fbeSize()) > fbeStructSize)
            return true;
        if (!orders.verify())
            return false;
        fbeCurrentSize += orders.fbeSize();

        return true;
    }

    // Get the struct value (begin phase)
    public long getBegin()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(fbeOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + 4 + 4) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return 0;

        int fbeStructSize = readInt32(fbeStructOffset);
        assert (fbeStructSize >= (4 + 4)) : "Model is broken!";
        if (fbeStructSize < (4 + 4))
            return 0;

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Get the struct value (end phase)
    public void getEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Get the struct value
    public com.chronoxor.protoex.Account get() { return get(new com.chronoxor.protoex.Account()); }
    public com.chronoxor.protoex.Account get(com.chronoxor.protoex.Account fbeValue)
    {
        long fbeBegin = getBegin();
        if (fbeBegin == 0)
            return fbeValue;

        int fbeStructSize = readInt32(0);
        getFields(fbeValue, fbeStructSize);
        getEnd(fbeBegin);
        return fbeValue;
    }

    // Get the struct fields values
    public void getFields(com.chronoxor.protoex.Account fbeValue, long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + id.fbeSize()) <= fbeStructSize)
            fbeValue.id = id.get();
        else
            fbeValue.id = 0;
        fbeCurrentSize += id.fbeSize();

        if ((fbeCurrentSize + name.fbeSize()) <= fbeStructSize)
            fbeValue.name = name.get();
        else
            fbeValue.name = "";
        fbeCurrentSize += name.fbeSize();

        if ((fbeCurrentSize + state.fbeSize()) <= fbeStructSize)
            fbeValue.state = state.get(com.chronoxor.protoex.StateEx.fromSet(java.util.EnumSet.of(com.chronoxor.protoex.StateEx.initialized.getEnum(), com.chronoxor.protoex.StateEx.bad.getEnum(), com.chronoxor.protoex.StateEx.sad.getEnum())));
        else
            fbeValue.state = com.chronoxor.protoex.StateEx.fromSet(java.util.EnumSet.of(com.chronoxor.protoex.StateEx.initialized.getEnum(), com.chronoxor.protoex.StateEx.bad.getEnum(), com.chronoxor.protoex.StateEx.sad.getEnum()));
        fbeCurrentSize += state.fbeSize();

        if ((fbeCurrentSize + wallet.fbeSize()) <= fbeStructSize)
            fbeValue.wallet = wallet.get();
        else
            fbeValue.wallet = new com.chronoxor.protoex.Balance();
        fbeCurrentSize += wallet.fbeSize();

        if ((fbeCurrentSize + asset.fbeSize()) <= fbeStructSize)
            fbeValue.asset = asset.get();
        else
            fbeValue.asset = null;
        fbeCurrentSize += asset.fbeSize();

        if ((fbeCurrentSize + orders.fbeSize()) <= fbeStructSize)
            orders.get(fbeValue.orders);
        else
            fbeValue.orders.clear();
        fbeCurrentSize += orders.fbeSize();
    }

    // Set the struct value (begin phase)
    public long setBegin()
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructSize = (int)fbeBody();
        int fbeStructOffset = (int)(_buffer.allocate(fbeStructSize) - _buffer.getOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset <= 0) || ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) > _buffer.getSize()))
            return 0;

        write(fbeOffset(), fbeStructOffset);
        write(fbeStructOffset, fbeStructSize);
        write(fbeStructOffset + 4, (int)fbeType());

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Set the struct value (end phase)
    public void setEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Set the struct value
    public void set(com.chronoxor.protoex.Account fbeValue)
    {
        long fbeBegin = setBegin();
        if (fbeBegin == 0)
            return;

        setFields(fbeValue);
        setEnd(fbeBegin);
    }

    // Set the struct fields values
    public void setFields(com.chronoxor.protoex.Account fbeValue)
    {
        id.set(fbeValue.id);
        name.set(fbeValue.name);
        state.set(fbeValue.state);
        wallet.set(fbeValue.wallet);
        asset.set(fbeValue.asset);
        orders.set(fbeValue.orders);
    }
}
