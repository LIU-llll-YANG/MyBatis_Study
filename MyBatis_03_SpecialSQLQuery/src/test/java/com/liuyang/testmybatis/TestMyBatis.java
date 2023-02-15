package com.liuyang.testmybatis;

import com.liuyang.mappers.UserMapper;
import com.liuyang.pojo.User;
import com.liuyang.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMyBatis {
    /**
     * 测试01模糊查询
     */
    @Test
    public void test_01_fuzzyQuery(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.fuzzyQuery("刘");
        users.forEach(System.out::println);
    }
    
}
