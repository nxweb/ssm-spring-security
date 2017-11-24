package com.qipeng.service;


import com.qipeng.entity.Student;

import java.util.List;

/**
 * 学生服务
 * Created by Hooyuu14 on 2017/7/21.
 */
public interface StudentService {

    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectAll();
}
