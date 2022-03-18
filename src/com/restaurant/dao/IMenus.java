package com.restaurant.dao;

import com.groupe9.model.Menus;

public interface IMenus {
	void saveMenus(Menus menus);

	 void Menus(Menus menus);

	 Menus getMenusById(int id);

	 void deleteMenus(int id);

	void updateMenus(com.groupe9.model.Menus menus);

	List<com.groupe9.model.Menus> getAllMenus();

}
