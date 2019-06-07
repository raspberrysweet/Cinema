package probni.cinema.paradiso.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue
	private long id;	
	private String name;
	
	@ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	private Genre genre;
	
	private String synopsis;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	private Set<Showtime> showtimes = new HashSet<>();
	
	public Movie(long id, String name, Genre genre, String synopsis) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.synopsis = synopsis;
	
	}
	
	public Movie(String name, Genre genre, String synopsis) {
		super();
		this.name = name;
		this.genre = genre;
		this.synopsis = synopsis;
	}
	
	
	public Movie() {
		super();
	
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
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public Set<Showtime> getShowtimes() {
		return showtimes;
	}
	
	//mozda mi i ne treba
	public void setShowtimes(Set<Showtime> showtimes) {
		this.showtimes = showtimes;
	}

	
}
