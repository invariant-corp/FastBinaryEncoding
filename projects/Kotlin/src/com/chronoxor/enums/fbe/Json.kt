//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums.fbe

// Fast Binary Encoding enums JSON engine
object Json
{
    // Get the JSON engine
    val engine: com.google.gson.Gson = register(com.google.gson.GsonBuilder()).create()

    @Suppress("MemberVisibilityCanBePrivate")
    fun register(builder: com.google.gson.GsonBuilder): com.google.gson.GsonBuilder
    {
        com.chronoxor.fbe.Json.register(builder)
        builder.registerTypeAdapter(com.chronoxor.enums.EnumByte::class.java, EnumByteJson())
        builder.registerTypeAdapter(com.chronoxor.enums.EnumChar::class.java, EnumCharJson())
        builder.registerTypeAdapter(com.chronoxor.enums.EnumWChar::class.java, EnumWCharJson())
        builder.registerTypeAdapter(com.chronoxor.enums.EnumInt8::class.java, EnumInt8Json())
        builder.registerTypeAdapter(com.chronoxor.enums.EnumUInt8::class.java, EnumUInt8Json())
        builder.registerTypeAdapter(com.chronoxor.enums.EnumInt16::class.java, EnumInt16Json())
        builder.registerTypeAdapter(com.chronoxor.enums.EnumUInt16::class.java, EnumUInt16Json())
        builder.registerTypeAdapter(com.chronoxor.enums.EnumInt32::class.java, EnumInt32Json())
        builder.registerTypeAdapter(com.chronoxor.enums.EnumUInt32::class.java, EnumUInt32Json())
        builder.registerTypeAdapter(com.chronoxor.enums.EnumInt64::class.java, EnumInt64Json())
        builder.registerTypeAdapter(com.chronoxor.enums.EnumUInt64::class.java, EnumUInt64Json())
        return builder
    }
}
