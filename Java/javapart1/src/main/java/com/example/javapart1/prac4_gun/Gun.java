package com.example.javapart1.prac4_gun;

// 기본이 되는 Gun 클래스 생성
public class Gun {
    protected String model;
    protected int bulletCount;

    public void fire() {
        System.out.println(model + "=>");
        bulletCount -= 1;
    }

    public Gun(String model) {
        bulletCount = 10;
        this.model = model;
    }
}
