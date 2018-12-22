package com.vote.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private Integer uid;

    private String username;

    private  String password;

    private Integer isadmin;
}
