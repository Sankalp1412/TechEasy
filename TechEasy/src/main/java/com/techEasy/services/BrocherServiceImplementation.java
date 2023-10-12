package com.techEasy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techEasy.entity.Brocher;
import com.techEasy.repository.BrocherRepository;

@Service
public class BrocherServiceImplementation implements BrocherService{

	@Autowired
	BrocherRepository brocherRepo;
	
	@Override
	public String addBrocher(Brocher brocher) {
		brocherRepo.save(brocher);
		return "added";
	}
}
