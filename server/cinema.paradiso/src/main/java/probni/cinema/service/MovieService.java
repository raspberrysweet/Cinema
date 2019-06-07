package probni.cinema.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import probni.cinema.data.MovieRepository;
import probni.cinema.paradiso.model.Movie;

@Component
public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> getAll() {
		return movieRepository.findAll();
	}
	
	public Movie save(Movie movie) {
		return movieRepository.save(movie);
	}
}
