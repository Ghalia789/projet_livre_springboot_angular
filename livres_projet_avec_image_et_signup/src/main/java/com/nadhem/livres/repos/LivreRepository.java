package com.nadhem.livres.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.repository.query.Param;

import com.nadhem.livres.entities.Genre;
import com.nadhem.livres.entities.Livre;

@RepositoryRestResource(path = "rest")
public interface LivreRepository extends JpaRepository<Livre, Long> {

	@Query("select l from Livre l where l.titreLivre like %?1")
	List<Livre> findByTitreLivre(String titreLivre);
	
	 List<Livre> findByTitreLivreContains(String titreLivre);
	 
	 
	 List<Livre> findByGenreIdGen(Long idGen);
	
	 @Query("select l from Livre l where l.genre=?1")
	 List<Livre> findByGenre(Genre genre);

}
