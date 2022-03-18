package com.restaurant.dao;

import com.groupe9.model.ComandePlats;

public interface IComandePlats {
	void saveComandePlats(ComandePlats comandePlats);

	 void ComandePlats(ComandePlats comandePlats);

	 ComandePlats getComandePlatsById(int id);

	 void deleteComandePlats(int id);

	void updateComandePlats(com.groupe9.model.ComandePlats comandePlats);

	List<com.groupe9.model.ComandePlats> getAllComandePlats();

}
