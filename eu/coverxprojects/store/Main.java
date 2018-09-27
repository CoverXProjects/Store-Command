package eu.coverxprojects.store;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin
  implements CommandExecutor, Listener
{
  public static Main plugin;
  
  public void onEnable()
  {
    System.out.println("CoverXProjects [Loaded Store]");
    registerConfig();
    getCommand("store").setExecutor(new Store(this));
    PluginManager pm = getServer().getPluginManager();
    getServer().getPluginManager().registerEvents(this, this);
    pm.registerEvents(this, this);
      }

  
  private void registerConfig()
  {
    getConfig().options().copyDefaults(true);
    saveConfig();
  }
  
  public void onDisable()
  {
    System.out.println("CoverXProjects [Unloaded Store]");
  }
}
