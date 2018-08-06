package com.daironh.cc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.daironh.cc.model.CountryModel;
import com.daironh.cc.service.CountryService;

@Controller
public class CountryController {

	@Autowired
	@Qualifier("countryService")
	private CountryService countryService;

	@GetMapping("/")
	public String showPage(Model model, @RequestParam(defaultValue = "0", required = false) int page) {

		model.addAttribute("data", countryService.findAll(new PageRequest(page, 5)));
		return "index";
	}

	@PostMapping("/save")
	public String save(CountryModel countryModel) {
		countryService.save(countryModel);
		return "redirect:/";
	}

	@GetMapping("/delete")
	public String save(Integer id) {
		countryService.delete(id);
		return "redirect:/";
	}

	@GetMapping("/findOne")
	@ResponseBody
	public CountryModel findOne(Integer id) {
		return countryService.findOne(id);
	}

}
