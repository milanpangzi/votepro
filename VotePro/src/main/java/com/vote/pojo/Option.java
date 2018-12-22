package com.vote.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 选项表
 * */
@Getter
@Setter
public class Option {

    private Integer oid;//投票选项id

    private String option;//投票标题（长沙，北京）

    private Integer osid;//标题id
}
