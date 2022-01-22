package Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movie_details")
public class MovieDetails {
    @Id
    private String show_id;
    private String type;
    private String title;
    private String director;
    private  String cast;
    private  String country;
    private LocalDate date_added;
    private  int release_year;
    private String rating;
    private String duration;
    private String listed_in;
    private String description;
}
