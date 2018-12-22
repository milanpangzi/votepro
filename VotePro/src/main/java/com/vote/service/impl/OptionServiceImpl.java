package com.vote.service.impl;

import com.vote.dao.OptionDao;
import com.vote.pojo.Option;
import com.vote.service.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class OptionServiceImpl implements OptionService {

    @Autowired
    public OptionDao odo;

    @Override
    public int insertOp(String option, int osid) {
        return odo.insertOp(option, osid);
    }

    @Override
    public List<Map<String,Object>> selectBySid(Integer osid) {
        return odo.selectBySid(osid);
    }

}


