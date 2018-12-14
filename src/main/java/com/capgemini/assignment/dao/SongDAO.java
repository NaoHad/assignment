package com.capgemini.assignment.dao;

import com.capgemini.assignment.vo.SongVO;

import java.util.List;

public interface SongDAO {

    String create(SongVO song);

    SongVO read(String title);

    List<SongVO> readAll();

    void update(SongVO song);

    void delete(SongVO song);
}
