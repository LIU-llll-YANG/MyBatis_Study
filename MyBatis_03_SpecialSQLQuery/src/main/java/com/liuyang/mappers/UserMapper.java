package com.liuyang.mappers;

import com.liuyang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> fuzzyQuery(@Param("name")String name);

    int batchDelete(@Param("name") String name);

    List<User> dynamicQueryTableName(@Param("tablename")String tableName);

    int insertUser(User user);


}
