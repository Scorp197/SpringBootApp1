package cst438;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
	
	@Query("select p from Movie p order by lastName, favoriteFood desc")
	List<Movie> findAllOrderByMovieTitleMovieRatingDesc();
}