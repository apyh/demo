package com.github.kahlkn.demo.jdk.introspector;

public class Student extends Person {

    private static final Integer DEFAULT_SCORE = 0;

    private Integer score;
    private String email;
    private boolean hasBlog;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public boolean isHasBlog() {
        return hasBlog;
    }

    public void setHasBlog(boolean hasBlog) {
        this.hasBlog = hasBlog;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", height=" + getHeight() +
                ", score=" + score +
                ", email='" + email + '\'' +
                '}';
    }
}
