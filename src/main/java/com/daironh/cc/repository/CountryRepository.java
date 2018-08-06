package com.daironh.cc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daironh.cc.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

	public abstract Country findById(int id);
	
}
