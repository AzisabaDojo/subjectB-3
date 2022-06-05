package com.github.meru.subjectb3.command;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class KickCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!command.getName().equals("kick")) {
            return false;
        }

        if (!sender.hasPermission("subjectb3.command.kick")) {
            return false;
        }

        Player target = Bukkit.getPlayerExact(args[1]);
        if (target == null) {
            sender.sendMessage(Component.text("指定したプレイヤーは存在しません", NamedTextColor.RED));
            return false;
        }

        target.kick();
        sender.sendMessage(Component.text(target.getName() + "をKickしました。", NamedTextColor.YELLOW));

        return true;
    }

}
