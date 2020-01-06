package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.Campaign;

@Repository
public interface CampaignRepo extends JpaRepository<Campaign, Integer>{
	

}
