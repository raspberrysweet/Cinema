package cinema.paradiso.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Showtime {

	@Id
	@GeneratedValue
	Long id;
	
	String timeAndDate;
	
	
	public Showtime() {}
	
	// ovo mi je mozda trebalo za bazu
	/*public Showtime(Long id, String timeAndDate, Movie movie) {
		this.id =id;
		this.timeAndDate = timeAndDate;
		this.movie = movie;
	}*/
	
	public Showtime (String timeAndDate) {
		this.timeAndDate = timeAndDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTimeAndDate() {
		return timeAndDate;
	}

	public void setTimeAndDate(String timeAndDate) {
		this.timeAndDate = timeAndDate;
	}

	/*public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}*/

	
	
}
