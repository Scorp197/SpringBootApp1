package cst438;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {  
	
	@Autowired
	MovieRepository movieRepository;
	
	@GetMapping("/movies")
	public String getAllMovieRating(Model model) 
	{	
		Iterable<MovieRating> movies = movieRepository.findAllOrderByMovieTitleMovieRatingDesc();
		model.addAttribute("movies", movies);
		return "movie_list"; 
	}
	
	@PostMapping("/movies/new")
	public String processMovieForm(@Valid MovieRating movie, 
			BindingResult result, 
			Model model) {
		model.addAttribute("movie", movie); //new line added
		
		if (result.hasErrors()) {
			return "movie_form";
		}	
		movie.setDate(new java.util.Date().toString());		
		movieRepository.save(movie);
		return "movie_show";
	}
	
	
	@GetMapping("/movies/new")
	public String createMovieRating(Model model) 
	{
		MovieRating movie = new MovieRating();
		model.addAttribute("movie", movie);
		return "movie_form";
	}

}
