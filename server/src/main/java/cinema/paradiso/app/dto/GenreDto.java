package cinema.paradiso.app.dto;

import java.util.ArrayList;
import java.util.List;

import cinema.paradiso.app.model.Genre;

public class GenreDto {
	public Long id;
	public String name;
	public List<MovieDto> movies = new ArrayList<>();
	
	public GenreDto (){
		
	}	
	public GenreDto(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public GenreDto(Genre genre) {
		this.id = genre.getId();
		this.name = genre.getName();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<MovieDto> getMovies() {
		return movies;
	}
	public void setMovies(List<MovieDto> movies) {
		this.movies = movies;
	}
	@Override
	public String toString() {
		return "Genre [id=" + id + ", name=" + name + ", movies=" + movies + "]";
	}
	
	

}
