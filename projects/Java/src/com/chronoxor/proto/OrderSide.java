//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package com.chronoxor.proto;

public final class OrderSide implements Comparable<OrderSide>
{
    public static final OrderSide buy = new OrderSide(OrderSideEnum.buy);
    public static final OrderSide sell = new OrderSide(OrderSideEnum.sell);

    private OrderSideEnum value = OrderSideEnum.values()[0];

    public OrderSide() {}
    public OrderSide(byte value) { setEnum(value); }
    public OrderSide(OrderSideEnum value) { setEnum(value); }
    public OrderSide(OrderSide value) { setEnum(value); }

    public OrderSideEnum getEnum() { return value; }
    public byte getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((byte)0); }

    public void setEnum(byte value) { this.value = OrderSideEnum.mapValue(value); }
    public void setEnum(OrderSideEnum value) { this.value = value; }
    public void setEnum(OrderSide value) { this.value = value.value; }

    @Override
    public int compareTo(OrderSide other)
    {
        if (value == null)
            return -1;
        if (other.value == null)
            return 1;
        return (int)(value.getRaw() - other.value.getRaw());
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!OrderSide.class.isAssignableFrom(other.getClass()))
            return false;

        final OrderSide enm = (OrderSide)other;

        if ((value == null) || (enm.value == null))
            return false;
        if (value.getRaw() != enm.value.getRaw())
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + ((value != null) ? value.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() { return (value != null) ? value.toString() : "<unknown>"; }
}
