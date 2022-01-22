package Controller;

import Entity.MovieDetails;
import Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repository.MovieRepository;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService MovieService;

    @RequestMapping(value = "/AllMovies", method = RequestMethod.GET)
    public List<MovieDetails> getAllMovies(){
        return MovieService.getAllMovies();
    }
}
