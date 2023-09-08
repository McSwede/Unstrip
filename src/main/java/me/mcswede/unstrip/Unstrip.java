package me.mcswede.unstrip;

import org.bukkit.plugin.java.JavaPlugin;
import me.mcswede.unstrip.events.OnAxeUse;

public final class Unstrip extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new OnAxeUse(), this);
    }
}
