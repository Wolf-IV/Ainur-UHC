package com.Wolf_IV.AnuirUHC.Role;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.Wolf_IV.AnuirUHC.Search;
import com.Wolf_IV.AnuirUHC.Commands.CStart;
import com.Wolf_IV.AnuirUHC.Timers.TimerTasks;

public class Manwe {
	public static boolean mNext = false;
	public static void nDay(CStart p) {
		if(p.manw� == null) {
			return;
		}
		//executer quand un jour passe
		
		p.manw�.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200*20, 0 /*jour*/, false, false));
		if(mNext == true) {
			p.manw�.sendMessage("�6Votre fr�re Melkor �t� a 50 blocks de vous le jour dernier");
			p.manw�.playSound(p.manw�.getLocation(), Sound.NOTE_BASS_DRUM, 10.0F, 0.0F);
					
			mNext = false;
		}
		Player pl[] = Search.pNext(p.manw�, p, 50);
		for(Player player : pl) {
			if(p.Melkor != null && player == p.Melkor) {
				mNext = true;
			}
		}
		
		
	}
}
