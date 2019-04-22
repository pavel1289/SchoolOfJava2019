package com.endava.demo.model;

public class Movie {
    private int id;
    private String title;
    private String genre;
    private static int idCounter = 0;

    public Movie() {
        this.id = idCounter;
        idCounter++;
    }
    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.id = idCounter;
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
