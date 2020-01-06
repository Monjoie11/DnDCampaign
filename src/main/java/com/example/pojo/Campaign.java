package com.example.pojo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "campaign")
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
		
		 public static String randomRace()  {
			    return RACE_VALUES.get(RANDOM.nextInt(SIZE)).toString().replace('_', ' ');
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
		
		public static String randomCharacterClass()  {
			    return CHARACTER_CLASS_VALUES.get(RANDOM.nextInt(SIZE)).toString().replace('_', ' ');
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
		
		public static String randomSetting()  {
			    return SETTING_VALUES.get(RANDOM.nextInt(SIZE)).toString().replace('_', ' ');
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
		
		public static String randomMotivation()  {
			    return MOTIVATION_VALUES.get(RANDOM.nextInt(SIZE)).toString().replace('_', ' ');
			  }
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int campaignId;
	
	@Column(name="character1")
	String character1 = Race.randomRace() + " " + CharacterClass.randomCharacterClass();
	
	@Column(name="character2")
	String character2 = Race.randomRace() + " " + CharacterClass.randomCharacterClass();
	
	@Column(name="character3")
	String character3 = Race.randomRace() + " " + CharacterClass.randomCharacterClass();
	
	@Column(name="character4")
	String character4 = Race.randomRace() + " " + CharacterClass.randomCharacterClass();
	
	@Column(name="setting1")
	String setting1 = Setting.randomSetting();
	
	@Column(name="motivation1")
	String motivation1 = Motivation.randomMotivation();
	
	@Column(name="campaign_notes")
	String campaignNotes = "dm notes go here";

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCharacter1() {
		return character1;
	}

	public void setCharacter1(String character1) {
		this.character1 = character1;
	}

	public String getCharacter2() {
		return character2;
	}

	public void setCharacter2(String character2) {
		this.character2 = character2;
	}

	public String getCharacter3() {
		return character3;
	}

	public void setCharacter3(String character3) {
		this.character3 = character3;
	}

	public String getCharacter4() {
		return character4;
	}

	public void setCharacter4(String character4) {
		this.character4 = character4;
	}

	public String getSetting1() {
		return setting1;
	}

	public void setSetting1(String setting1) {
		this.setting1 = setting1;
	}

	public String getMotivation1() {
		return motivation1;
	}

	public void setMotivation1(String motivation1) {
		this.motivation1 = motivation1;
	}

	public String getCampaignNotes() {
		return campaignNotes;
	}

	public void setCampaignNotes(String campaignNotes) {
		this.campaignNotes = campaignNotes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + campaignId;
		result = prime * result + ((campaignNotes == null) ? 0 : campaignNotes.hashCode());
		result = prime * result + ((character1 == null) ? 0 : character1.hashCode());
		result = prime * result + ((character2 == null) ? 0 : character2.hashCode());
		result = prime * result + ((character3 == null) ? 0 : character3.hashCode());
		result = prime * result + ((character4 == null) ? 0 : character4.hashCode());
		result = prime * result + ((motivation1 == null) ? 0 : motivation1.hashCode());
		result = prime * result + ((setting1 == null) ? 0 : setting1.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campaign other = (Campaign) obj;
		if (campaignId != other.campaignId)
			return false;
		if (campaignNotes == null) {
			if (other.campaignNotes != null)
				return false;
		} else if (!campaignNotes.equals(other.campaignNotes))
			return false;
		if (character1 == null) {
			if (other.character1 != null)
				return false;
		} else if (!character1.equals(other.character1))
			return false;
		if (character2 == null) {
			if (other.character2 != null)
				return false;
		} else if (!character2.equals(other.character2))
			return false;
		if (character3 == null) {
			if (other.character3 != null)
				return false;
		} else if (!character3.equals(other.character3))
			return false;
		if (character4 == null) {
			if (other.character4 != null)
				return false;
		} else if (!character4.equals(other.character4))
			return false;
		if (motivation1 == null) {
			if (other.motivation1 != null)
				return false;
		} else if (!motivation1.equals(other.motivation1))
			return false;
		if (setting1 == null) {
			if (other.setting1 != null)
				return false;
		} else if (!setting1.equals(other.setting1))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Campaign [campaignId=" + campaignId + ", character1=" + character1 + ", character2=" + character2
				+ ", character3=" + character3 + ", character4=" + character4 + ", setting1=" + setting1
				+ ", motivation1=" + motivation1 + ", campaignNotes=" + campaignNotes + "]";
	}

	public Campaign(int campaignId, String character1, String character2, String character3, String character4,
			String setting1, String motivation1, String campaignNotes) {
		super();
		this.campaignId = campaignId;
		this.character1 = character1;
		this.character2 = character2;
		this.character3 = character3;
		this.character4 = character4;
		this.setting1 = setting1;
		this.motivation1 = motivation1;
		this.campaignNotes = campaignNotes;
	}

	public Campaign() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
