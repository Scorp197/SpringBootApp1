package cst438;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class MovieRating {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Size(min=3, max=25)
	private String firstName;
	
	@NotNull
	@Min(1)
	@Max(25)
	private Integer movieRating;
	
	@NotNull
	@Size(min=3, max=25)
	private String movieTitle;
	
	
	private String date;
	
	
	public MovieRating() {
		
	}
	
	public MovieRating(long id, String firstName, @NotNull Integer movieRating, String movieTitle) {
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	} 
	
	
	
}