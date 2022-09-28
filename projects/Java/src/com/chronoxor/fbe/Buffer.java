//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.13.0.0
//------------------------------------------------------------------------------

package com.chronoxor.fbe;

// Fast Binary Encoding buffer based on dynamic byte array
public class Buffer
{
    private byte[] _data;
    private long _size;
    private long _offset;

    // Is the buffer empty?
    public boolean isEmpty() { return (_data == null) || (_size == 0); }
    // Get bytes memory buffer
    public byte[] getData() { return _data; }
    // Get bytes memory buffer capacity
    public long getCapacity() { return _data.length; }
    // Get bytes memory buffer size
    public long getSize() { return _size; }
    // Get bytes memory buffer offset
    public long getOffset() { return _offset; }

    // Initialize a new expandable buffer with zero capacity
    public Buffer() { attach(); }
    // Initialize a new expandable buffer with the given capacity
    public Buffer(long capacity) { attach(capacity); }
    // Initialize a new buffer based on the specified byte array
    public Buffer(byte[] buffer) { attach(buffer); }
    // Initialize a new buffer based on the specified region (offset) of a byte array
    public Buffer(byte[] buffer, long offset) { attach(buffer, offset); }
    // Initialize a new buffer based on the specified region (size and offset) of a byte array
    public Buffer(byte[] buffer, long size, long offset) { attach(buffer, size, offset); }

    // Attach memory buffer methods
    public void attach() { _data = new byte[0]; _size = 0; _offset = 0; }
    public void attach(long capacity) { _data = new byte[(int)capacity]; _size = 0; _offset = 0; }
    public void attach(byte[] buffer) { _data = buffer; _size = buffer.length; _offset = 0; }
    public void attach(byte[] buffer, long offset) { _data = buffer; _size = buffer.length; _offset = offset; }
    public void attach(byte[] buffer, long size, long offset) { _data = buffer; _size = size; _offset = offset; }

    // Allocate memory in the current buffer and return offset to the allocated memory block
    public long allocate(long size)
    {
        assert (size >= 0) : "Invalid allocation size!";
        if (size < 0)
            throw new IllegalArgumentException("Invalid allocation size!");

        long offset = _size;

        // Calculate a new buffer size
        long total = _size + size;

        if (total <= _data.length)
        {
            _size = total;
            return offset;
        }

        byte[] data = new byte[(int)Math.max(total, 2 * _data.length)];
        System.arraycopy(_data, 0, data, 0, (int)_size);
        _data = data;
        _size = total;
        return offset;
    }

    // Remove some memory of the given size from the current buffer
    public void remove(long offset, long size)
    {
        assert ((offset + size) <= _size) : "Invalid offset & size!";
        if ((offset + size) > _size)
            throw new IllegalArgumentException("Invalid offset & size!");

        System.arraycopy(_data, (int)(offset + size), _data, (int)offset, (int)(_size - size - offset));
        _size -= size;
        if (_offset >= (offset + size))
            _offset -= size;
        else if (_offset >= offset)
        {
            _offset -= _offset - offset;
            if (_offset > _size)
                _offset = _size;
        }
    }

    // Reserve memory of the given capacity in the current buffer
    public void reserve(long capacity)
    {
        assert (capacity >= 0) : "Invalid reserve capacity!";
        if (capacity < 0)
            throw new IllegalArgumentException("Invalid reserve capacity!");

        if (capacity > _data.length)
        {
            byte[] data = new byte[(int)Math.max(capacity, 2 * _data.length)];
            System.arraycopy(_data, 0, data, 0, (int)_size);
            _data = data;
        }
    }

    // Resize the current buffer
    public void resize(long size)
    {
        reserve(size);
        _size = size;
        if (_offset > _size)
            _offset = _size;
    }

    // Reset the current buffer and its offset
    public void reset()
    {
        _size = 0;
        _offset = 0;
    }

    // Shift the current buffer offset
    public void shift(long offset) { _offset += offset; }
    // Unshift the current buffer offset
    public void unshift(long offset) { _offset -= offset; }

    // Buffer I/O methods

    public static boolean readBoolean(byte[] buffer, long offset)
    {
        return buffer[(int)offset] != 0;
    }

    public static byte readByte(byte[] buffer, long offset)
    {
        return buffer[(int)offset];
    }

    public static char readChar(byte[] buffer, long offset)
    {
        return (char)readInt8(buffer, offset);
    }

    public static char readWChar(byte[] buffer, long offset)
    {
        return (char)readInt32(buffer, offset);
    }

    public static byte readInt8(byte[] buffer, long offset)
    {
        return buffer[(int)offset];
    }

    public static short readInt16(byte[] buffer, long offset)
    {
        return (short)(((buffer[(int)offset + 0] & 0xFF) << 0) | ((buffer[(int)offset + 1] & 0xFF) << 8));
    }

    public static int readInt32(byte[] buffer, long offset)
    {
        return ((buffer[(int)offset + 0] & 0xFF) <<  0)|
               ((buffer[(int)offset + 1] & 0xFF) <<  8)|
               ((buffer[(int)offset + 2] & 0xFF) << 16)|
               ((buffer[(int)offset + 3] & 0xFF) << 24);
    }

    public static long readInt64(byte[] buffer, long offset)
    {
        return (((long)buffer[(int)offset + 0] & 0xFF) <<  0)|
               (((long)buffer[(int)offset + 1] & 0xFF) <<  8)|
               (((long)buffer[(int)offset + 2] & 0xFF) << 16)|
               (((long)buffer[(int)offset + 3] & 0xFF) << 24)|
               (((long)buffer[(int)offset + 4] & 0xFF) << 32)|
               (((long)buffer[(int)offset + 5] & 0xFF) << 40)|
               (((long)buffer[(int)offset + 6] & 0xFF) << 48)|
               (((long)buffer[(int)offset + 7] & 0xFF) << 56);
    }

    private static long readInt64BE(byte[] buffer, long offset)
    {
        return (((long)buffer[(int)offset + 0] & 0xFF) << 56)|
               (((long)buffer[(int)offset + 1] & 0xFF) << 48)|
               (((long)buffer[(int)offset + 2] & 0xFF) << 40)|
               (((long)buffer[(int)offset + 3] & 0xFF) << 32)|
               (((long)buffer[(int)offset + 4] & 0xFF) << 24)|
               (((long)buffer[(int)offset + 5] & 0xFF) << 16)|
               (((long)buffer[(int)offset + 6] & 0xFF) <<  8)|
               (((long)buffer[(int)offset + 7] & 0xFF) <<  0);
    }

    public static float readFloat(byte[] buffer, long offset)
    {
        int bits = readInt32(buffer, offset);
        return Float.intBitsToFloat(bits);
    }

    public static double readDouble(byte[] buffer, long offset)
    {
        long bits = readInt64(buffer, offset);
        return Double.longBitsToDouble(bits);
    }

    public static byte[] readBytes(byte[] buffer, long offset, long size)
    {
        byte[] result = new byte[(int)size];
        System.arraycopy(buffer, (int)offset, result, 0, (int)size);
        return result;
    }

    public static String readString(byte[] buffer, long offset, long size)
    {
        return new String(buffer, (int)offset, (int)size, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static java.util.UUID readUUID(byte[] buffer, long offset)
    {
        return new java.util.UUID(readInt64BE(buffer, offset), readInt64BE(buffer, offset + 8));
    }

    public static void write(byte[] buffer, long offset, boolean value)
    {
        buffer[(int)offset] = (byte)(value ? 1 : 0);
    }

    public static void write(byte[] buffer, long offset, byte value)
    {
        buffer[(int)offset] = value;
    }

    public static void write(byte[] buffer, long offset, short value)
    {
        buffer[(int)offset + 0] = (byte)(value >>  0);
        buffer[(int)offset + 1] = (byte)(value >>  8);
    }

    public static void write(byte[] buffer, long offset, int value)
    {
        buffer[(int)offset + 0] = (byte)(value >>  0);
        buffer[(int)offset + 1] = (byte)(value >>  8);
        buffer[(int)offset + 2] = (byte)(value >> 16);
        buffer[(int)offset + 3] = (byte)(value >> 24);
    }

    public static void write(byte[] buffer, long offset, long value)
    {
        buffer[(int)offset + 0] = (byte)(value >>  0);
        buffer[(int)offset + 1] = (byte)(value >>  8);
        buffer[(int)offset + 2] = (byte)(value >> 16);
        buffer[(int)offset + 3] = (byte)(value >> 24);
        buffer[(int)offset + 4] = (byte)(value >> 32);
        buffer[(int)offset + 5] = (byte)(value >> 40);
        buffer[(int)offset + 6] = (byte)(value >> 48);
        buffer[(int)offset + 7] = (byte)(value >> 56);
    }

    private static void writeBE(byte[] buffer, long offset, long value)
    {
        buffer[(int)offset + 0] = (byte)(value >> 56);
        buffer[(int)offset + 1] = (byte)(value >> 48);
        buffer[(int)offset + 2] = (byte)(value >> 40);
        buffer[(int)offset + 3] = (byte)(value >> 32);
        buffer[(int)offset + 4] = (byte)(value >> 24);
        buffer[(int)offset + 5] = (byte)(value >> 16);
        buffer[(int)offset + 6] = (byte)(value >>  8);
        buffer[(int)offset + 7] = (byte)(value >>  0);
    }

    public static void write(byte[] buffer, long offset, float value)
    {
        int bits = Float.floatToIntBits(value);
        write(buffer, offset, bits);
    }

    public static void write(byte[] buffer, long offset, double value)
    {
        long bits = Double.doubleToLongBits(value);
        write(buffer, offset, bits);
    }

    public static void write(byte[] buffer, long offset, byte[] value)
    {
        System.arraycopy(value, 0, buffer, (int)offset, value.length);
    }

    public static void write(byte[] buffer, long offset, byte[] value, long valueOffset, long valueSize)
    {
        System.arraycopy(value, (int)valueOffset, buffer, (int)offset, (int)valueSize);
    }

    public static void write(byte[] buffer, long offset, byte value, long valueCount)
    {
        for (long i = 0; i < valueCount; i++)
            buffer[(int)(offset + i)] = value;
    }

    public static void write(byte[] buffer, long offset, java.util.UUID value)
    {
        writeBE(buffer, offset, value.getMostSignificantBits());
        writeBE(buffer, offset + 8, value.getLeastSignificantBits());
    }
}
