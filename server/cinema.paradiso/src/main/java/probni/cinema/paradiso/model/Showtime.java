package probni.cinema.paradiso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Showtime {
	
	@Id
	@GeneratedValue
	Long id;
	
	String timeAndDate;

	
	//mislim da sam ovo videla negde da nema dvosmerene veze
	
	public Showtime() {
		
	}

	public Showtime(String timeAndDate) {
		super();
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

	
	
	
	
	
}
