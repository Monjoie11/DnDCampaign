package com.example.pojo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Campaign {
	
	public static enum Race{
		Aarakocra, Asimaar, Dragonborn, Bugbear, Dwarf, Elf, Feral_Tiefling, 
		Firblog, Genasi, Goblin, Kenku, Koblod, Lizardfolk, Half_ORC, Gnome,
		Goliath, Half_ELF, Halfling, Hobgoblin, Human, ORC, Tabaxi, 
		Yuan_ti_Purebloods, Triton, Warforged, Tortle;
		
		private static final List<Race> RACE_VALUES =
			    Collections.unmodifiableList(Arrays.asList(values()));
		
		private static final int SIZE = RACE_VALUES.size();
			  
		private static final Random RANDOM = new Random();
		
		 public static Race randomRace()  {
			    return RACE_VALUES.get(RANDOM.nextInt(SIZE));
			  }
	}
	
	public static enum CharacterClass{
		Barbarian, Bard, Cleric, Druid, Fighter,
		Monk, Paladin, Ranger, Rogue, Sorcerer,	Warlock,
		Wizard;
		
		private static final List<CharacterClass> CHARACTER_CLASS_VALUES =
			    Collections.unmodifiableList(Arrays.asList(values()));
		
		private static final int SIZE = CHARACTER_CLASS_VALUES.size();
			  
		private static final Random RANDOM = new Random();
		
		public static CharacterClass randomCharacterClass()  {
			    return CHARACTER_CLASS_VALUES.get(RANDOM.nextInt(SIZE));
			  }
	}
	
	public static enum Setting{
		Birthright, Blackmoor, Council_of_Wyrms, Dark_Sun, Dragon_Fist,
		Dragonlance, Time_of_the_Dragon, Eberron, Forgotten_Realms_Al_Qadim,
		Forgotten_Realms_The_Horde, Forgotten_Realms_Kara_Tur, Malatra_The_Living_Jungle,
		Maztica, Ghostwalk, Greyhawk, Jakandor, Kingdoms_of_Kalamar, Lankhmar,
		Mahasarpa, Mystara, Hollow_World, Savage_Coast, Thunder_Rift, Nentir_Vale,
		Pelinore, Planescape, Ravenloft, Masque_of_the_Red_Death, Ravnica,
		Rokugan, Spelljammer, Warcraft, Wilderlands_of_High_Fantasy;
		
		private static final List<Setting> SETTING_VALUES =
			    Collections.unmodifiableList(Arrays.asList(values()));
		
		private static final int SIZE = SETTING_VALUES.size();
			  
		private static final Random RANDOM = new Random();
		
		public static Setting randomSetting()  {
			    return SETTING_VALUES.get(RANDOM.nextInt(SIZE));
			  }
	}
	
	public static enum Motivation{
		You_stole_something_you_shouldnt_have, The_Lady_commands_it, 
		That_was_the_wrong_portal_to_walk_through, Rescue_someone_in_distress,
		For_the_homies, In_search_of_magical_stuff, Subvert_a_rival_guild,
		Prevent_genocide, Because_some_moron_started_a_war_with_Iran,
		Steal_something, Assasinate_someone, You_hear_the_grass_is_greener,
		Beacuse_fire, Go_Pack_Go;
		
		private static final List<Motivation> MOTIVATION_VALUES =
			    Collections.unmodifiableList(Arrays.asList(values()));
		
		private static final int SIZE = MOTIVATION_VALUES.size();
			  
		private static final Random RANDOM = new Random();
		
		public static Motivation randomMotivation()  {
			    return MOTIVATION_VALUES.get(RANDOM.nextInt(SIZE));
			  }
	}
	

	
	
	

	
	

}
