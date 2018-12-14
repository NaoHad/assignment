package com.capgemini.assignment.repository;

import com.capgemini.assignment.dao.SongDAO;
import com.capgemini.assignment.vo.SongVO;


public class SongRepository {

    private final SongDAO songDAO;

    public SongRepository(final SongDAO songDAO) {
        this.songDAO = songDAO;
    }

    public String create(final SongVO song) {
        return songDAO.create(song);
    }

    public SongVO read(final String title) {
        return songDAO.read(title);
    }

    public void update(final SongVO song) {
        songDAO.update(song);
    }

    public void delete(final SongVO song) {
        songDAO.delete(song);
    }
}
