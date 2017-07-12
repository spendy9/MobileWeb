package com.pendycorp.mobileweb.model;

import org.springframework.stereotype.Component;

@Component
public class MenuItem {

	private String menuItemName;

	public String getMenuItemName() {
		return menuItemName;
	}

	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}
	
	
}
