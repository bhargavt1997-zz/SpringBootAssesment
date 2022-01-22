package Service;

import Entity.MovieDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository MovieRepository;

    public List<MovieDetails> getAllMovies() {
        List<MovieDetails> allMovies= (List<MovieDetails>) MovieRepository.findAll();
        return allMovies;
    }
}
