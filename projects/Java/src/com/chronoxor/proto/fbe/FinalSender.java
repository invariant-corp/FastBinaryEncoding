//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

package com.chronoxor.proto.fbe;

// Fast Binary Encoding com.chronoxor.proto final sender
public class FinalSender extends com.chronoxor.fbe.Sender
{
    // Sender models accessors
    public final OrderMessageFinalModel OrderMessageModel;
    public final BalanceMessageFinalModel BalanceMessageModel;
    public final AccountMessageFinalModel AccountMessageModel;

    public FinalSender()
    {
        super(true);
        OrderMessageModel = new OrderMessageFinalModel(getBuffer());
        BalanceMessageModel = new BalanceMessageFinalModel(getBuffer());
        AccountMessageModel = new AccountMessageFinalModel(getBuffer());
    }
    public FinalSender(com.chronoxor.fbe.Buffer buffer)
    {
        super(buffer, true);
        OrderMessageModel = new OrderMessageFinalModel(getBuffer());
        BalanceMessageModel = new BalanceMessageFinalModel(getBuffer());
        AccountMessageModel = new AccountMessageFinalModel(getBuffer());
    }

    public long send(Object obj)
    {
        if (obj instanceof com.chronoxor.proto.OrderMessage)
        {
            com.chronoxor.proto.OrderMessage value = (com.chronoxor.proto.OrderMessage)obj;
            if (value.fbeType() == OrderMessageModel.fbeType())
                return send(value);
        }
        if (obj instanceof com.chronoxor.proto.BalanceMessage)
        {
            com.chronoxor.proto.BalanceMessage value = (com.chronoxor.proto.BalanceMessage)obj;
            if (value.fbeType() == BalanceMessageModel.fbeType())
                return send(value);
        }
        if (obj instanceof com.chronoxor.proto.AccountMessage)
        {
            com.chronoxor.proto.AccountMessage value = (com.chronoxor.proto.AccountMessage)obj;
            if (value.fbeType() == AccountMessageModel.fbeType())
                return send(value);
        }

        return 0;
    }

    public long send(com.chronoxor.proto.OrderMessage value)
    {
        // Serialize the value into the FBE stream
        long serialized = OrderMessageModel.serialize(value);
        assert (serialized > 0) : "com.chronoxor.proto.OrderMessage serialization failed!";
        assert OrderMessageModel.verify() : "com.chronoxor.proto.OrderMessage validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(com.chronoxor.proto.BalanceMessage value)
    {
        // Serialize the value into the FBE stream
        long serialized = BalanceMessageModel.serialize(value);
        assert (serialized > 0) : "com.chronoxor.proto.BalanceMessage serialization failed!";
        assert BalanceMessageModel.verify() : "com.chronoxor.proto.BalanceMessage validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(com.chronoxor.proto.AccountMessage value)
    {
        // Serialize the value into the FBE stream
        long serialized = AccountMessageModel.serialize(value);
        assert (serialized > 0) : "com.chronoxor.proto.AccountMessage serialization failed!";
        assert AccountMessageModel.verify() : "com.chronoxor.proto.AccountMessage validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }

    // Send message handler
    @Override
    protected long onSend(byte[] buffer, long offset, long size) { throw new UnsupportedOperationException("com.chronoxor.proto.fbe.Sender.onSend() not implemented!"); }
}
