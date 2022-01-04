package com.jorgeDevOs.Api.models.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jorgeDevOs.Api.models.dao.IInvetoryDao;
import com.jorgeDevOs.Api.models.entity.Inventory;


@Service
public class InventoryServiceImpl implements IInvetoryService {
	
	@Autowired
	private IInvetoryDao iInvetoryDao;

	@Override
	public List<Inventory> findAll() {
		// TODO Auto-generated method stub
		return (List<Inventory>) iInvetoryDao.findAll();
	}
	
	
}
