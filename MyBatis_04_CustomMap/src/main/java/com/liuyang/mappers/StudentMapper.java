package com.liuyang.mappers;

import com.liuyang.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    Student queryStudentTheClassById(@Param("id") int id);

    List<Student> selectStudentByClazzId(@Param("clazzId") int clazzId);

}
