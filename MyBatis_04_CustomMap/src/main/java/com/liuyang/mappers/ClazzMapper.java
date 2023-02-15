package com.liuyang.mappers;

import com.liuyang.pojo.Clazz;

public interface ClazzMapper {
    Clazz queryClassById(Integer classId);

    Clazz howManyStudentsQueryInClass(Integer clazzId);
}
