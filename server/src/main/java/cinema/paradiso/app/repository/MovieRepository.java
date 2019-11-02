package cinema.paradiso.app.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cinema.paradiso.app.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
	List<Movie> findAllByNameContainsAndGenreName(String name, String genreName);

	/*@Query("select a from AuthorsAndBooks a where a.book.genre = :genre")
	public List<AuthorsAndBooks> findByBookGenre(@Param ("genre") String genre);*/

}
