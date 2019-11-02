package cinema.paradiso.app.controller;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cinema.paradiso.app.dto.MovieDto;
import cinema.paradiso.app.model.Movie;
import cinema.paradiso.app.model.Showtime;
import cinema.paradiso.app.service.GenreService;
import cinema.paradiso.app.service.MovieService;
import cinema.paradiso.app.service.ShowtimeService;


@RestController
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@Autowired
	GenreService genreService;
	
	@Autowired
	ShowtimeService showtimeService;
	
	@RequestMapping(value = "api/movies", method = RequestMethod.GET)
	public ResponseEntity<List<MovieDto>> getMovies(Pageable page) {
		Page<Movie> movies = movieService.findAll(page);
		List<MovieDto> moviesDto = new ArrayList<>();
		
		for (Movie m: movies) {
			MovieDto mdto = new MovieDto(m);	
			moviesDto.add(mdto);
		}
		return new ResponseEntity<>(moviesDto, HttpStatus.OK);				
	}
	
	@RequestMapping(value = "api/movies/{id}")
	public ResponseEntity<MovieDto> getById(@PathVariable Long id) {
		Movie response = movieService.findById(id);
		MovieDto movieDto = new MovieDto (response);
		return new ResponseEntity<>(movieDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "api/movies", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MovieDto> create(@RequestBody Movie movie) {
		Set<Showtime> showtimeList = new HashSet<>();
		
		for (Showtime s: movie.getShowtimes()) {
			showtimeService.save(s);
			showtimeList.add(s);
		}
		movie.setShowtimes(showtimeList);
		Movie newMovie = movieService.save(movie);
		MovieDto newMovieDto = new MovieDto(newMovie);
		return new ResponseEntity<>(newMovieDto, HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value = "api/movies", method = RequestMethod.GET, params= {"title", "genre"})
	public ResponseEntity<List<Movie>> getByNameandGenre(@RequestParam String title, @RequestParam String genre){
		List<Movie> movies = movieService.findByNameAndGenre(title, genre);
		if(movies.size()!=0) {
		return new ResponseEntity<>(movies, HttpStatus.OK);}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	/*	private List<ShowtimeDto> converteShowtimesDto (Movie movie) {
	List<ShowtimeDto> list = new ArrayList<>();
	for (Showtime s: movie.getShowtimes()) {
		list.add(new ShowtimeDto(s));
	}
	return list;
	
}*/
}
