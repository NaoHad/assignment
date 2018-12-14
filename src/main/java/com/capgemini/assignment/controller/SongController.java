package com.capgemini.assignment.controller;

import com.capgemini.assignment.dto.SongDTO;
import com.capgemini.assignment.service.SongService;

import java.util.Optional;

public class SongController {
    private final SongService songService;

    public SongController(final SongService songService) {
        this.songService = songService;
    }

    public String create(final SongDTO song) {
        return Optional.ofNullable(song)
                .filter(s -> s.getTitle() != null)
                .filter(s -> !s.getTitle().isEmpty())
                .filter(s -> s.getArtist() != null)
                .filter(s -> !s.getArtist().isEmpty())
                .map(songService::create)
                .orElseThrow(() -> new RuntimeException("Geen lege parameters toegestaan"));
    }


    public SongDTO read(final String title) {
        return songService.read(title);
    }

    public void update(final SongDTO song) {
        songService.update(song);
    }

    public void delete(final SongDTO song) {
        songService.delete(song);
    }

}
