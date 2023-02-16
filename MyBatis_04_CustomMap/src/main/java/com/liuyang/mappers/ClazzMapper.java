package com.liuyang.mappers;

import com.liuyang.pojo.Clazz;
import org.apache.ibatis.annotations.Param;

public interface ClazzMapper {
    Clazz queryClassById(Integer classId);

    Clazz howManyStudentsQueryInClass(Integer clazzId);
    //分步查询

    //通过id查询 班级
    Clazz selectClazzById(@Param("clazzId") int clazzId);


}
