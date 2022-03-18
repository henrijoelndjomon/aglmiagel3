package com.restaurant.dao;

import com.groupe9.model.Tables;

public interface ITables {
	void saveTables(Tables tables);

	 void Tables(Tables tables);

	 Tables getTablesById(int id);

	 void deleteTables(int id);

	void updateTables(com.groupe9.model.Tables tables);

	List<com.groupe9.model.Tables> getAllTables();

}
