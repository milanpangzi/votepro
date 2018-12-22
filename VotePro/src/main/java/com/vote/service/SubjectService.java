package com.vote.service;

import com.vote.pojo.Subject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubjectService {

    public List<Subject> selectSb();

    public int insertSb(Subject sb);

    public Subject selectById(int stype);


}
