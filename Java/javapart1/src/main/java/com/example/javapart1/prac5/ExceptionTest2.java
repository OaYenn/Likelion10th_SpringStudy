package com.example.javapart1.prac5;

public class ExceptionTest2 {
    int num;

    public void doException() throws MyException {
        if (num == 1)
            System.out.println("OK");
        else
            throw new MyException("doException");
    }

    public static void main(String[] args) {
        ExceptionTest2 app = new ExceptionTest2();
        app.num = 2;

        try {
            app.doException();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}