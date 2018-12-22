package com.vote.service;
import com.vote.pojo.User;

public interface UserService {

    public  int insertUser(User user);

    public  User selectByUP(String username, String password);


}
