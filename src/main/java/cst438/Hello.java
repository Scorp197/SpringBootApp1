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
	
	@GetMapping("/movies/new")
	public String createMovie( Model model) 
	{
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		return "movie_form";
	}
	
	@GetMapping("/movies")
	public String getAllMovieRating(Model model) 
	{	
		Iterable<Movie> movieRating = movieRepository.findAllOrderByMovieTitleMovieRatingDesc();
		model.addAttribute("movie", movieRating);
		return "movie_list"; 
	}
	
	@PostMapping("/movies/new")
	public String processMovieForm(@Valid Movie movie, 
			BindingResult result, 
			Model model) {
		model.addAttribute("time", new java.util.Date().toString());
		
		if (result.hasErrors()) {
			return "movie_form";
		}	
		movieRepository.save(movie);
//		model.addAttribute("movieRepository", movieRepository); //new line added
		return "movie_show";
	}
	
}


//	@GetMapping("/person")
//	public String getAllPeople(Model model) {
//		Iterable<Movie> people = personRepository.findAllOrderByLastNameFavoriteFoodDesc();
//		model.addAttribute("persons", people);
//		return "person_list";
//		
//	}
//}