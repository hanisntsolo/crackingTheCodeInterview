package dhirendra.february10;

import java.util.Scanner;
//Good declaration using two methods this
//Question is to be practised as many time as we need it.
public class TcsXploreQuestion02 {

  public static void main(String[] args) {
    Movie[] movies = new Movie[4];
    String search;
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<movies.length;i++) {
      String movieName = sc.nextLine();
      String producingCompany = sc.nextLine();
      String genre = sc.nextLine();
      int budget = sc.nextInt();sc.nextLine();
      movies[i] = new Movie(movieName, producingCompany, genre, budget);
    }
    search = sc.nextLine();
    Movie[] newMovie = budgetForGivenMovie(movies,search);
    for(int i=0;i< newMovie.length;i++) {
      if(newMovie[i].getBudget()>80000000) {
        System.out.println("High budget movie");
      } else {
        System.out.println("Low budget Movie");
      }
    }
  }
  public static Movie[] budgetForGivenMovie(Movie[] movieObjects, String genre) {
    int counter=0;
    for(int i=0;i<movieObjects.length;i++) {
      if(movieObjects[i].getGenre().equals(genre)) {
        counter++;
      }
    }
    int b=0;
    Movie[] m =new Movie[counter];
    for(int i=0;i<movieObjects.length;i++) {
      if(movieObjects[i].getGenre().equals(genre)) {
        m[b] = movieObjects[i];
        b++;
      }
    }
    return m;
  }

}
class Movie {
  String movieName;
  String producingCompany;
  String genre;
  int budget;
  public Movie() {

  }
  public Movie(String movieName, String producingCompany, String genre, int budget) {
    this.movieName = movieName;
    this.producingCompany = producingCompany;
    this.genre = genre;
    this.budget = budget;
  }

  public String getMovieName() {
    return movieName;
  }

  public void setMovieName(String movieName) {
    this.movieName = movieName;
  }

  public String getProducingCompany() {
    return producingCompany;
  }

  public void setProducingCompany(String producingCompany) {
    this.producingCompany = producingCompany;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getBudget() {
    return budget;
  }

  public void setBudget(int budget) {
    this.budget = budget;
  }
}
