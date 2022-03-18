package com.restaurant.dao;

import com.groupe9.model.Plats;

public interface IPlats {
	void savePlats(Plats plats);

	 void Plats(Plats plats);

	 Plats getPlatsById(int id);

	 void deletePlats(int id);

	void updatePlats(com.groupe9.model.Plats plats);

	List<com.groupe9.model.Plats> getAllPlats();

}
