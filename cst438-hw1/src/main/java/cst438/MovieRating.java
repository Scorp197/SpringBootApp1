package cst438;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class MovieRating

{
   @Id
   @GeneratedValue
   private long id;

   @NotNull
   @Size(min=3, max=25)
   private String firstName;

   @NotNull
   @Size(min=3, max=25)
   private String lastName;

   @NotNull
   @Size(min=3, max=25)
   private String movieTitle;

   @NotNull
   private int mrating;

   public MovieRating()
   {

   }

   public MovieRating(long id, String firstName, String lastName, String movieTitle, int mrating)
   {
      super();
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.movieTitle = movieTitle;
      this.mrating = mrating;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public long getId()
   {
      return id;
   }

   public String getLastName()
   {
      return lastName;
   }

   public String getmovieTitle()
   {
      return movieTitle;
   }

   public int getMrating()
   {
      return mrating;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public void setId(long id)
   {
      this.id = id;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public void setmovieTitle(String movieTitle)
   {
      this.movieTitle = movieTitle;
   }

   public void setMrating(int mrating)
   {
      this.mrating = mrating;
   };

}