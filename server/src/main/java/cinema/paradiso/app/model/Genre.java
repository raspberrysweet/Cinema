package cinema.paradiso.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Genre {

	@Id
	@GeneratedValue
	Long id;
	
	String name;
	
	/*@JsonIgnore
	@OneToMany(mappedBy = "genre", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	Set<Movie> movies = new HashSet<>();*/

	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genre(String name) {
		super();
		this.name = name;
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

	/*public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}*/
	
	
	
}
