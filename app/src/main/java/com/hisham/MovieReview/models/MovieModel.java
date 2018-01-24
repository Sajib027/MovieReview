package com.hisham.MovieReview.models;

public class MovieModel {
    private String title;
    private int vote_count;
    private float popularity;
    private String id;
    private String original_language;
    private String original_title;
    private String date;

    private String poster_path;
    private String overview;

    public String getMovie() {
        return title;
    }

    public void setMovie(String movie) {
        this.title = title;
    }

    public int getYear() {
        return vote_count;
    }

    public void setYear(int vote_count) {
        this.vote_count = vote_count;
    }

    public float getRating() {
        return popularity;
    }

    public void setRating(float popularity) {
        this.popularity = popularity;
    }

    public String getDuration() {
        return id;
    }

    public void setDuration(String id) {
        this.id = id;
    }

    public String getDirector() {
        return original_language;
    }

    public void setDirector(String original_language) {
        this.original_language = original_language;
    }

    public String getTagline() {
        return original_title;
    }

    public void setTagline(String original_title) {
        this.original_title = original_title;
    }
    public String getImage() {
        String a="https://image.tmdb.org/t/p/";
        String b="w185";
        return a+b+poster_path;
    }

    public void setImage(String poster_path) {
        String a="https://image.tmdb.org/t/p/";
        String b="w185";
        this.poster_path = a+b+poster_path;
    }

    public String getStory() {
        return overview;
    }

    public void setStory(String overview) {
        this.overview = overview;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
