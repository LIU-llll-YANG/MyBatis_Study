package com.liuyang.mappers;

import com.liuyang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //多条件查询 if
    List<User> ManyConditionsQuery(User user);

    //批量插入
    int bulkInsert(List<User> users);

    //批量删除
    int batchDelete(@Param("ids") int[] ids);

    //查询所有
    List<User> selectAllUsers();


}
