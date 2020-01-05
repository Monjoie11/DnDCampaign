package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.CampaignRepo;

@Service
public class CampaignService {
	
private CampaignRepo campaignRepo;
	
	@Autowired
	public void setCampaignRepo(CampaignRepo campaignRepo) {
		this.campaignRepo = campaignRepo;
	}
	
	

}
