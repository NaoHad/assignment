package com.capgemini.assignment.service;

import com.capgemini.assignment.dto.SongDTO;
import com.capgemini.assignment.repository.SongRepository;
import com.capgemini.assignment.vo.SongVO;

public class SongService {

    private final SongRepository songRepository;

    public SongService(final SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public String create(final SongDTO song) {
        SongVO songVO = new SongVO(song.getTitle(), song.getArtist());
        return songRepository.create(songVO);
    }

    public SongDTO read(final String title) {
        SongVO read = songRepository.read(title);
        return new SongDTO(read.getTitle(),read.getArtist());
    }

    public void update(final SongDTO song) {
        SongVO songVO = new SongVO(song.getTitle(), song.getArtist());
        songRepository.update(songVO);
    }

    public void delete(final SongDTO song) {
        SongVO songVO = new SongVO(song.getTitle(), song.getArtist());
        songRepository.delete(songVO);
    }


}
