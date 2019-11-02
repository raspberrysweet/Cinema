package cinema.paradiso.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cinema.paradiso.app.model.Showtime;
import cinema.paradiso.app.repository.ShowtimeRepository;

@Component
public class ShowtimeService {

	@Autowired
	ShowtimeRepository showtimeRepository;
	
	public Showtime save(Showtime showtime) {
		return showtimeRepository.save(showtime);
	}
	

	

}
