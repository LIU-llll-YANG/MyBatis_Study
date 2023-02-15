package com.liuyang.pojo;

public class Student {
    private Integer id;
    private String name;
    private Clazz clazz;


    public Student() {
    }

    public Student(Integer id, String name, Clazz clazz) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return clazz
     */
    public Clazz getClazz() {
        return clazz;
    }

    /**
     * 设置
     * @param clazz
     */
    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String toString() {
        return "Student{id = " + id + ", name = " + name + ", clazz = " + clazz + "}";
    }
}
