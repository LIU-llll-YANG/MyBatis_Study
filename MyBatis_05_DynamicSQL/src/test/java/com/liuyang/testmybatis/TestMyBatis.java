package com.liuyang.testmybatis;

import com.liuyang.mappers.UserMapper;
import com.liuyang.pojo.User;
import com.liuyang.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestMyBatis {
    /**
     * 多条件查询  if
     */
    @Test
    public void test_01_TestIf(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null,null,null,23,null,"1234@qq.com");
        List<User> users = userMapper.ManyConditionsQuery(user);
        users.forEach(System.out::println);

    }

    /**
     * 测试批量插入
     */
    @Test
    public void test_02_TestForeach(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user1 = new User(null,"刘洋","123456",23,"男","1234@qq.com");
        User user2 = new User(null,"刘能","123456",23,"男","1234@qq.com");
        User user3 = new User(null,"赵四","123456",23,"男","1234@qq.com");
        User user4 = new User(null,"谢广坤","123456",23,"男","1234@qq.com");
        User user = new User(null,"刘一水","123456",23,"男","1234@qq.com");

        List<User> users = Arrays.asList(user1, user2, user3, user4);
        int i = mapper.bulkInsert(users);
        System.out.println("i = " + i);


    }

    /**
     * 测试批量删除
     */
    @Test
    public void test_03_Foreach(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int[] ids = {18,19,20,21};
        int i = mapper.batchDelete(ids);
        System.out.println("i = " + i);

    }

    /**
     * 测试查询所有
     */
    @Test
    public void test_04_SelectAll(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAllUsers();
        users.forEach(System.out::println);
    }
}
