//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.proto.fbe

// Fast Binary Encoding com.chronoxor.proto final receiver
@Suppress("MemberVisibilityCanBePrivate", "PrivatePropertyName", "UNUSED_PARAMETER")
open class FinalReceiver : com.chronoxor.fbe.Receiver, IFinalReceiverListener
{
    // Receiver values accessors
    private val OrderMessageValue: com.chronoxor.proto.OrderMessage
    private val BalanceMessageValue: com.chronoxor.proto.BalanceMessage
    private val AccountMessageValue: com.chronoxor.proto.AccountMessage

    // Receiver models accessors
    private val OrderMessageModel: OrderMessageFinalModel
    private val BalanceMessageModel: BalanceMessageFinalModel
    private val AccountMessageModel: AccountMessageFinalModel

    constructor() : super(true)
    {
        OrderMessageValue = com.chronoxor.proto.OrderMessage()
        OrderMessageModel = OrderMessageFinalModel()
        BalanceMessageValue = com.chronoxor.proto.BalanceMessage()
        BalanceMessageModel = BalanceMessageFinalModel()
        AccountMessageValue = com.chronoxor.proto.AccountMessage()
        AccountMessageModel = AccountMessageFinalModel()
    }

    constructor(buffer: com.chronoxor.fbe.Buffer) : super(buffer, true)
    {
        OrderMessageValue = com.chronoxor.proto.OrderMessage()
        OrderMessageModel = OrderMessageFinalModel()
        BalanceMessageValue = com.chronoxor.proto.BalanceMessage()
        BalanceMessageModel = BalanceMessageFinalModel()
        AccountMessageValue = com.chronoxor.proto.AccountMessage()
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
            com.chronoxor.proto.fbe.OrderMessageFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                OrderMessageModel.attach(buffer, offset)
                assert(OrderMessageModel.verify()) { "com.chronoxor.proto.OrderMessage validation failed!" }
                val deserialized = OrderMessageModel.deserialize(OrderMessageValue)
                assert(deserialized > 0) { "com.chronoxor.proto.OrderMessage deserialization failed!" }

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
            com.chronoxor.proto.fbe.BalanceMessageFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                BalanceMessageModel.attach(buffer, offset)
                assert(BalanceMessageModel.verify()) { "com.chronoxor.proto.BalanceMessage validation failed!" }
                val deserialized = BalanceMessageModel.deserialize(BalanceMessageValue)
                assert(deserialized > 0) { "com.chronoxor.proto.BalanceMessage deserialization failed!" }

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
            com.chronoxor.proto.fbe.AccountMessageFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                AccountMessageModel.attach(buffer, offset)
                assert(AccountMessageModel.verify()) { "com.chronoxor.proto.AccountMessage validation failed!" }
                val deserialized = AccountMessageModel.deserialize(AccountMessageValue)
                assert(deserialized > 0) { "com.chronoxor.proto.AccountMessage deserialization failed!" }

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

        return false
    }
}
