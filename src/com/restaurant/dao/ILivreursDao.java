package com.restaurant.dao;

import java.util.List;

import com.groupe9.model.Livreurs;

public interface ILivreursDao {

 void saveLivreurs(Livreurs livreur);

 void Livreurs(Livreurs livreur);

 Livreurs getLivreursById(int id);

 void deleteLivreurs(int id);

void updateLivreurs(com.groupe9.model.Livreurs livreurs);

List<com.groupe9.model.Livreurs> getAllLivreurs();

}
