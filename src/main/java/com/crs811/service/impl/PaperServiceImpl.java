package com.crs811.service.impl;

import com.crs811.dao.PaperDao;
import com.crs811.pojo.Paper;
import com.crs811.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperDao paperDao;

    //@Autowired
    //public PaperServiceImpl(PaperDao paperDao) {
    //    this.paperDao = paperDao;
    //}

    @Override
    public void addPaper(Paper paper) {
        paperDao.addPaper(paper);
    }

    @Override
    public void deletePaper(int id) {
        paperDao.deletePaperById(id);
    }

    @Override
    public void updatePaper(Paper paper) {
        paperDao.updatePaper(paper);
    }

    @Override
    public Paper queryById(int id) {
        return paperDao.queryById(id);
    }

    @Override
    public List<Paper> queryAllPaper() {
        List<Paper> papers = paperDao.queryAllPaper();
        return papers;
    }
}
