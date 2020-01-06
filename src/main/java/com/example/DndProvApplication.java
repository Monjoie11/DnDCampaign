package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.pojo.Campaign;

@SpringBootApplication
public class DndProvApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndProvApplication.class, args);
		System.out.println(Campaign.Race.randomRace() + " " + Campaign.CharacterClass.randomCharacterClass());
		System.out.println(Campaign.Race.randomRace() + " " + Campaign.CharacterClass.randomCharacterClass());
		System.out.println(Campaign.Race.randomRace() + " " + Campaign.CharacterClass.randomCharacterClass());
		System.out.println(Campaign.Race.randomRace() + " " + Campaign.CharacterClass.randomCharacterClass());
		System.out.println(Campaign.Setting.randomSetting());
		System.out.println(Campaign.Motivation.randomMotivation());
	}

}
