package cinema.paradiso.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import cinema.paradiso.app.model.Movie;
import cinema.paradiso.app.repository.MovieRepository;

@Component
public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> findAll() {
		return movieRepository.findAll();
	}
	
	public Page<Movie> findAll(Pageable page) {
		return movieRepository.findAll(page);
	}
	
	public Movie save(Movie movie) {
		return movieRepository.save(movie);
	}
	
	
	public Movie findById(Long id) {
		return movieRepository.findOne(id);
	}
	
	public List<Movie> findByNameAndGenre (String name, String genreName) {
	return movieRepository.findAllByNameContainsAndGenreName(name, genreName);
	}
}
