package com.liuyang.mappers;

import com.liuyang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> fuzzyQuery(@Param("name")String name);

}
