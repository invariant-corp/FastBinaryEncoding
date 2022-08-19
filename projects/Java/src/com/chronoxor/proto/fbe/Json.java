//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

package com.chronoxor.proto.fbe;

// Fast Binary Encoding proto JSON engine
public final class Json
{
    private static final com.google.gson.Gson _engine;

    // Get the JSON engine
    public static com.google.gson.Gson getEngine() { return _engine; }

    static
    {
        _engine = register(new com.google.gson.GsonBuilder()).create();
    }

    private Json() {}

    public static com.google.gson.GsonBuilder register(com.google.gson.GsonBuilder builder)
    {
        com.chronoxor.fbe.Json.register(builder);
        builder.registerTypeAdapter(com.chronoxor.proto.OrderSide.class, new OrderSideJson());
        builder.registerTypeAdapter(com.chronoxor.proto.OrderType.class, new OrderTypeJson());
        builder.registerTypeAdapter(com.chronoxor.proto.State.class, new StateJson());
        return builder;
    }
}
