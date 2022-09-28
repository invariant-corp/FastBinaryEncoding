//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.protoex.fbe

// Fast Binary Encoding com.chronoxor.protoex final receiver
@Suppress("MemberVisibilityCanBePrivate", "PrivatePropertyName", "UNUSED_PARAMETER")
open class FinalReceiver : com.chronoxor.fbe.Receiver, IFinalReceiverListener
{
    // Imported receivers
    var protoReceiver: com.chronoxor.proto.fbe.FinalReceiver

    // Receiver values accessors
    private val OrderMessageValue: com.chronoxor.protoex.OrderMessage
    private val BalanceMessageValue: com.chronoxor.protoex.BalanceMessage
    private val AccountMessageValue: com.chronoxor.protoex.AccountMessage

    // Receiver models accessors
    private val OrderMessageModel: OrderMessageFinalModel
    private val BalanceMessageModel: BalanceMessageFinalModel
    private val AccountMessageModel: AccountMessageFinalModel

    constructor() : super(true)
    {
        protoReceiver = com.chronoxor.proto.fbe.FinalReceiver(buffer)
        OrderMessageValue = com.chronoxor.protoex.OrderMessage()
        OrderMessageModel = OrderMessageFinalModel()
        BalanceMessageValue = com.chronoxor.protoex.BalanceMessage()
        BalanceMessageModel = BalanceMessageFinalModel()
        AccountMessageValue = com.chronoxor.protoex.AccountMessage()
        AccountMessageModel = AccountMessageFinalModel()
    }

    constructor(buffer: com.chronoxor.fbe.Buffer) : super(buffer, true)
    {
        protoReceiver = com.chronoxor.proto.fbe.FinalReceiver(buffer)
        OrderMessageValue = com.chronoxor.protoex.OrderMessage()
        OrderMessageModel = OrderMessageFinalModel()
        BalanceMessageValue = com.chronoxor.protoex.BalanceMessage()
        BalanceMessageModel = BalanceMessageFinalModel()
        AccountMessageValue = com.chronoxor.protoex.AccountMessage()
        AccountMessageModel = AccountMessageFinalModel()
    }

    override fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        return onReceiveListener(this, type, buffer, offset, size)
    }

    open fun onReceiveListener(listener: IFinalReceiverListener, type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        when (type)
        {
            com.chronoxor.protoex.fbe.OrderMessageFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                OrderMessageModel.attach(buffer, offset)
                assert(OrderMessageModel.verify()) { "com.chronoxor.protoex.OrderMessage validation failed!" }
                val deserialized = OrderMessageModel.deserialize(OrderMessageValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.OrderMessage deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = OrderMessageValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(OrderMessageValue)
                return true
            }
            com.chronoxor.protoex.fbe.BalanceMessageFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                BalanceMessageModel.attach(buffer, offset)
                assert(BalanceMessageModel.verify()) { "com.chronoxor.protoex.BalanceMessage validation failed!" }
                val deserialized = BalanceMessageModel.deserialize(BalanceMessageValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.BalanceMessage deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = BalanceMessageValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(BalanceMessageValue)
                return true
            }
            com.chronoxor.protoex.fbe.AccountMessageFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                AccountMessageModel.attach(buffer, offset)
                assert(AccountMessageModel.verify()) { "com.chronoxor.protoex.AccountMessage validation failed!" }
                val deserialized = AccountMessageModel.deserialize(AccountMessageValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.AccountMessage deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = AccountMessageValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(AccountMessageValue)
                return true
            }
        }

        if (protoReceiver.onReceiveListener(listener, type, buffer, offset, size))
            return true

        return false
    }
}
