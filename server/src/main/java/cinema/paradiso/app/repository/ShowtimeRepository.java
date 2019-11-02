package cinema.paradiso.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cinema.paradiso.app.model.Showtime;

@Repository
public interface ShowtimeRepository extends JpaRepository<Showtime, Long> {

}
