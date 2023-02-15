package com.liuyang.mappers;

import com.liuyang.pojo.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    Student queryStudentTheClassById(@Param("id") int id);
}
