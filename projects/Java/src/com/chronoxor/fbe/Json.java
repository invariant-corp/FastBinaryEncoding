//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package com.chronoxor.fbe;

final class ByteBufferJson implements com.google.gson.JsonSerializer<java.nio.ByteBuffer>, com.google.gson.JsonDeserializer<java.nio.ByteBuffer>
{
    @Override
    public com.google.gson.JsonElement serialize(java.nio.ByteBuffer src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context)
    {
        return new com.google.gson.JsonPrimitive(java.util.Base64.getEncoder().encodeToString(src.array()));
    }

    @Override
    public java.nio.ByteBuffer deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException
    {
        return java.nio.ByteBuffer.wrap(java.util.Base64.getDecoder().decode(json.getAsString()));
    }
}

final class CharacterJson implements com.google.gson.JsonSerializer<Character>, com.google.gson.JsonDeserializer<Character>
{
    @Override
    public com.google.gson.JsonElement serialize(Character src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context)
    {
        return new com.google.gson.JsonPrimitive((long)src);
    }

    @Override
    public Character deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException
    {
        return (char)json.getAsLong();
    }
}

final class DateJson implements com.google.gson.JsonSerializer<java.util.Date>, com.google.gson.JsonDeserializer<java.util.Date>
{
    @Override
    public com.google.gson.JsonElement serialize(java.util.Date src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context)
    {
        long nanoseconds = src.getTime() * 1000;
        return new com.google.gson.JsonPrimitive(nanoseconds);
    }

    @Override
    public java.util.Date deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException
    {
        long nanoseconds = json.getAsJsonPrimitive().getAsLong();
        return new java.util.Date(nanoseconds / 1000000);
    }
}

final class InstantJson implements com.google.gson.JsonSerializer<java.time.Instant>, com.google.gson.JsonDeserializer<java.time.Instant>
{
    @Override
    public com.google.gson.JsonElement serialize(java.time.Instant src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context)
    {
        long nanoseconds = src.getEpochSecond() * 1000000000 + src.getNano();
        return new com.google.gson.JsonPrimitive(nanoseconds);
    }

    @Override
    public java.time.Instant deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException
    {
        long nanoseconds = json.getAsJsonPrimitive().getAsLong();
        return java.time.Instant.ofEpochSecond(nanoseconds / 1000000000, nanoseconds % 1000000000);
    }
}

final class BigDecimalJson implements com.google.gson.JsonSerializer<java.math.BigDecimal>, com.google.gson.JsonDeserializer<java.math.BigDecimal>
{
    @Override
    public com.google.gson.JsonElement serialize(java.math.BigDecimal src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context)
    {
        return new com.google.gson.JsonPrimitive(src.toPlainString());
    }

    @Override
    public java.math.BigDecimal deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException
    {
        return new java.math.BigDecimal(json.getAsJsonPrimitive().getAsString());
    }
}

final class UUIDJson implements com.google.gson.JsonSerializer<java.util.UUID>, com.google.gson.JsonDeserializer<java.util.UUID>
{
    @Override
    public com.google.gson.JsonElement serialize(java.util.UUID src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context)
    {
        return new com.google.gson.JsonPrimitive(src.toString());
    }

    @Override
    public java.util.UUID deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException
    {
        return java.util.UUID.fromString(json.getAsJsonPrimitive().getAsString());
    }
}

// Fast Binary Encoding base JSON engine
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
        builder.serializeNulls();
        builder.registerTypeAdapter(java.nio.ByteBuffer.class, new ByteBufferJson());
        builder.registerTypeAdapter(char.class, new CharacterJson());
        builder.registerTypeAdapter(Character.class, new CharacterJson());
        builder.registerTypeAdapter(java.util.Date.class, new DateJson());
        builder.registerTypeAdapter(java.time.Instant.class, new InstantJson());
        builder.registerTypeAdapter(java.math.BigDecimal.class, new BigDecimalJson());
        builder.registerTypeAdapter(java.util.UUID.class, new UUIDJson());
        return builder;
    }
}
