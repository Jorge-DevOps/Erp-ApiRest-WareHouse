package com.jorgeDevOs.Api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorgeDevOs.Api.models.entity.Inventory;
import com.jorgeDevOs.Api.models.service.IInvetoryService;

@RestController
@RequestMapping("/api")
public class InventoryRestController {
	
	@Autowired
	private IInvetoryService invetoryService;
	
	@GetMapping("/inventory")
	public List<Inventory> index(){
		return invetoryService.findAll();
	}

}
