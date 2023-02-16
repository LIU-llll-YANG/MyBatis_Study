package com.liuyang.testmybatis;

import com.liuyang.mappers.ClazzMapper;
import com.liuyang.pojo.Clazz;
import com.liuyang.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestMyBatis {
    /**
     * 测试自定义映射
     */
    //@Test
    //public void test_01_customMap(){
    //    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    //    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    //    List<User> users = userMapper.getUsers();
    //    users.forEach(System.out::println);
    //
    //}
    //
    ///**
    // * 测试查询学生 和班级信息
    // */
    //@Test
    //public void test_02_queryStudentTheClass(){
    //    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    //    StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
    //    Student student = studentMapper.queryStudentTheClassById(4);
    //    System.out.println("student = " + student);
    //}
      /**
     * 测试查询学生 和班级信息
     */
    //@Test
    //public void test_03_queryStudentTheClass(){
    //        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    //        ClazzMapper clazzMapper = sqlSession.getMapper(ClazzMapper.class);
    //        Clazz clazz = clazzMapper.howManyStudentsQueryInClass(1);
    //        System.out.println("clazz = " + clazz);
    //
    //}

    /**
     * 测试分步查询
     */
    @Test
    public void test_04_TestItStepByStepQuery(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ClazzMapper clazzMapper = sqlSession.getMapper(ClazzMapper.class);
        Clazz clazz = clazzMapper.selectClazzById(1);
        System.out.println("clazz = " + clazz.getClazzName());

    }

}
