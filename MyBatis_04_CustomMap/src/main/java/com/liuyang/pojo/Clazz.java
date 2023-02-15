package com.liuyang.pojo;

import java.util.List;

public class Clazz {
    private Integer clazzId;
    private String clazzName;
    private List<Student> students;


    public Clazz() {
    }

    public Clazz(Integer clazzId, String clazzName, List<Student> students) {
        this.clazzId = clazzId;
        this.clazzName = clazzName;
        this.students = students;
    }

    /**
     * 获取
     * @return clazzId
     */
    public Integer getClazzId() {
        return clazzId;
    }

    /**
     * 设置
     * @param clazzId
     */
    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }

    /**
     * 获取
     * @return clazzName
     */
    public String getClazzName() {
        return clazzName;
    }

    /**
     * 设置
     * @param clazzName
     */
    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    /**
     * 获取
     * @return students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * 设置
     * @param students
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String toString() {
        return "Clazz{clazzId = " + clazzId + ", clazzName = " + clazzName + ", students = " + students + "}";
    }
}
