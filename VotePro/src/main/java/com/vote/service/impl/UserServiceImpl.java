package com.vote.service.impl;

import com.vote.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.vote.pojo.User;
import com.vote.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserDao ud;


    @Override
    public int insertUser(User user) {
        return ud.insertUser(user);
    }

    @Override
    public User selectByUP(String username, String password) {
        return ud.selectByUP(username,password);
    }
}
