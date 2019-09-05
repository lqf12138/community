package com.example.demo.dto;

import lombok.Data;

/**
 * Created by lqf on 2019/9/4.
 */
@Data
public class GithubUser {
    private String name;
    private long id;
    private String bio;

    @Override
    public String toString() {
        return "GithubUser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", bio='" + bio + '\'' +
                '}';
    }
}
