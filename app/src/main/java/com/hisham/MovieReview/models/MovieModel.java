package com.hisham.MovieReview.models;

public class MovieModel {
    private String title; //[movie]
    private int vote_count; // year
    private float popularity; // rating
    private String id; //duration
    private String original_language; //director
    private String original_title; //tagline
    private String date;
//    @SerializedName("cast")
//    private List<Cast> castList;
    private String poster_path; //image
    private String overview; // story

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

//    public List<Cast> getCastList() {
//        return castList;
//    }
//
//    public void setCastList(List<Cast> castList) {
//        this.castList = castList;
//    }
//
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
//
//    public static class Cast {
//        private String name;
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//    }
}
