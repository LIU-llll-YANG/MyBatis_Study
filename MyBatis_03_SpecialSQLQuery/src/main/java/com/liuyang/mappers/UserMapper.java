package com.liuyang.mappers;

import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询多个数据 放到一个集合中
    @MapKey("id")
    List<Map<String, Object>> queryAllUsers();

}
