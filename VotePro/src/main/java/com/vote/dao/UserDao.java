package com.vote.dao;

import com.vote.pojo.User;

public interface UserDao {

    public  int insertUser(User user);

    public  User selectByUP(String username, String password);
}
