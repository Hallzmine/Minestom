package net.minestom.server.permission;

import net.minestom.server.command.CommandSender;

/**
 * Basic {@link Permission} implementation that only requires the permission to be given to the {@link CommandSender} to be considered applied
 * (eg. no arguments)
 */
public class BasicPermission implements Permission {
    @Override
    public boolean isValidFor(CommandSender commandSender) {
        return true;
    }
}
