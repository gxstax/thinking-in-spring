package com.ant.java.beans;

/**
 * <p>
 * 描述人的 POJO 类
 *
 * Setter / Getter 方法
 * java beans 可读方法（Writable）、可读（Readable）
 * </p>
 *
 * @author GaoXin
 * @since 2019-12-31 09:00
 */
public class Person {
    String name;

    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
