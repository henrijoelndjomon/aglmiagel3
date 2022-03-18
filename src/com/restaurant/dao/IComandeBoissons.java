package com.restaurant.dao;

import com.groupe9.model.ComandeBoissons;

public interface IComandeBoissons {
	void saveComandeBoissons(ComandeBoissons comandeBoissons);

	 void ComandeBoissons(ComandeBoissons comandeBoissons);

	 ComandeBoissons getComandeBoissonsById(int id);

	 void deleteComandeBoissons(int id);

	void updateComandeBoissons(com.groupe9.model.ComandeBoissons comandeBoissons);

	List<com.groupe9.model.ComandeBoissons> getAllComandeBoissons();

}
