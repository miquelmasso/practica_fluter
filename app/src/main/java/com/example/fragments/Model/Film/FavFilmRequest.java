package com.example.fragments.Model.Film;

public class FavFilmRequest {

    String media_type;
    Integer media_id;
    boolean favorite;

    public FavFilmRequest(String media_type, Integer media_id, boolean favourite) {
        this.media_type = media_type;
        this.media_id = media_id;
        this.favorite = favourite;
    }

    public String getMedia_type() {
        return media_type;
    }

    public Integer getMedia_id() {
        return media_id;
    }

    public boolean isFavorite() {
        return favorite;
    }
}
