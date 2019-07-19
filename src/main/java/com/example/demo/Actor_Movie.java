package com.example.demo;

import javax.persistence.*;

@Entity
public class Actor_Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long actor_id;
    private long movie_id;

    public Actor_Movie() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getActor_id() {
        return actor_id;
    }

    public void setActor_id(long actor_id) {
        this.actor_id = actor_id;
    }

    public long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(long movie_id) {
        this.movie_id = movie_id;
    }
}
