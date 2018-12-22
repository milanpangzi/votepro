package com.vote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.vote.pojo.User;
import com.vote.service.UserService;


@Controller
@SessionAttributes(value = "user")
public class UserController {
    @Autowired
    private UserService us;
    @RequestMapping("/regists")
    public  String regist(User user){
        us.insertUser(user);
        return "login";
    }

   @RequestMapping("/login")
    public String login(User user, Model mv){
        User uses = us.selectByUP(user.getUsername(),user.getPassword());
        System.out.println("login界面登陆方法："+user.getUsername());
        if (uses!=null){
            mv.addAttribute("user",user);
            return "forward:/List";
        }
        return "login";

    }


    /*@RequestMapping("/login")
    public  String login(){

        return "login";

    }*/

    @RequestMapping("/regist")
    public  String regist(){
        return "regist";
    }


}
