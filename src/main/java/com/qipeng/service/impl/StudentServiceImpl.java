package com.qipeng.service.impl;

import com.qipeng.entity.Student;
import com.qipeng.mapper.StudentMapper;
import com.qipeng.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Hooyuu14 on 2017/7/21.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(Long id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }
}
