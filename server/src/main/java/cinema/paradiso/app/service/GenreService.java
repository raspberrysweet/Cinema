package cinema.paradiso.app.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cinema.paradiso.app.model.Genre;
import cinema.paradiso.app.repository.GenreRepository;

@Component
public class GenreService {

	@Autowired
	GenreRepository genreRepository;
	
	public List<Genre> findAll() {
		return genreRepository.findAll();
	}
	
	public Genre save(Genre genre) {
		return genreRepository.save(genre);
	}
	
} 
