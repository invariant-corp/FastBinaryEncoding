// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.3.0.0

package com.chronoxor.protoex.fbe;

// Fast Binary Encoding com.chronoxor.protoex final sender
public class FinalSender extends com.chronoxor.fbe.Sender
{
    // Imported senders
    public final com.chronoxor.proto.fbe.FinalSender protoSender;

    // Sender models accessors
    public final OrderFinalModel OrderModel;
    public final BalanceFinalModel BalanceModel;
    public final AccountFinalModel AccountModel;

    public FinalSender()
    {
        super(true);
        protoSender = new com.chronoxor.proto.fbe.FinalSender(getBuffer());
        OrderModel = new OrderFinalModel(getBuffer());
        BalanceModel = new BalanceFinalModel(getBuffer());
        AccountModel = new AccountFinalModel(getBuffer());
    }
    public FinalSender(com.chronoxor.fbe.Buffer buffer)
    {
        super(buffer, true);
        protoSender = new com.chronoxor.proto.fbe.FinalSender(getBuffer());
        OrderModel = new OrderFinalModel(getBuffer());
        BalanceModel = new BalanceFinalModel(getBuffer());
        AccountModel = new AccountFinalModel(getBuffer());
    }

    public long send(Object obj)
    {
        if (obj instanceof com.chronoxor.protoex.Order)
        {
            com.chronoxor.protoex.Order value = (com.chronoxor.protoex.Order)obj;
            return send(value);
        }
        if (obj instanceof com.chronoxor.protoex.Balance)
        {
            com.chronoxor.protoex.Balance value = (com.chronoxor.protoex.Balance)obj;
            return send(value);
        }
        if (obj instanceof com.chronoxor.protoex.Account)
        {
            com.chronoxor.protoex.Account value = (com.chronoxor.protoex.Account)obj;
            return send(value);
        }

        // Try to send using imported senders
        long result = 0;
        result = protoSender.send(obj);
        if (result > 0)
            return result;

        return 0;
    }

    public long send(com.chronoxor.protoex.Order value)
    {
        // Serialize the value into the FBE stream
        long serialized = OrderModel.serialize(value);
        assert (serialized > 0) : "com.chronoxor.protoex.Order serialization failed!";
        assert OrderModel.verify() : "com.chronoxor.protoex.Order validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(com.chronoxor.protoex.Balance value)
    {
        // Serialize the value into the FBE stream
        long serialized = BalanceModel.serialize(value);
        assert (serialized > 0) : "com.chronoxor.protoex.Balance serialization failed!";
        assert BalanceModel.verify() : "com.chronoxor.protoex.Balance validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(com.chronoxor.protoex.Account value)
    {
        // Serialize the value into the FBE stream
        long serialized = AccountModel.serialize(value);
        assert (serialized > 0) : "com.chronoxor.protoex.Account serialization failed!";
        assert AccountModel.verify() : "com.chronoxor.protoex.Account validation failed!";

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
    protected long onSend(byte[] buffer, long offset, long size) { throw new UnsupportedOperationException("com.chronoxor.protoex.fbe.Sender.onSend() not implemented!"); }
}
