package net.minestom.server.data;

import java.util.Collections;
import java.util.Set;

/**
 * Represents an object which contain key/value based data.
 * <p>
 * See {@link DataImpl} for the default implementation.
 */
public interface Data {

    Data EMPTY = new Data() {
        @Override
        public <T> void set(String key, T value, Class<T> type) {
        }

        @Override
        public <T> T get(String key) {
            return null;
        }

        @Override
        public boolean hasKey(String key) {
            return false;
        }

        @Override
        public Set<String> getKeys() {
            return Collections.emptySet();
        }

        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public Data clone() {
            return this;
        }

        @Override
        public <T> T getOrDefault(String key, T defaultValue) {
            return defaultValue;
        }
    };

    /**
     * Sets a value to a specific key.
     *
     * @param key   the key
     * @param value the value object
     * @param type  the value type
     * @param <T>   the value generic
     */
    <T> void set(String key, T value, Class<T> type);

    /**
     * Retrieves a value based on its key.
     *
     * @param key the key
     * @param <T> the value type
     * @return the data associated with the key or null
     */
    <T> T get(String key);

    /**
     * Retrieves a value based on its key, give a default value if not found.
     *
     * @param key          the key
     * @param defaultValue the value to return if the key is not found
     * @param <T>          the value type
     * @return {@link #get(String)} if found, {@code defaultValue} otherwise
     */
    <T> T getOrDefault(String key, T defaultValue);

    /**
     * Gets if the data has a key.
     *
     * @param key the key to check
     * @return true if the data contains the key
     */
    boolean hasKey(String key);

    /**
     * Gets the list of data keys.
     *
     * @return an unmodifiable {@link Set} containing all keys
     */
    Set<String> getKeys();

    /**
     * Gets if the data is empty or not.
     *
     * @return true if the data does not contain anything, false otherwise
     */
    boolean isEmpty();

    /**
     * Clones this data.
     *
     * @return a cloned data object
     */
    Data clone();

}
