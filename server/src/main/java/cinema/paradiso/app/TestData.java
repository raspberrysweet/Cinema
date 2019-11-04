package cinema.paradiso.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cinema.paradiso.app.model.Genre;
import cinema.paradiso.app.model.Movie;
import cinema.paradiso.app.model.Showtime;
import cinema.paradiso.app.service.GenreService;
import cinema.paradiso.app.service.MovieService;
import cinema.paradiso.app.service.ShowtimeService;

@Component
public class TestData {

	@Autowired
	GenreService genreService;
	
	@Autowired
	MovieService movieService;
	
	@Autowired
	ShowtimeService showtimeService;
	
	
	@PostConstruct
	public void init() {
		
	
	Genre horor = new Genre ("horor");
	Genre comedy = new Genre ("comedy");
	Genre action = new Genre ("action");
	Genre drama = new Genre ("drama");
	Genre romance = new Genre ("romance");
	
	genreService.save(horor);
	genreService.save(comedy);
	genreService.save(drama);
	genreService.save(action);
	genreService.save(romance);
	
	Showtime show1 = new Showtime ("21 avgust u 20h");
	showtimeService.save(show1);
	
	Showtime show2 = new Showtime ("21 avgust u 23h");
	showtimeService.save(show2);
	
	Showtime show3 = new Showtime ("22 avgust u 21h");
	showtimeService.save(show3);
	
	
	Movie yesterday = new Movie("Yesterday","A struggling musician realizes he is the only person", comedy);
	yesterday.getShowtimes().add(show1);
	yesterday.getShowtimes().add(show2);
	yesterday.getShowtimes().add(show3);
	movieService.save(yesterday);
	
	Movie terminator = new Movie ("Terminator: Dark Fate", "Sarah Connor and a hybrid cyborg human must protect a young girl from a newly modified liquid Terminator from the future. ",action);
	movieService.save(terminator);

	terminator.getShowtimes().add(show1);
	
	
	
	
	}
}
