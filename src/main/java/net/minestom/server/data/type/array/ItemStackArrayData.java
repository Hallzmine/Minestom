package net.minestom.server.data.type.array;

import net.minestom.server.data.DataType;
import net.minestom.server.item.ItemStack;
import net.minestom.server.utils.binary.BinaryReader;
import net.minestom.server.utils.binary.BinaryWriter;

public class ItemStackArrayData extends DataType<ItemStack[]> {
    @Override
    public void encode(BinaryWriter writer, ItemStack[] value) {
        writer.writeVarInt(value.length);
        for (ItemStack itemStack : value) {
            writer.writeItemStack(itemStack);
        }
    }

    @Override
    public ItemStack[] decode(BinaryReader reader) {
        ItemStack[] items = new ItemStack[reader.readVarInt()];
        for (int i = 0; i < items.length; i++) {
            items[i] = reader.readSlot();
        }
        return items;
    }
}
