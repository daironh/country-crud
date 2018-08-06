package com.daironh.cc.converter;

import com.daironh.cc.entity.Country;
import com.daironh.cc.model.CountryModel;

public class CountryConverter {

	public static Country modelToEntity(CountryModel countryModel) {
		Country country = null;
		if (countryModel != null) {
			country = new Country();
			country.setName(countryModel.getName());
			country.setCapital(countryModel.getCapital());
		}

		return country;
	}

	public static CountryModel entityToModel(Country country) {
		CountryModel countryModel = null;
		if (country != null) {
			countryModel = new CountryModel();
			countryModel.setId(country.getId());
			countryModel.setName(country.getName());
			countryModel.setCapital(country.getCapital());
		}

		return countryModel;
	}

}
