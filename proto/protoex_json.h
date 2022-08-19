//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.11.0.0
//------------------------------------------------------------------------------

#pragma once

#if defined(__clang__)
#pragma clang system_header
#elif defined(__GNUC__)
#pragma GCC system_header
#elif defined(_MSC_VER)
#pragma system_header
#endif

#include "fbe_json.h"

#include "protoex.h"

#include "proto_json.h"

namespace FBE {

namespace JSON {

template <class TWriter>
struct ValueWriter<TWriter, ::protoex::OrderSide>
{
    static bool to_json(TWriter& writer, const ::protoex::OrderSide& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint8_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::protoex::OrderSide>
{
    static bool from_json(const TJson& json, ::protoex::OrderSide& value)
    {
        uint8_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::protoex::OrderSide)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::protoex::OrderType>
{
    static bool to_json(TWriter& writer, const ::protoex::OrderType& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint8_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::protoex::OrderType>
{
    static bool from_json(const TJson& json, ::protoex::OrderType& value)
    {
        uint8_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::protoex::OrderType)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::protoex::StateEx>
{
    static bool to_json(TWriter& writer, const ::protoex::StateEx& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint8_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::protoex::StateEx>
{
    static bool from_json(const TJson& json, ::protoex::StateEx& value)
    {
        uint8_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::protoex::StateEx)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::protoex::Order>
{
    static bool to_json(TWriter& writer, const ::protoex::Order& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "id") || !FBE::JSON::to_json(writer, value.id, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "symbol") || !FBE::JSON::to_json(writer, value.symbol, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "side") || !FBE::JSON::to_json(writer, value.side, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "type") || !FBE::JSON::to_json(writer, value.type, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "price") || !FBE::JSON::to_json(writer, value.price, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "volume") || !FBE::JSON::to_json(writer, value.volume, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "tp") || !FBE::JSON::to_json(writer, value.tp, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "sl") || !FBE::JSON::to_json(writer, value.sl, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::protoex::Order>
{
    static bool from_json(const TJson& json, ::protoex::Order& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.id, "id");
        result &= FBE::JSON::from_json(json, value.symbol, "symbol");
        result &= FBE::JSON::from_json(json, value.side, "side");
        result &= FBE::JSON::from_json(json, value.type, "type");
        result &= FBE::JSON::from_json(json, value.price, "price");
        result &= FBE::JSON::from_json(json, value.volume, "volume");
        result &= FBE::JSON::from_json(json, value.tp, "tp");
        result &= FBE::JSON::from_json(json, value.sl, "sl");
        return result;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::protoex::Balance>
{
    static bool to_json(TWriter& writer, const ::protoex::Balance& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json(writer, (const ::proto::Balance&)value, false))
            return false;
        if (!FBE::JSON::to_json_key(writer, "locked") || !FBE::JSON::to_json(writer, value.locked, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::protoex::Balance>
{
    static bool from_json(const TJson& json, ::protoex::Balance& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, (::proto::Balance&)value);
        result &= FBE::JSON::from_json(json, value.locked, "locked");
        return result;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::protoex::Account>
{
    static bool to_json(TWriter& writer, const ::protoex::Account& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "id") || !FBE::JSON::to_json(writer, value.id, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "name") || !FBE::JSON::to_json(writer, value.name, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "state") || !FBE::JSON::to_json(writer, value.state, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "wallet") || !FBE::JSON::to_json(writer, value.wallet, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "asset") || !FBE::JSON::to_json(writer, value.asset, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "orders") || !FBE::JSON::to_json(writer, value.orders, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::protoex::Account>
{
    static bool from_json(const TJson& json, ::protoex::Account& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.id, "id");
        result &= FBE::JSON::from_json(json, value.name, "name");
        result &= FBE::JSON::from_json(json, value.state, "state");
        result &= FBE::JSON::from_json(json, value.wallet, "wallet");
        result &= FBE::JSON::from_json(json, value.asset, "asset");
        result &= FBE::JSON::from_json(json, value.orders, "orders");
        return result;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::protoex::OrderMessage>
{
    static bool to_json(TWriter& writer, const ::protoex::OrderMessage& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "body") || !FBE::JSON::to_json(writer, value.body, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::protoex::OrderMessage>
{
    static bool from_json(const TJson& json, ::protoex::OrderMessage& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.body, "body");
        return result;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::protoex::BalanceMessage>
{
    static bool to_json(TWriter& writer, const ::protoex::BalanceMessage& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "body") || !FBE::JSON::to_json(writer, value.body, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::protoex::BalanceMessage>
{
    static bool from_json(const TJson& json, ::protoex::BalanceMessage& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.body, "body");
        return result;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::protoex::AccountMessage>
{
    static bool to_json(TWriter& writer, const ::protoex::AccountMessage& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "body") || !FBE::JSON::to_json(writer, value.body, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::protoex::AccountMessage>
{
    static bool from_json(const TJson& json, ::protoex::AccountMessage& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.body, "body");
        return result;
    }
};

} // namespace JSON

} // namespace FBE
