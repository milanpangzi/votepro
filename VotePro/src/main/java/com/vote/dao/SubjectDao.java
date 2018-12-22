package com.vote.dao;

import com.vote.pojo.Subject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubjectDao {

    public List<Subject> selectSb();

    public int insertSb(Subject sb);

    public Subject selectById(int stype);




}
