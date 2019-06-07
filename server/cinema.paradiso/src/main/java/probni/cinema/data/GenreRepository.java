package probni.cinema.data;

import org.springframework.data.jpa.repository.JpaRepository;

import probni.cinema.paradiso.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
