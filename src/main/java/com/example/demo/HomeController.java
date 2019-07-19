package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class HomeController {

    @Autowired
    ActorRepository actorRepository;

    @Autowired
    MovieRepository movieRepository;

    Actor actor = new Actor();

    Movie movie = new Movie();

    @RequestMapping("/")
    public String index(Model model){
        // create an actor
//        Actor actor = new Actor();
        actor.setName("Sandra Bullock");
        actor.setRealname("Sandra Mae Bullowski");

        // create a movie
//        Movie movie = new Movie();
        movie.setTitle("Emoji Movie");
        movie.setYear(2017);
        movie.setDescription("About Emojis...");

        // add the movie to an empty list
//        Set<Movie> movies = new HashSet<Movie>();
//        movies.add(movie);

        // add list of movies to actor's movie list
//        actor.setMovies(movies);
//        actor.setMovies(movies);

        // save the actor to the database
        actorRepository.save(actor);

        // save the movie to the database
        movieRepository.save(movie);

        // grab all the actors from the database and send them to the template
        model.addAttribute("actors", actorRepository.findAll());

        return "index";
    }
}
