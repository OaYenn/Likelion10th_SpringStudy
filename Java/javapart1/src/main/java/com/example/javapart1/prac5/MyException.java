package com.example.javapart1.prac5;

public class MyException extends Exception {
    String exMsg;

    public MyException(String msg) {
        exMsg = "MyException: " + msg;
    }

    @Override
    public String getMessage() { // Exception 클래스의 getMessage()메서드 오버라이딩
        return exMsg; // 생성자에서 메시지 받아 문자열 조합 후 getMessage()에서 리턴하도록 구현
    }
}
