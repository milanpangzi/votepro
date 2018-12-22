package com.vote.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 主题表
 * */
@Getter
@Setter
public class Subject {

    private Integer sid;//投票主题id

    private String stitle;//投票主题标题

    private Integer stype;//多选还是单选
}
