package eu.coverxprojects.store;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Store
  implements CommandExecutor
{
  private Main plugin;
  
  public Store(Main pl)
  {
    this.plugin = pl;
  }
  
  public boolean onCommand(CommandSender arg0, Command command, String label, String[] args)
  {
    if (!(arg0 instanceof Player))
    {
        String Prefix = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Prefix"));
        String Store = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Store"));
        System.out.println(Prefix + " " + Store);
      return false;
    }
    Player p = (Player)arg0;
    
    String Prefix = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Prefix"));
    String Store = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Store"));
    p.sendMessage(Prefix + " " + Store);
    return false;
  }
}
