package net.minestom.server.data;

import net.minestom.server.utils.binary.BinaryReader;
import net.minestom.server.utils.binary.BinaryWriter;

/**
 * Represents an object which can be encoded and decoded back.
 * <p>
 * Used by {@link DataManager} for {@link SerializableDataImpl}
 * and by the storage API in {@link net.minestom.server.storage.StorageLocation}.
 *
 * @param <T> the type of the object
 */
public abstract class DataType<T> {

    /**
     * Encode the data type
     *
     * @param writer the data writer
     * @param value  the value to encode
     */
    public abstract void encode(BinaryWriter writer, T value);

    /**
     * Decode the data type
     *
     * @param reader the data reader
     * @return the decoded value
     */
    public abstract T decode(BinaryReader reader);

}