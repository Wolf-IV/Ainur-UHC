package com.Wolf_IV.AnuirUHC.Commands;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.Wolf_IV.AnuirUHC.MainA;
import com.Wolf_IV.AnuirUHC.Timers.TimerTasks;

public class CStart implements CommandExecutor {
	Random rand = new Random();
	int rando;
	int nubPlayer=0;
	int nubjou=0;
	Player container;
	int choose;
	int choose2;
	int i;
	
	
	public Player jou[]=new Player[24+1];
	public Player evil[]=new Player[9+1];
	public Player Feanor;
	public Player Melkor;
	public Player ungoliant;
	public Player balrog[]=new Player[7+1];
	public Player balrog_infiltr�;
	public Player balrog_traceur;
	public Player sauron;
	public Player Eru_Iluvatar;
	public Player manw�;
	public Player orom�;
	public Player namo;
	public Player sauruman;
	public Player gandalf;
	public Player lorien;
	public Player scorcier_bleu_1;
	public Player scorcier_bleu_2;
	public Player aul�;
	public Player fingolfin;
	public Player varda;
	public Player maedhros;
	public Player tulkas;
	
	
	
		private static MainA main;
		public CStart(MainA mainA) { 
			this.main= mainA;
			
		}
		//bleu/jaune noir/blanc vert/magenta 
		/*playerO.getInventory().setHeldItemSlot(0);
		 ItemStack Green = new ItemStack(Material.INK_SACK, 1, (short)0, DyeColor.MAGENTA.getData());
		ItemMeta customG = Green.getItemMeta();
		customG.setDisplayName(Nvert);
		Green.setItemMeta(customG);
		playerO.getInventory().setItemInHand(Green);*/
		
		//Note: PotionEffect(PotionEffectType type, int duration, int ampflier, boolean ambient, boolean showParticles) 
		//Note: https://www.spigotmc.org/threads/partially-invisible.197565/#post-2057708 Invisible completement

		@Override
		public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
			
			
			if(sender instanceof Player) {
				if(cmd.getName().equalsIgnoreCase("startainuruhc")) {
					Player player = (Player) sender;
					TimerTasks tasks = new TimerTasks(main, this);
					tasks.runTaskTimer(main, 0, 20);
					TimerTasks.starting=true;
					
					for (Player playerO : Bukkit.getServer().getOnlinePlayers()) {
						nubPlayer++;
					}
					if(nubPlayer==24) {
						for (Player playerO : Bukkit.getServer().getOnlinePlayers()) {
							nubjou++;
							jou[nubjou]=playerO;
						}
						rando=rand.nextInt(250)+50;
						for(i=0;i<=rando;i++) {
							choose=rand.nextInt(24)+1;
							choose2=rand.nextInt(24)+1;
							container=jou[choose2];
							jou[choose2]=jou[choose];
							jou[choose]=container;
							}
						
						Melkor=jou[1];
						sauron=jou[2];
						ungoliant=jou[3];
						balrog[1]=jou[4];
						balrog[2]=jou[5];
						balrog[3]=jou[6];
						balrog[4]=jou[7];
						balrog[5]=jou[8];
						balrog[6]=jou[9];
						balrog[7]=ungoliant;
						for(i=1;i<=9;i++) {
							evil[i]=jou[i];
						}
						
						
						rando=rand.nextInt(50)+10;
						for(i=0;i<=rando;i++) {
							choose=rand.nextInt(5)+1;
							choose2=rand.nextInt(5)+1;
							container=balrog[choose2];
							balrog[choose2]=balrog[choose];
							balrog[choose]=container;
							}
						
						
						balrog_infiltr�=balrog[1];
						balrog_traceur=balrog[2];
						
						rando=rand.nextInt(50)+10;
						for(i=0;i<=rando;i++) {
							choose=rand.nextInt(5)+1;
							choose2=rand.nextInt(5)+1;
							container=balrog[choose2];
							balrog[choose2]=balrog[choose];
							balrog[choose]=container;
							}
						
						
						Feanor=jou[10];
						Eru_Iluvatar=jou[11];
						manw�=jou[12];
						orom�=jou[13];
						namo=jou[14];
						sauruman=jou[15];
						gandalf=jou[16];
						lorien=jou[17];
						scorcier_bleu_1=jou[18];
						scorcier_bleu_2=jou[19];
						aul�=jou[20];
						fingolfin=jou[21];
						varda=jou[22];
						maedhros=jou[23];
						tulkas=jou[24];
						
						rando=rand.nextInt(50)+10;
						for(i=0;i<=rando;i++) {
							choose=rand.nextInt(5)+1;
							choose2=rand.nextInt(5)+1;
							container=balrog[choose2];
							balrog[choose2]=balrog[choose];
							balrog[choose]=container;
							}
						
						rando=rand.nextInt(250)+50;
						for(i=0;i<=rando;i++) {
							choose=rand.nextInt(24)+1;
							choose2=rand.nextInt(24)+1;
							container=jou[choose2];
							jou[choose2]=jou[choose];
							jou[choose]=container;
							}
						
						
						
					}else {
						if(args.length!=0) {
							Bukkit.broadcastMessage("player: "+nubPlayer);
							Bukkit.broadcastMessage("role: "+args.length);
							
							if(args.length<=nubPlayer) {
								i=-1;//car il y a args[0] le premier role
								for (Player playerO : Bukkit.getServer().getOnlinePlayers()) {
									i++;
									if(args.length>=i) {
										
										
										Bukkit.broadcastMessage("args: "+args[0]);
										int balnub=1;
										int evilnub=1;
										int scb=1;
										if(args[i].equalsIgnoreCase("melkor")) {
											Melkor=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Melkor");
											evil[evilnub]=playerO;
											evilnub++;
										}else if(args[i].equalsIgnoreCase("sauron")) {
											sauron=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Sauron");
											evil[evilnub]=playerO;
											evilnub++;
										}else if(args[i].equalsIgnoreCase("ungoliant")) {
											ungoliant=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Ungoliant");
											evil[evilnub]=playerO;
											evilnub++;
											balrog[balnub]=playerO;
											balnub++;
										}else if(args[i].equalsIgnoreCase("balrog_infiltr�")) {
											balrog_infiltr�=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Balrog Infiltr�");
											evil[evilnub]=playerO;
											evilnub++;
											balrog[balnub]=playerO;
											balnub++;
										}else if(args[i].equalsIgnoreCase("balrog_traceur")) {
											balrog_traceur=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Balrog Traceur");
											evil[evilnub]=playerO;
											evilnub++;
											balrog[balnub]=playerO;
											balnub++;
										}else if(args[i].equalsIgnoreCase("balrog")) {
											balrog_traceur=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Balrog");
											evil[evilnub]=playerO;
											evilnub++;
											balrog[balnub]=playerO;
											balnub++;
										}else if(args[i].equalsIgnoreCase("feanor")) {
											Feanor=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est F�anor");
										}else if(args[i].equalsIgnoreCase("eru_iluvatar")) {
											Eru_Iluvatar=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Eru Iluvatar");
										}else if(args[i].equalsIgnoreCase("manw�")) {
											manw�=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Manw�");
										}else if(args[i].equalsIgnoreCase("orom�")) {
											orom�=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Orom�");
										}else if(args[i].equalsIgnoreCase("manw�")) {
											manw�=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Manw�");
										}else if(args[i].equalsIgnoreCase("namo")) {
											namo=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Namo");
										}else if(args[i].equalsIgnoreCase("sauruman")) {
											sauruman=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Sauruman");
										}else if(args[i].equalsIgnoreCase("gandalf")) {
											gandalf=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Gandalf");
										}else if(args[i].equalsIgnoreCase("lorien")) {
											lorien=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Lorien");
										}else if(args[i].equalsIgnoreCase("scorcier_bleu")) {
											if(scb==1) {
											scorcier_bleu_1=playerO;
											}else {
												scorcier_bleu_2=playerO;
											}
											Bukkit.broadcastMessage(""+playerO.getName()+" est Scorcier Bleu");
										}else if(args[i].equalsIgnoreCase("aul�")) {
											aul�=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Aul�");
										}else if(args[i].equalsIgnoreCase("fingolfin")) {
											fingolfin=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Fingolfin");
										}else if(args[i].equalsIgnoreCase("varda")) {
											varda=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Varda");
										}else if(args[i].equalsIgnoreCase("maedhros")) {
											maedhros=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Maedhros");
										}else if(args[i].equalsIgnoreCase("tulkas")) {
											tulkas=playerO;
											Bukkit.broadcastMessage(""+playerO.getName()+" est Tulkas");
										}
									
									
									
									
									}
								}
							}else {
								Bukkit.broadcastMessage("�4Trop de role pour "+nubPlayer+" joueur(s)");
								return true;
							}
								
						Bukkit.broadcastMessage("La game se lance en essaie (Ce n'est pas une vrai game)");
						}else {
							Bukkit.broadcastMessage("�4Il n'y a pas assez de joueur");
							return true;
						}
					}
					
					
					
					
					
					
					
					return true;
				}
			}
			return false;
		}

	}
