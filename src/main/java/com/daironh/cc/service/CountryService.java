package com.daironh.cc.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.daironh.cc.entity.Country;
import com.daironh.cc.model.CountryModel;


public interface CountryService {

	public abstract List<CountryModel> findAll();

	public abstract Page<CountryModel> findAll(Pageable pageable);

	public abstract CountryModel findOne(int id);

	public abstract Country save(CountryModel countryModel);

	public abstract Country delete(int id);

}
