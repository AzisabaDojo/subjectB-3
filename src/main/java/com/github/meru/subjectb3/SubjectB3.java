package com.github.meru.subjectb3;

import com.github.meru.subjectb3.command.BanCommand;
import com.github.meru.subjectb3.command.KickCommand;
import com.github.meru.subjectb3.command.UUIDCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class SubjectB3 extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("ban")).setExecutor(new BanCommand());
        Objects.requireNonNull(getCommand("kick")).setExecutor(new KickCommand());
        Objects.requireNonNull(getCommand("uuid")).setExecutor(new UUIDCommand());
    }

}
