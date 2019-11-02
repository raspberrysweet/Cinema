package cinema.paradiso.app.dto;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import cinema.paradiso.app.model.Movie;
import cinema.paradiso.app.model.Showtime;


public class MovieDto {
	
	public long id;	
	public String name;
	public String synopsis;	
	public GenreDto genre;	
	public List<Showtime>showtimes = new ArrayList<>();
	
	public MovieDto() {
		
	}
	
	public MovieDto(Movie movie) {
		this.id = movie.getId();
		this.name = movie.getName();
		this.synopsis = movie.getSynopsis();
		this.genre = new GenreDto(movie.getGenre());
		// movie.getShowtimes() vraca Set objekata
		this.showtimes = getShowtimeList(movie.getShowtimes());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GenreDto getGenreDto() {
		return genre;
	}

	public void setGenreDto(GenreDto genreDto) {
		this.genre = genreDto;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public List<Showtime> getShowtimes() {
		return showtimes;
	}

	public void setShowtimes(List<Showtime> showtimes) {
		this.showtimes = showtimes;
	}


	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", synopsis=" + synopsis + ", genre=" + genre + ", showtimes="
				+ showtimes + "]";
	}

		
	private List<Showtime> getShowtimeList(Set <Showtime> list) {
		List<Showtime> retList = new ArrayList<>();
		for(Showtime s: list) {
			retList.add(s);
		}
		return retList;
	}
	
	

}
