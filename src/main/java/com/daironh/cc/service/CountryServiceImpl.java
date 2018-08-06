package com.daironh.cc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.daironh.cc.converter.CountryConverter;
import com.daironh.cc.entity.Country;
import com.daironh.cc.model.CountryModel;
import com.daironh.cc.repository.CountryRepository;

@Service
@Qualifier("countryService")
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public CountryModel findOne(int id) {
		return CountryConverter.entityToModel(countryRepository.findById(id));
	}

	@Override
	public Country save(CountryModel countryModel) {
		return countryRepository.save(CountryConverter.modelToEntity(countryModel));
	}

	@Override
	public Country delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CountryModel> findAll() {
		List<CountryModel> countryModels = new ArrayList<>();
		List<Country> countries = countryRepository.findAll();
		for (Country country : countries) {
			countryModels.add(CountryConverter.entityToModel(country));
		}
		return countryModels;
	}

	@Override
	public Page<CountryModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
