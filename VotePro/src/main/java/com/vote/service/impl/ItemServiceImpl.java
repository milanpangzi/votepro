package com.vote.service.impl;

import com.vote.dao.ItemDao;
import com.vote.pojo.Item;
import com.vote.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    /**
     *
     */
    @Autowired
    private ItemDao itemDao;

    //新增投票
    public int intsertIm(Item im){

        return  itemDao.intsertIm(im);
    }
    //根据投票Id和用户Id删除投票
    public int deleteByid(Integer iid,Integer iuid){

        return itemDao.deleteByid(iid,iuid);
    }
    //多表查询所有的投票
    public List<Map<String, Object>> selectIBySid(int sid){

        return  itemDao.selectBySid(sid);
    }

    @Override
    public List<Map<String, Object>> selectByCon(Map<String, Object> map) {
        return itemDao.selectByCon(map);
    }


}
