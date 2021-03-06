package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String realname;

//    @ManyToMany(mappedBy = "cast") // this annotation points back to the Movie class... (see Movie class)
//    private Set<Movie> movies;


//    private Set<Actor_Movie> actor_movies;
//
//    public Set<Actor_Movie> getActor_movies() {
//        return actor_movies;
//    }
//
//    public void setActor_movies(Set<Actor_Movie> actor_movies) {
//        this.actor_movies = actor_movies;
//    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

//    public Set<Movie> getMovies() {
//        return movies;
//    }
//
//    public void setMovies(Set<Movie> movies) {
//        this.movies = movies;
//    }

}
