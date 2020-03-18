package me.gogosing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by JinBum Jeong on 2020/03/18.
 */
@ConfigurationProperties("playground")
public class PlaygroundProperties {

    private String name = "default";

    private int age = 0;

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
}
