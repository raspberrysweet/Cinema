package probni.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import probni.cinema.data.GenreRepository;
import probni.cinema.paradiso.model.Genre;


@Component
public class GenreService {

	@Autowired 
	GenreRepository genreRepository;
	
	public List<Genre> findAll(){
		return genreRepository.findAll();
	} 
	
	public Genre save(Genre genre) {
		return genreRepository.save(genre);
	}
}
