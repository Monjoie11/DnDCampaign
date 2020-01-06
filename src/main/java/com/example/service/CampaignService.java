package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.Campaign;
import com.example.repo.CampaignRepo;

@Service
public class CampaignService {
	
private CampaignRepo campaignRepo;
	
	@Autowired
	public void setCampaignRepo(CampaignRepo campaignRepo) {
		this.campaignRepo = campaignRepo;
	}
	
	public Campaign makeCampaign() {
		Campaign campaign = new Campaign();
		campaignRepo.save(campaign);
		return campaign;
	}
	
	@SuppressWarnings("unchecked")
	public Campaign getCampaign(int id) {
		return (Campaign) campaignRepo.findById(id).orElse(
				new Campaign(id,"sorry", "your","campain","was", "not", "found", "wah wah wuuuuh"));
	}
	

	public List<Campaign> getAllCampaigns() {
		return campaignRepo.findAll();
	}
	
	public Campaign updateCampaign(Campaign campaign) {
		campaignRepo.save(campaign);
		return campaign;
	}

}
