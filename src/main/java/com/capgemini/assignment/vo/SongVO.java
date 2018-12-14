package com.capgemini.assignment.vo;

public class SongVO{

    private final String title;
    private final String artist;

    public SongVO(final String title, final String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
