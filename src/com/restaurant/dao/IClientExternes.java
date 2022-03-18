package com.restaurant.dao;

import com.groupe9.model.ClientExternes;

public interface IClientExternes {
	void saveClientExternes(ClientExternes clientExternes);

	 void ClientExternes(ClientExternes clientExternes);

	 ClientExternes getClientExternesById(int id);

	 void deleteClientExternes(int id);

	void updateClientExternes(com.groupe9.model.ClientExternes clientExternes);

	List<com.groupe9.model.ClientExternes> getAllClientExternes();

}
