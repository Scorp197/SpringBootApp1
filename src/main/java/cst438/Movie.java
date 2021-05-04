package cst438;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Size(min=3, max=25)
	private String firstName;
	
	@NotNull
	@Size(min=1, max=25)
	private Integer movieRating;
	
	@NotNull
	@Size(min=3, max=25)
	private String movieTitle;
	
	public Movie() {
		
	}
	
	public Movie(long id, String firstName, @NotNull @Size(min = 3, max = 25) Integer movieRating, String movieTitle) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.movieRating = movieRating;
		this.movieTitle = movieTitle;
	}
	
	public long getId() { return id; }
	public void setId(long id) { this.id = id;}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(Integer movieRating) {
		this.movieRating = movieRating;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	} 
	
}