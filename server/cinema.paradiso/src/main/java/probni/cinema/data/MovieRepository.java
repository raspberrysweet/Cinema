package probni.cinema.data;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import probni.cinema.paradiso.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
