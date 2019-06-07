package probni.cinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import probni.cinema.data.ShowtimeRepository;
import probni.cinema.paradiso.model.Showtime;

@Component
public class ShowtimeService {
	@Autowired
	ShowtimeRepository showtimeRepository;
	
	public Showtime save(Showtime showtime) {
		return showtimeRepository.save(showtime);
	}

}
