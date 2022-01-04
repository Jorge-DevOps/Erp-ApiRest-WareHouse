package com.jorgeDevOs.Api.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jorgeDevOs.Api.models.entity.Inventory;

public interface IInvetoryDao extends CrudRepository<Inventory, Long>{

}
