package com.pendycorp.mobileweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pendycorp.mobileweb.model.MenuItem;

@Controller
public class MobileWebController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String initializeForm(Model model){
		MenuItem menuItem = new MenuItem();
		model.addAttribute("menuForm", menuItem);
		
		initializeMenuModelList(model);
		return "index";
	}
	
	private void initializeMenuModelList(Model model) {
		List<String> menuItemsList = new ArrayList<String>();
		menuItemsList.add("Create Container");
		menuItemsList.add("Add Packages to Container");
		menuItemsList.add("Close Container");
		
		model.addAttribute("menuItemsList", menuItemsList);
	}

	@RequestMapping(value="/indexSelection", method = RequestMethod.POST)
	public String submitForm(Model model, MenuItem menuItem, BindingResult result){
		System.out.println(this.getClass().getName()+" : onSelection : "+menuItem.getMenuItemName());
		return "selectedOption";
	}
}
