package com.example.cafejabi;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {
    private String uid;
    private String email;
    private String nickname;
    private int age;
    private String job;
    private List<String> style;
    private List<Cafe> visitedCafeList;
    private List<Cafe> likingCafeList;

    public UserInfo(){}

    public UserInfo(String uid, String email, String nickname, int age, String job, List<String> style){
        this.uid = uid;
        this.email = email;
        this.nickname = nickname;
        this.age = age;
        this.job = job;
        this.style = style;
        this.visitedCafeList = new ArrayList<>();
        this.likingCafeList = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public List<String> getStyle() {
        return style;
    }

    public void setStyle(List<String> style) {
        this.style = style;
    }

    public List<Cafe> getVisitedCafeList() {
        return visitedCafeList;
    }

    public void setVisitedCafeList(List<Cafe> visitedCafeList) {
        this.visitedCafeList = visitedCafeList;
    }

    public List<Cafe> getLikingCafeList() {
        return likingCafeList;
    }

    public void setLikingCafeList(List<Cafe> likingCafeList) {
        this.likingCafeList = likingCafeList;
    }
}
