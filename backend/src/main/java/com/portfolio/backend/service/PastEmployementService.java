package com.portfolio.backend.service;

import java.util.List;

import com.portfolio.backend.entity.PastEmployement;

public interface PastEmployementService {
	
	PastEmployement createEmployement(PastEmployement employement);
	
	List<PastEmployement> getEmployementTimeLine();
	
	List<PastEmployement> searchByCompany(String comapany);
	
	void deleteEmployement(Long id);

}
