package com.crs811.dao;

import com.crs811.pojo.Paper;
//import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface PaperDao {

    //@Insert("INSERT INTO paper(id,name,number,detail) VALUE (#{paperId},#{paperName}, #{paperNum}, #{paperDetail})")
    void addPaper(Paper paper);

    void deletePaperById(int id);

    void updatePaper(Paper paper);

    Paper queryById(int id);

    List<Paper> queryAllPaper();
}


