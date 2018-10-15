import java.util.Objects;

public class MovieDetails {
  private String movieName;
  private String studio;

  public MovieDetails(String movieName, String studio) {
    this.movieName = movieName;
    this.studio = studio;
  }

  public String getMovieName() {
    return movieName;
  }

  public void setMovieName(String movieName) {
    this.movieName = movieName;
  }

  public String getStudio() {
    return studio;
  }

  public void setStudio(String studio) {
    this.studio = studio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MovieDetails that = (MovieDetails) o;
    return Objects.equals(movieName, that.movieName) &&
            Objects.equals(studio, that.studio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieName, studio);
  }
}
