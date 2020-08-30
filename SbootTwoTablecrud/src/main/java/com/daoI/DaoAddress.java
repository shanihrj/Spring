package com.daoI;

import org.springframework.data.repository.CrudRepository;

import com.model.Address;

public interface DaoAddress extends CrudRepository<Address, Integer>
{

}
