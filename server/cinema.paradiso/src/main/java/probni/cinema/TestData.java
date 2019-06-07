package probni.cinema;

	import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import probni.cinema.paradiso.model.Genre;
import probni.cinema.paradiso.model.Movie;
import probni.cinema.paradiso.model.Showtime;
import probni.cinema.service.GenreService;
import probni.cinema.service.MovieService;
import probni.cinema.service.ShowtimeService;

	@Component
	public class TestData {
		
		@Autowired
		MovieService movieService;
		
		@Autowired
		GenreService genreService;
		
		@Autowired
		ShowtimeService showtimeService;
		
		@PostConstruct
		public void init(){
			Genre horor = new Genre("horor");
			Genre comedy = new Genre ("comedy");
			Genre drama = new Genre ("drama");
			genreService.save(horor);
			genreService.save(comedy);
			genreService.save(drama);
			
			Showtime vreme1 = new Showtime("7 jun u 23h");
			Showtime vreme2 = new Showtime("8 jun u 23h");
			showtimeService.save(vreme1);
			showtimeService.save(vreme2);
			
			String sinopsis1 = "Šta bi se dogodilo kada bi nadareno dete sa druge planete sletelo na Zemlju, ali umesto da postane junak čovečanstva, ono postaje nešto daleko zlobnije?";
			Movie brightburn = new Movie ("Brightburn", horor, sinopsis1);
			brightburn.getShowtimes().add(vreme1);
			brightburn.getShowtimes().add(vreme2);
			movieService.save(brightburn);
			
		}
	}

