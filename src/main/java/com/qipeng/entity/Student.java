package com.qipeng.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Student {
    private Long id;

    private String name;

    private Date birthDate;

    private String remark;

}