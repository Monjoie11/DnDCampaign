package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.pojo.Campaign;

@SpringBootApplication
public class DndProvApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndProvApplication.class, args);
		System.out.println(Campaign.Race.randomRace().toString().replace('_', ' ') + " " +
				Campaign.CharacterClass.randomCharacterClass().toString().replace('_', ' '));
		System.out.println(Campaign.Race.randomRace().toString().replace('_', ' ') + " " +
				Campaign.CharacterClass.randomCharacterClass().toString().replace('_', ' '));
		System.out.println(Campaign.Race.randomRace().toString().replace('_', ' ') + " " +
				Campaign.CharacterClass.randomCharacterClass().toString().replace('_', ' '));
		System.out.println(Campaign.Race.randomRace().toString().replace('_', ' ') + " " +
				Campaign.CharacterClass.randomCharacterClass().toString().replace('_', ' '));
		System.out.println(Campaign.Setting.randomSetting().toString().replace('_', ' '));
		System.out.println(Campaign.Motivation.randomMotivation().toString().replace('_', ' '));
	}

}
