//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

#include "protoex_final_models.h"

namespace FBE {

FinalModel<::protoex::Order>::FinalModel(FBEBuffer& buffer, size_t offset) noexcept : _buffer(buffer), _offset(offset)
    , id(buffer, 0)
    , symbol(buffer, 0)
    , side(buffer, 0)
    , type(buffer, 0)
    , price(buffer, 0)
    , volume(buffer, 0)
    , tp(buffer, 0)
    , sl(buffer, 0)
{}

size_t FinalModel<::protoex::Order>::fbe_allocation_size(const ::protoex::Order& fbe_value) const noexcept
{
    size_t fbe_result = 0
        + id.fbe_allocation_size(fbe_value.id)
        + symbol.fbe_allocation_size(fbe_value.symbol)
        + side.fbe_allocation_size(fbe_value.side)
        + type.fbe_allocation_size(fbe_value.type)
        + price.fbe_allocation_size(fbe_value.price)
        + volume.fbe_allocation_size(fbe_value.volume)
        + tp.fbe_allocation_size(fbe_value.tp)
        + sl.fbe_allocation_size(fbe_value.sl)
        ;
    return fbe_result;
}

size_t FinalModel<::protoex::Order>::verify() const noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = verify_fields();
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::Order>::verify_fields() const noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_field_size;

    id.fbe_offset(fbe_current_offset);
    fbe_field_size = id.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    symbol.fbe_offset(fbe_current_offset);
    fbe_field_size = symbol.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    side.fbe_offset(fbe_current_offset);
    fbe_field_size = side.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    type.fbe_offset(fbe_current_offset);
    fbe_field_size = type.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    price.fbe_offset(fbe_current_offset);
    fbe_field_size = price.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    volume.fbe_offset(fbe_current_offset);
    fbe_field_size = volume.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    tp.fbe_offset(fbe_current_offset);
    fbe_field_size = tp.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    sl.fbe_offset(fbe_current_offset);
    fbe_field_size = sl.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    return fbe_current_offset;
}

size_t FinalModel<::protoex::Order>::get(::protoex::Order& fbe_value) const noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = get_fields(fbe_value);
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::Order>::get_fields(::protoex::Order& fbe_value) const noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_current_size = 0;
    size_t fbe_field_size;

    id.fbe_offset(fbe_current_offset);
    fbe_field_size = id.get(fbe_value.id);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    symbol.fbe_offset(fbe_current_offset);
    fbe_field_size = symbol.get(fbe_value.symbol);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    side.fbe_offset(fbe_current_offset);
    fbe_field_size = side.get(fbe_value.side);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    type.fbe_offset(fbe_current_offset);
    fbe_field_size = type.get(fbe_value.type);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    price.fbe_offset(fbe_current_offset);
    fbe_field_size = price.get(fbe_value.price);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    volume.fbe_offset(fbe_current_offset);
    fbe_field_size = volume.get(fbe_value.volume);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    tp.fbe_offset(fbe_current_offset);
    fbe_field_size = tp.get(fbe_value.tp);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    sl.fbe_offset(fbe_current_offset);
    fbe_field_size = sl.get(fbe_value.sl);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    return fbe_current_size;
}

size_t FinalModel<::protoex::Order>::set(const ::protoex::Order& fbe_value) noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = set_fields(fbe_value);
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::Order>::set_fields(const ::protoex::Order& fbe_value) noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_current_size = 0;
    size_t fbe_field_size;

    id.fbe_offset(fbe_current_offset);
    fbe_field_size = id.set(fbe_value.id);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    symbol.fbe_offset(fbe_current_offset);
    fbe_field_size = symbol.set(fbe_value.symbol);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    side.fbe_offset(fbe_current_offset);
    fbe_field_size = side.set(fbe_value.side);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    type.fbe_offset(fbe_current_offset);
    fbe_field_size = type.set(fbe_value.type);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    price.fbe_offset(fbe_current_offset);
    fbe_field_size = price.set(fbe_value.price);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    volume.fbe_offset(fbe_current_offset);
    fbe_field_size = volume.set(fbe_value.volume);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    tp.fbe_offset(fbe_current_offset);
    fbe_field_size = tp.set(fbe_value.tp);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    sl.fbe_offset(fbe_current_offset);
    fbe_field_size = sl.set(fbe_value.sl);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    return fbe_current_size;
}

namespace protoex {

bool OrderFinalModel::verify()
{
    if ((this->buffer().offset() + _model.fbe_offset()) > this->buffer().size())
        return false;

    size_t fbe_struct_size = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8));
    size_t fbe_struct_type = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4));
    if ((fbe_struct_size == 0) || (fbe_struct_type != fbe_type()))
        return false;

    return ((8 + _model.verify()) == fbe_struct_size);
}

size_t OrderFinalModel::serialize(const ::protoex::Order& value)
{
    size_t fbe_initial_size = this->buffer().size();

    uint32_t fbe_struct_type = (uint32_t)fbe_type();
    uint32_t fbe_struct_size = (uint32_t)(8 + _model.fbe_allocation_size(value));
    uint32_t fbe_struct_offset = (uint32_t)(this->buffer().allocate(fbe_struct_size) - this->buffer().offset());
    assert(((this->buffer().offset() + fbe_struct_offset + fbe_struct_size) <= this->buffer().size()) && "Model is broken!");
    if ((this->buffer().offset() + fbe_struct_offset + fbe_struct_size) > this->buffer().size())
        return 0;

    fbe_struct_size = (uint32_t)(8 + _model.set(value));
    this->buffer().resize(fbe_initial_size + fbe_struct_size);

    *((uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8)) = fbe_struct_size;
    *((uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4)) = fbe_struct_type;

    return fbe_struct_size;
}

size_t OrderFinalModel::deserialize(::protoex::Order& value) const noexcept
{
    assert(((this->buffer().offset() + _model.fbe_offset()) <= this->buffer().size()) && "Model is broken!");
    if ((this->buffer().offset() + _model.fbe_offset()) > this->buffer().size())
        return 0;

    size_t fbe_struct_size = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8));
    size_t fbe_struct_type = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4));
    assert(((fbe_struct_size > 0) && (fbe_struct_type == fbe_type())) && "Model is broken!");
    if ((fbe_struct_size == 0) || (fbe_struct_type != fbe_type()))
        return 8;

    return 8 + _model.get(value);
}

} // namespace protoex

FinalModel<::protoex::Balance>::FinalModel(FBEBuffer& buffer, size_t offset) noexcept : _buffer(buffer), _offset(offset)
    , parent(buffer, 0)
    , locked(buffer, 0)
{}

size_t FinalModel<::protoex::Balance>::fbe_allocation_size(const ::protoex::Balance& fbe_value) const noexcept
{
    size_t fbe_result = 0
        + parent.fbe_allocation_size(fbe_value)
        + locked.fbe_allocation_size(fbe_value.locked)
        ;
    return fbe_result;
}

size_t FinalModel<::protoex::Balance>::verify() const noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = verify_fields();
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::Balance>::verify_fields() const noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_field_size;

    parent.fbe_offset(fbe_current_offset);
    fbe_field_size = parent.verify_fields();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    locked.fbe_offset(fbe_current_offset);
    fbe_field_size = locked.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    return fbe_current_offset;
}

size_t FinalModel<::protoex::Balance>::get(::protoex::Balance& fbe_value) const noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = get_fields(fbe_value);
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::Balance>::get_fields(::protoex::Balance& fbe_value) const noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_current_size = 0;
    size_t fbe_field_size;

    parent.fbe_offset(fbe_current_offset);
    fbe_field_size = parent.get_fields(fbe_value);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    locked.fbe_offset(fbe_current_offset);
    fbe_field_size = locked.get(fbe_value.locked);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    return fbe_current_size;
}

size_t FinalModel<::protoex::Balance>::set(const ::protoex::Balance& fbe_value) noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = set_fields(fbe_value);
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::Balance>::set_fields(const ::protoex::Balance& fbe_value) noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_current_size = 0;
    size_t fbe_field_size;

    parent.fbe_offset(fbe_current_offset);
    fbe_field_size = parent.set_fields(fbe_value);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    locked.fbe_offset(fbe_current_offset);
    fbe_field_size = locked.set(fbe_value.locked);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    return fbe_current_size;
}

namespace protoex {

bool BalanceFinalModel::verify()
{
    if ((this->buffer().offset() + _model.fbe_offset()) > this->buffer().size())
        return false;

    size_t fbe_struct_size = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8));
    size_t fbe_struct_type = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4));
    if ((fbe_struct_size == 0) || (fbe_struct_type != fbe_type()))
        return false;

    return ((8 + _model.verify()) == fbe_struct_size);
}

size_t BalanceFinalModel::serialize(const ::protoex::Balance& value)
{
    size_t fbe_initial_size = this->buffer().size();

    uint32_t fbe_struct_type = (uint32_t)fbe_type();
    uint32_t fbe_struct_size = (uint32_t)(8 + _model.fbe_allocation_size(value));
    uint32_t fbe_struct_offset = (uint32_t)(this->buffer().allocate(fbe_struct_size) - this->buffer().offset());
    assert(((this->buffer().offset() + fbe_struct_offset + fbe_struct_size) <= this->buffer().size()) && "Model is broken!");
    if ((this->buffer().offset() + fbe_struct_offset + fbe_struct_size) > this->buffer().size())
        return 0;

    fbe_struct_size = (uint32_t)(8 + _model.set(value));
    this->buffer().resize(fbe_initial_size + fbe_struct_size);

    *((uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8)) = fbe_struct_size;
    *((uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4)) = fbe_struct_type;

    return fbe_struct_size;
}

size_t BalanceFinalModel::deserialize(::protoex::Balance& value) const noexcept
{
    assert(((this->buffer().offset() + _model.fbe_offset()) <= this->buffer().size()) && "Model is broken!");
    if ((this->buffer().offset() + _model.fbe_offset()) > this->buffer().size())
        return 0;

    size_t fbe_struct_size = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8));
    size_t fbe_struct_type = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4));
    assert(((fbe_struct_size > 0) && (fbe_struct_type == fbe_type())) && "Model is broken!");
    if ((fbe_struct_size == 0) || (fbe_struct_type != fbe_type()))
        return 8;

    return 8 + _model.get(value);
}

} // namespace protoex

FinalModel<::protoex::Account>::FinalModel(FBEBuffer& buffer, size_t offset) noexcept : _buffer(buffer), _offset(offset)
    , id(buffer, 0)
    , name(buffer, 0)
    , state(buffer, 0)
    , wallet(buffer, 0)
    , asset(buffer, 0)
    , orders(buffer, 0)
{}

size_t FinalModel<::protoex::Account>::fbe_allocation_size(const ::protoex::Account& fbe_value) const noexcept
{
    size_t fbe_result = 0
        + id.fbe_allocation_size(fbe_value.id)
        + name.fbe_allocation_size(fbe_value.name)
        + state.fbe_allocation_size(fbe_value.state)
        + wallet.fbe_allocation_size(fbe_value.wallet)
        + asset.fbe_allocation_size(fbe_value.asset)
        + orders.fbe_allocation_size(fbe_value.orders)
        ;
    return fbe_result;
}

size_t FinalModel<::protoex::Account>::verify() const noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = verify_fields();
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::Account>::verify_fields() const noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_field_size;

    id.fbe_offset(fbe_current_offset);
    fbe_field_size = id.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    name.fbe_offset(fbe_current_offset);
    fbe_field_size = name.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    state.fbe_offset(fbe_current_offset);
    fbe_field_size = state.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    wallet.fbe_offset(fbe_current_offset);
    fbe_field_size = wallet.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    asset.fbe_offset(fbe_current_offset);
    fbe_field_size = asset.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    orders.fbe_offset(fbe_current_offset);
    fbe_field_size = orders.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    return fbe_current_offset;
}

size_t FinalModel<::protoex::Account>::get(::protoex::Account& fbe_value) const noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = get_fields(fbe_value);
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::Account>::get_fields(::protoex::Account& fbe_value) const noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_current_size = 0;
    size_t fbe_field_size;

    id.fbe_offset(fbe_current_offset);
    fbe_field_size = id.get(fbe_value.id);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    name.fbe_offset(fbe_current_offset);
    fbe_field_size = name.get(fbe_value.name);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    state.fbe_offset(fbe_current_offset);
    fbe_field_size = state.get(fbe_value.state);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    wallet.fbe_offset(fbe_current_offset);
    fbe_field_size = wallet.get(fbe_value.wallet);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    asset.fbe_offset(fbe_current_offset);
    fbe_field_size = asset.get(fbe_value.asset);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    orders.fbe_offset(fbe_current_offset);
    fbe_field_size = orders.get(fbe_value.orders);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    return fbe_current_size;
}

size_t FinalModel<::protoex::Account>::set(const ::protoex::Account& fbe_value) noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = set_fields(fbe_value);
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::Account>::set_fields(const ::protoex::Account& fbe_value) noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_current_size = 0;
    size_t fbe_field_size;

    id.fbe_offset(fbe_current_offset);
    fbe_field_size = id.set(fbe_value.id);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    name.fbe_offset(fbe_current_offset);
    fbe_field_size = name.set(fbe_value.name);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    state.fbe_offset(fbe_current_offset);
    fbe_field_size = state.set(fbe_value.state);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    wallet.fbe_offset(fbe_current_offset);
    fbe_field_size = wallet.set(fbe_value.wallet);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    asset.fbe_offset(fbe_current_offset);
    fbe_field_size = asset.set(fbe_value.asset);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    orders.fbe_offset(fbe_current_offset);
    fbe_field_size = orders.set(fbe_value.orders);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    return fbe_current_size;
}

namespace protoex {

bool AccountFinalModel::verify()
{
    if ((this->buffer().offset() + _model.fbe_offset()) > this->buffer().size())
        return false;

    size_t fbe_struct_size = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8));
    size_t fbe_struct_type = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4));
    if ((fbe_struct_size == 0) || (fbe_struct_type != fbe_type()))
        return false;

    return ((8 + _model.verify()) == fbe_struct_size);
}

size_t AccountFinalModel::serialize(const ::protoex::Account& value)
{
    size_t fbe_initial_size = this->buffer().size();

    uint32_t fbe_struct_type = (uint32_t)fbe_type();
    uint32_t fbe_struct_size = (uint32_t)(8 + _model.fbe_allocation_size(value));
    uint32_t fbe_struct_offset = (uint32_t)(this->buffer().allocate(fbe_struct_size) - this->buffer().offset());
    assert(((this->buffer().offset() + fbe_struct_offset + fbe_struct_size) <= this->buffer().size()) && "Model is broken!");
    if ((this->buffer().offset() + fbe_struct_offset + fbe_struct_size) > this->buffer().size())
        return 0;

    fbe_struct_size = (uint32_t)(8 + _model.set(value));
    this->buffer().resize(fbe_initial_size + fbe_struct_size);

    *((uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8)) = fbe_struct_size;
    *((uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4)) = fbe_struct_type;

    return fbe_struct_size;
}

size_t AccountFinalModel::deserialize(::protoex::Account& value) const noexcept
{
    assert(((this->buffer().offset() + _model.fbe_offset()) <= this->buffer().size()) && "Model is broken!");
    if ((this->buffer().offset() + _model.fbe_offset()) > this->buffer().size())
        return 0;

    size_t fbe_struct_size = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8));
    size_t fbe_struct_type = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4));
    assert(((fbe_struct_size > 0) && (fbe_struct_type == fbe_type())) && "Model is broken!");
    if ((fbe_struct_size == 0) || (fbe_struct_type != fbe_type()))
        return 8;

    return 8 + _model.get(value);
}

} // namespace protoex

FinalModel<::protoex::OrderMessage>::FinalModel(FBEBuffer& buffer, size_t offset) noexcept : _buffer(buffer), _offset(offset)
    , body(buffer, 0)
{}

size_t FinalModel<::protoex::OrderMessage>::fbe_allocation_size(const ::protoex::OrderMessage& fbe_value) const noexcept
{
    size_t fbe_result = 0
        + body.fbe_allocation_size(fbe_value.body)
        ;
    return fbe_result;
}

size_t FinalModel<::protoex::OrderMessage>::verify() const noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = verify_fields();
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::OrderMessage>::verify_fields() const noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_field_size;

    body.fbe_offset(fbe_current_offset);
    fbe_field_size = body.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    return fbe_current_offset;
}

size_t FinalModel<::protoex::OrderMessage>::get(::protoex::OrderMessage& fbe_value) const noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = get_fields(fbe_value);
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::OrderMessage>::get_fields(::protoex::OrderMessage& fbe_value) const noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_current_size = 0;
    size_t fbe_field_size;

    body.fbe_offset(fbe_current_offset);
    fbe_field_size = body.get(fbe_value.body);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    return fbe_current_size;
}

size_t FinalModel<::protoex::OrderMessage>::set(const ::protoex::OrderMessage& fbe_value) noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = set_fields(fbe_value);
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::OrderMessage>::set_fields(const ::protoex::OrderMessage& fbe_value) noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_current_size = 0;
    size_t fbe_field_size;

    body.fbe_offset(fbe_current_offset);
    fbe_field_size = body.set(fbe_value.body);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    return fbe_current_size;
}

namespace protoex {

bool OrderMessageFinalModel::verify()
{
    if ((this->buffer().offset() + _model.fbe_offset()) > this->buffer().size())
        return false;

    size_t fbe_struct_size = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8));
    size_t fbe_struct_type = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4));
    if ((fbe_struct_size == 0) || (fbe_struct_type != fbe_type()))
        return false;

    return ((8 + _model.verify()) == fbe_struct_size);
}

size_t OrderMessageFinalModel::serialize(const ::protoex::OrderMessage& value)
{
    size_t fbe_initial_size = this->buffer().size();

    uint32_t fbe_struct_type = (uint32_t)fbe_type();
    uint32_t fbe_struct_size = (uint32_t)(8 + _model.fbe_allocation_size(value));
    uint32_t fbe_struct_offset = (uint32_t)(this->buffer().allocate(fbe_struct_size) - this->buffer().offset());
    assert(((this->buffer().offset() + fbe_struct_offset + fbe_struct_size) <= this->buffer().size()) && "Model is broken!");
    if ((this->buffer().offset() + fbe_struct_offset + fbe_struct_size) > this->buffer().size())
        return 0;

    fbe_struct_size = (uint32_t)(8 + _model.set(value));
    this->buffer().resize(fbe_initial_size + fbe_struct_size);

    *((uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8)) = fbe_struct_size;
    *((uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4)) = fbe_struct_type;

    return fbe_struct_size;
}

size_t OrderMessageFinalModel::deserialize(::protoex::OrderMessage& value) const noexcept
{
    assert(((this->buffer().offset() + _model.fbe_offset()) <= this->buffer().size()) && "Model is broken!");
    if ((this->buffer().offset() + _model.fbe_offset()) > this->buffer().size())
        return 0;

    size_t fbe_struct_size = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8));
    size_t fbe_struct_type = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4));
    assert(((fbe_struct_size > 0) && (fbe_struct_type == fbe_type())) && "Model is broken!");
    if ((fbe_struct_size == 0) || (fbe_struct_type != fbe_type()))
        return 8;

    return 8 + _model.get(value);
}

} // namespace protoex

FinalModel<::protoex::BalanceMessage>::FinalModel(FBEBuffer& buffer, size_t offset) noexcept : _buffer(buffer), _offset(offset)
    , body(buffer, 0)
{}

size_t FinalModel<::protoex::BalanceMessage>::fbe_allocation_size(const ::protoex::BalanceMessage& fbe_value) const noexcept
{
    size_t fbe_result = 0
        + body.fbe_allocation_size(fbe_value.body)
        ;
    return fbe_result;
}

size_t FinalModel<::protoex::BalanceMessage>::verify() const noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = verify_fields();
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::BalanceMessage>::verify_fields() const noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_field_size;

    body.fbe_offset(fbe_current_offset);
    fbe_field_size = body.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    return fbe_current_offset;
}

size_t FinalModel<::protoex::BalanceMessage>::get(::protoex::BalanceMessage& fbe_value) const noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = get_fields(fbe_value);
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::BalanceMessage>::get_fields(::protoex::BalanceMessage& fbe_value) const noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_current_size = 0;
    size_t fbe_field_size;

    body.fbe_offset(fbe_current_offset);
    fbe_field_size = body.get(fbe_value.body);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    return fbe_current_size;
}

size_t FinalModel<::protoex::BalanceMessage>::set(const ::protoex::BalanceMessage& fbe_value) noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = set_fields(fbe_value);
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::BalanceMessage>::set_fields(const ::protoex::BalanceMessage& fbe_value) noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_current_size = 0;
    size_t fbe_field_size;

    body.fbe_offset(fbe_current_offset);
    fbe_field_size = body.set(fbe_value.body);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    return fbe_current_size;
}

namespace protoex {

bool BalanceMessageFinalModel::verify()
{
    if ((this->buffer().offset() + _model.fbe_offset()) > this->buffer().size())
        return false;

    size_t fbe_struct_size = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8));
    size_t fbe_struct_type = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4));
    if ((fbe_struct_size == 0) || (fbe_struct_type != fbe_type()))
        return false;

    return ((8 + _model.verify()) == fbe_struct_size);
}

size_t BalanceMessageFinalModel::serialize(const ::protoex::BalanceMessage& value)
{
    size_t fbe_initial_size = this->buffer().size();

    uint32_t fbe_struct_type = (uint32_t)fbe_type();
    uint32_t fbe_struct_size = (uint32_t)(8 + _model.fbe_allocation_size(value));
    uint32_t fbe_struct_offset = (uint32_t)(this->buffer().allocate(fbe_struct_size) - this->buffer().offset());
    assert(((this->buffer().offset() + fbe_struct_offset + fbe_struct_size) <= this->buffer().size()) && "Model is broken!");
    if ((this->buffer().offset() + fbe_struct_offset + fbe_struct_size) > this->buffer().size())
        return 0;

    fbe_struct_size = (uint32_t)(8 + _model.set(value));
    this->buffer().resize(fbe_initial_size + fbe_struct_size);

    *((uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8)) = fbe_struct_size;
    *((uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4)) = fbe_struct_type;

    return fbe_struct_size;
}

size_t BalanceMessageFinalModel::deserialize(::protoex::BalanceMessage& value) const noexcept
{
    assert(((this->buffer().offset() + _model.fbe_offset()) <= this->buffer().size()) && "Model is broken!");
    if ((this->buffer().offset() + _model.fbe_offset()) > this->buffer().size())
        return 0;

    size_t fbe_struct_size = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8));
    size_t fbe_struct_type = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4));
    assert(((fbe_struct_size > 0) && (fbe_struct_type == fbe_type())) && "Model is broken!");
    if ((fbe_struct_size == 0) || (fbe_struct_type != fbe_type()))
        return 8;

    return 8 + _model.get(value);
}

} // namespace protoex

FinalModel<::protoex::AccountMessage>::FinalModel(FBEBuffer& buffer, size_t offset) noexcept : _buffer(buffer), _offset(offset)
    , body(buffer, 0)
{}

size_t FinalModel<::protoex::AccountMessage>::fbe_allocation_size(const ::protoex::AccountMessage& fbe_value) const noexcept
{
    size_t fbe_result = 0
        + body.fbe_allocation_size(fbe_value.body)
        ;
    return fbe_result;
}

size_t FinalModel<::protoex::AccountMessage>::verify() const noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = verify_fields();
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::AccountMessage>::verify_fields() const noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_field_size;

    body.fbe_offset(fbe_current_offset);
    fbe_field_size = body.verify();
    if (fbe_field_size == std::numeric_limits<std::size_t>::max())
        return std::numeric_limits<std::size_t>::max();
    fbe_current_offset += fbe_field_size;

    return fbe_current_offset;
}

size_t FinalModel<::protoex::AccountMessage>::get(::protoex::AccountMessage& fbe_value) const noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = get_fields(fbe_value);
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::AccountMessage>::get_fields(::protoex::AccountMessage& fbe_value) const noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_current_size = 0;
    size_t fbe_field_size;

    body.fbe_offset(fbe_current_offset);
    fbe_field_size = body.get(fbe_value.body);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    return fbe_current_size;
}

size_t FinalModel<::protoex::AccountMessage>::set(const ::protoex::AccountMessage& fbe_value) noexcept
{
    _buffer.shift(fbe_offset());
    size_t fbe_result = set_fields(fbe_value);
    _buffer.unshift(fbe_offset());
    return fbe_result;
}

size_t FinalModel<::protoex::AccountMessage>::set_fields(const ::protoex::AccountMessage& fbe_value) noexcept
{
    size_t fbe_current_offset = 0;
    size_t fbe_current_size = 0;
    size_t fbe_field_size;

    body.fbe_offset(fbe_current_offset);
    fbe_field_size = body.set(fbe_value.body);
    fbe_current_offset += fbe_field_size;
    fbe_current_size += fbe_field_size;

    return fbe_current_size;
}

namespace protoex {

bool AccountMessageFinalModel::verify()
{
    if ((this->buffer().offset() + _model.fbe_offset()) > this->buffer().size())
        return false;

    size_t fbe_struct_size = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8));
    size_t fbe_struct_type = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4));
    if ((fbe_struct_size == 0) || (fbe_struct_type != fbe_type()))
        return false;

    return ((8 + _model.verify()) == fbe_struct_size);
}

size_t AccountMessageFinalModel::serialize(const ::protoex::AccountMessage& value)
{
    size_t fbe_initial_size = this->buffer().size();

    uint32_t fbe_struct_type = (uint32_t)fbe_type();
    uint32_t fbe_struct_size = (uint32_t)(8 + _model.fbe_allocation_size(value));
    uint32_t fbe_struct_offset = (uint32_t)(this->buffer().allocate(fbe_struct_size) - this->buffer().offset());
    assert(((this->buffer().offset() + fbe_struct_offset + fbe_struct_size) <= this->buffer().size()) && "Model is broken!");
    if ((this->buffer().offset() + fbe_struct_offset + fbe_struct_size) > this->buffer().size())
        return 0;

    fbe_struct_size = (uint32_t)(8 + _model.set(value));
    this->buffer().resize(fbe_initial_size + fbe_struct_size);

    *((uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8)) = fbe_struct_size;
    *((uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4)) = fbe_struct_type;

    return fbe_struct_size;
}

size_t AccountMessageFinalModel::deserialize(::protoex::AccountMessage& value) const noexcept
{
    assert(((this->buffer().offset() + _model.fbe_offset()) <= this->buffer().size()) && "Model is broken!");
    if ((this->buffer().offset() + _model.fbe_offset()) > this->buffer().size())
        return 0;

    size_t fbe_struct_size = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 8));
    size_t fbe_struct_type = *((const uint32_t*)(this->buffer().data() + this->buffer().offset() + _model.fbe_offset() - 4));
    assert(((fbe_struct_size > 0) && (fbe_struct_type == fbe_type())) && "Model is broken!");
    if ((fbe_struct_size == 0) || (fbe_struct_type != fbe_type()))
        return 8;

    return 8 + _model.get(value);
}

} // namespace protoex

} // namespace FBE
