package com.example.javapart1.prac4_pet;

public abstract class Robot {
    private String name; // 로봇 이름 추가할 수 있도록 멤버변수 추가

    void move() {
        System.out.println("Successful. Robot moved. ");
    }

    abstract void charging(); // 로봇 충전 방법은 다양할 수 있으므로 추상메서드로 선언

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
