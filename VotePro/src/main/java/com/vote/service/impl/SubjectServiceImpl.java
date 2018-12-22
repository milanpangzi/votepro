package com.vote.service.impl;

import com.vote.dao.SubjectDao;
import com.vote.pojo.Subject;
import com.vote.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectDao sd;
    @Override
    public List<Subject> selectSb() {
        return sd.selectSb();
    }

    @Override
    public int insertSb(Subject sb) {
        return sd.insertSb(sb);
    }

    @Override
    public Subject selectById(int stype) {
        return sd.selectById(stype);
    }


}
