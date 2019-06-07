package probni.cinema.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import probni.cinema.paradiso.model.Showtime;

@Repository
public interface ShowtimeRepository extends JpaRepository<Showtime, Long>{

}
