package com.iridium.iridiumskyblock.commands;

import com.iridium.iridiumskyblock.IridiumSkyblock;
import com.iridium.iridiumskyblock.utils.StringUtils;
import org.bukkit.command.CommandSender;

import java.util.Collections;
import java.util.List;

/**
 * Command which allows the Admins to quickly reload the configuration files without a restart.
 */
public class ReloadCommand extends Command {

    /**
     * The default constructor.
     */
    public ReloadCommand() {
        super(Collections.singletonList("reload"), "Reload your configurations", "iridiumskyblock.reload", false);
    }

    /**
     * Executes the command for the specified {@link CommandSender} with the provided arguments.
     * Not called when the command execution was invalid (no permission, no player or command disabled).
     * Reloads all configuration files.
     *
     * @param sender The CommandSender which executes this command
     * @param args   The arguments used with this command. They contain the sub-command
     */
    @Override
    public void execute(CommandSender sender, String[] args) {
        IridiumSkyblock.getInstance().loadConfigs();
        sender.sendMessage(StringUtils.color(IridiumSkyblock.getInstance().getMessages().reloaded.replace("%prefix%", IridiumSkyblock.getInstance().getConfiguration().prefix)));
    }

    /**
     * Handles tab-completion for this command.
     *
     * @param commandSender The CommandSender which tries to tab-complete
     * @param command       The command
     * @param label         The label of the command
     * @param args          The arguments already provided by the sender
     * @return The list of tab completions for this command
     */
    @Override
    public List<String> onTabComplete(CommandSender commandSender, org.bukkit.command.Command command, String label, String[] args) {
        return null;
    }

}
