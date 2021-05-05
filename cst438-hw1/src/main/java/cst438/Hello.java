package cst438;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Hello
{

   @Autowired
   RatingRepository ratingRepository;

   @GetMapping("/movies/new")


   public String createMovieRating(Model model)
   {
      MovieRating ratings = new MovieRating();
      model.addAttribute("rating", ratings);
      return "rating_form";
   }

   @GetMapping("/movies")
   public String getAllRatings(Model model)
   {
      Iterable<MovieRating> ratings = ratingRepository.findAll();
      model.addAttribute("ratings", ratings);
      return "rating_list";
   }

   @PostMapping("/movies")
   public String processMovieRatingForm(@Valid MovieRating rating, BindingResult result, Model model)
   {
      if(result.hasErrors())
      {
         return "rating_form";
      }
      ratingRepository.save(rating);
      return "rating_show";
   }

}