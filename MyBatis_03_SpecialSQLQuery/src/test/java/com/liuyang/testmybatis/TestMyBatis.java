package com.liuyang.testmybatis;

import com.liuyang.mappers.UserMapper;
import com.liuyang.pojo.User;
import com.liuyang.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.*;
import java.util.List;

public class TestMyBatis {
    /**
     * 测试01模糊查询
     */
    @Test
    public void test_01_fuzzyQuery() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.fuzzyQuery("刘");
        users.forEach(System.out::println);
    }

    /**
     *
     */
    @Test
    public void test_02_batchDelete() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.batchDelete("刘");
        System.out.println("result = " + result);

    }

    /**
     *
     */
    @Test
    public void test_03_dynamicQueryTableName() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.dynamicQueryTableName("t_user");
        users.forEach(System.out::println);

    }

    /**
     * 测试jdbc中获取主键
     */
    @Test
    public void test_04_TestJdbc() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis_study?serverTimezone", "root", "Yang5211314..");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from t_user where id=8");
        int i = preparedStatement.executeUpdate();
        ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
        System.out.println("generatedKeys = " + generatedKeys);


    }


    /**
     * 测试获取主键
     */
    @Test
    public void test_05_accessToPrimaryKey() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "高启兰", "123456", 23, "女", "1234@qq.com");
        int i = userMapper.insertUser(user);
        System.out.println("i = " + i);
        System.out.println(user);

    }

}
