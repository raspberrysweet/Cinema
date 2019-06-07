package probni.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import probni.cinema.paradiso.model.Movie;
import probni.cinema.service.MovieService;

@RestController
@RequestMapping(value = "/api/movies")
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@RequestMapping (method = RequestMethod.GET)
	public ResponseEntity<List<Movie>> getAll() {
		List<Movie> response = movieService.getAll();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
