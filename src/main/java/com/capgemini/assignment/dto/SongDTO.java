package com.capgemini.assignment.dto;

import java.io.Serializable;

public class SongDTO implements Serializable {

    private static final long serialVersionUID = 1402409978760188138L;
    private final String title;
    private final String artist;

    public SongDTO(final String title, final String artist) {
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
