package me.gogosing.properties;

/**
 * Created by JinBum Jeong on 2020/03/18.
 */
public class Playground {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Playground{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
