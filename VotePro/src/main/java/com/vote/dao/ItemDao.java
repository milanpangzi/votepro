package com.vote.dao;

import com.vote.pojo.Item;

import java.util.List;
import java.util.Map;

public interface ItemDao {

    //新增投票
    public int intsertIm(Item im);
    //根据投票Id和用户Id删除投票
    public int deleteByid(Integer iid, Integer iuid);
    //根据Id查询所有的投票
    public List<Map<String, Object>> selectBySid(int sid);
    //多条件带分页查询所有
    public List<Map<String, Object>> selectByCon(Map<String, Object> map);



}
