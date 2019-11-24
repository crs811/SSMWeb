package com.crs811.service;

import com.crs811.pojo.Paper;

import java.util.List;

public interface PaperService {
    void addPaper(Paper paper) ;//增

    void deletePaper(int id); //删

    void updatePaper(Paper paper);//改

    Paper queryById(int id);//查

    List<Paper> queryAllPaper();//查询所有
}

