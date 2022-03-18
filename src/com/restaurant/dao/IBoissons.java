package com.restaurant.dao;

import com.groupe9.model.Boissons;

public interface IBoissons {
	void saveBoissons(Boissons boissons);

	 void Boissons(Boissons boissons);

	 Boissons getBoissonsById(int id);

	 void deleteBoissons(int id);

	void updateBoissons(com.groupe9.model.Boissons boissons);

	List<com.groupe9.model.Boissons> getAllBoissons();

}
