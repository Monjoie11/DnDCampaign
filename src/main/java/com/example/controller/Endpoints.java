package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Campaign;
import com.example.service.CampaignService;

@RestController
@RequestMapping("/")
public class Endpoints {
	
	CampaignService campService;
	
	@Autowired
	public void setLaptopService(CampaignService campService) {
		this.campService = campService;
	}
	
	@GetMapping("campaign/")
	public Campaign createCampaign() {
		Campaign campaign = campService.makeCampaign();
		return campaign;
	}
	
	@GetMapping("campaign/{id}")
	public Campaign getCampaign(@PathVariable int id){
		Campaign campaign = campService.getCampaign(id);
		return campaign;
	}
	
	@PutMapping("campaign/update/{id}")
    public Campaign updateCampaign(@RequestBody Campaign campaign) {
		Campaign campaignUpdate = campService.updateCampaign(campaign);
		return campaignUpdate;
	}
}
