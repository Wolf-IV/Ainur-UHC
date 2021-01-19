package com.Wolf_IV.AnuirUHC;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.Wolf_IV.AnuirUHC.Commands.CStart;
import com.Wolf_IV.AnuirUHC.Timers.TimerTasks;

public class CBR implements CommandExecutor {

	CStart p;
	public CBR(CStart cstart) {
		p = cstart;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		if(sender instanceof Player) {
			if(cmd.getName().equalsIgnoreCase("br")) {
				Player player = (Player)sender;
				
				player.getInventory().setHeldItemSlot(0);
				 ItemStack G = new ItemStack(Material.INK_SACK, 1, (short)0, DyeColor.MAGENTA/*Green*/.getData());
				ItemMeta customG = G.getItemMeta();
				customG.setDisplayName("�aSilmaril Vert");
				customG.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
				customG.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				G.setItemMeta(customG);
				p.SG = G;
				p.SVert = player.getDisplayName();
				player.getInventory().setItemInHand(G);
				
				player.getInventory().setHeldItemSlot(1);
				ItemStack R = new ItemStack(Material.INK_SACK, 1, (short)0, DyeColor.ORANGE/*RED*/.getData());
				ItemMeta customR = R.getItemMeta();
				customR.setDisplayName("�cSilmaril Rouge");
				customR.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
				customR.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				R.setItemMeta(customR);
				p.SR = R;
				p.SRouge = player.getDisplayName();
				player.getInventory().setItemInHand(R);
				
				player.getInventory().setHeldItemSlot(2);
				ItemStack B = new ItemStack(Material.INK_SACK, 1, (short)0, DyeColor.PINK/*CYAN*/.getData());
				ItemMeta customB = B.getItemMeta();
				customB.setDisplayName("�bSilmaril Bleu");
				customB.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
				customB.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				B.setItemMeta(customB);
				p.SB = B;
				p.SBleu = player.getDisplayName();
				player.getInventory().setItemInHand(B);
				if(TimerTasks.role==false) {
					player.sendMessage("�4Les role n'ont pas �t� donn�");
					return false;
				}
				for(Player balrog : p.balrogC) {
					if(balrog != null && player == balrog || player == p.Melkor || player == p.sauron) {
						player.sendMessage("�cVoici la liste des balrog:");
						player.sendMessage("�4------------");
						for(int i = 1; i<=p.nubPlayer; i++) {
							if(p.jouS[i] != null && p.jouD[i] == true) {
						for(String mechant : p.evilS) {
							if(mechant == p.jouS[i]) {
								player.sendMessage("�3"+mechant);
							}
						}
						}
						}
						player.sendMessage("�4------------");
						return true;
				}
				}
			}
			}
		return false;
	}
	
}