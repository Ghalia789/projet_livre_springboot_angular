package com.nadhem.livres.service;

import java.util.List;

import com.nadhem.livres.entities.Genre;
import com.nadhem.livres.entities.Livre;

public interface LivreService {
    Livre saveLivre(Livre livre);
    Livre updateLivre(Livre livre);
    void deleteLivre(Livre livre);
    void deleteLivreById(Long id);
    Livre getLivre(Long id);
    List<Livre> getAllLivres();
    List<Livre> getLivresByGenre(Genre genre);
    List<Livre> findByGenreIdGen(Long idGen);
    List<Livre> findByTitreLivreContains(String titre);
}
