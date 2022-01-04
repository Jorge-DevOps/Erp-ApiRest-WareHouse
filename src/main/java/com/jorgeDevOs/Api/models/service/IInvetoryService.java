package com.jorgeDevOs.Api.models.service;

import java.util.List;

import com.jorgeDevOs.Api.models.entity.Inventory;

public interface IInvetoryService {
	
	public List<Inventory> findAll();
	
}
