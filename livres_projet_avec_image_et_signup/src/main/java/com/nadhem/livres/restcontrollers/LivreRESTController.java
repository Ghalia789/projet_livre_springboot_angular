package com.nadhem.livres.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nadhem.livres.entities.Livre;
import com.nadhem.livres.service.LivreService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class LivreRESTController {
	@Autowired
	LivreService livreService;
	
	@RequestMapping(path="all",method = RequestMethod.GET)
	public List<Livre> getAllLivres() {
	return livreService.getAllLivres();
	}
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public Livre getLivreById(@PathVariable("id") Long id) {
	return livreService.getLivre(id);
	 }
	
	@RequestMapping(value="/addliv",method = RequestMethod.POST)
	//@PostMapping("/addliv")
	public Livre createLivre(@RequestBody Livre livre) {
	return livreService.saveLivre(livre);
	}
	
	@RequestMapping(value="/updateliv",method = RequestMethod.PUT)
	public Livre updateLivre(@RequestBody Livre livre) {
	return livreService.updateLivre(livre);
	}
	
	@RequestMapping(value="/delliv/{id}",method = RequestMethod.DELETE)
	public void deleteLivre(@PathVariable("id") Long id) {
		livreService.deleteLivreById(id);
	}
	@RequestMapping(value="/livresgen/{idGen}",method = RequestMethod.GET)
	public List<Livre> getLivresByGenId(@PathVariable("idGen") Long idGen) {
	return livreService.findByGenreIdGen(idGen);
	}
	
	@RequestMapping(value="/livsByTitre/{titre}",method = RequestMethod.GET)
	public List<Livre> findByTitreLivreContains(@PathVariable("titre") String titre) {
	return livreService.findByTitreLivreContains(titre);
	}
}
