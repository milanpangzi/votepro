package com.vote.service;

import com.vote.pojo.Option;

import java.util.List;
import java.util.Map;

public interface OptionService {

    public int insertOp(String option, int osid);

    public List<Map<String,Object>> selectBySid(Integer osid);
}
