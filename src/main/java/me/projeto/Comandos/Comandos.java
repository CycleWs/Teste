package me.projeto.comandos;

import me.projeto.kits.kitLenhador;
import me.projeto.kits.kitMagico;
import me.projeto.kits.kitVoar;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Comandos implements CommandExecutor {

    public static ItemStack wand;
    public static ItemStack voar;

    private HashMap<Player, Long> kit = new HashMap<>();

    @Override
    public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
        if (!(s instanceof Player)) return false;
        Player p = (Player) s;

        if (c.getName().equalsIgnoreCase("kit")) {
            if (kit.containsKey(p) && !(System.currentTimeMillis() >= kit.get(p))) {
                p.sendMessage("§aAguarde, Comando em cooldown! " + converter(p) + " §aSegundos!");
                return false;
            } else kit.remove(p);

            kit.put(p, System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(2));

            if (args.length == 0) {
                p.sendMessage("");
                p.sendMessage("§a/kit Lenhador - pra selecionar o kit Lenhador");
                p.sendMessage("§a/kit Voar - pra selecionar o kit Voar");
                p.sendMessage("§a/kit Magico - pra selecionar o kit Magico");
                p.sendMessage("");
                return true;
            }

            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("lenhador")) {
                    kitLenhador.Lenhador(p);
                    return true;
                }
                if (args[0].equalsIgnoreCase("Voar")) {
                    kitVoar.Voar(p);
                    return true;
                }
            }
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase(("Magico"))) {
                    kitMagico.Magico(p);
                    return true;
                }
            }
        }
        return false;
    }
    private Long converter (Player p){
        long tempo = System.currentTimeMillis() - kit.get(p);
        return 1 + TimeUnit.MILLISECONDS.toSeconds(tempo) * -1;
    }
}
