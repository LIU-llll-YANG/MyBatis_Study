package com.liuyang.testmybatis;

import com.liuyang.mappers.UserMapper;
import com.liuyang.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestMyBatis {
    /**
     * 测试 所有数据为一个集合
     */
    @Test
    public void test_01_queryAllUsers() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Map<String, Object>> maps = userMapper.queryAllUsers();
        maps.forEach(new Consumer<Map<String, Object>>() {
            @Override
            public void accept(Map<String, Object> stringObjectMap) {
                stringObjectMap.forEach(new BiConsumer<String, Object>() {
                    @Override
                    public void accept(String s, Object o) {
                        System.out.println("key = " + s + "-- value" + o);
                    }
                });
            }
        });


    }
}
