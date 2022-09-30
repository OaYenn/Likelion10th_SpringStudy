package com.example.javapart1.prac4_gun.prac4_car;

import com.example.javapart1.prac4_gun.Gun;

public class AssaultRifle extends Gun {
    public void fire() {
        bulletCount -= 5;
        System.out.printf("%s => => => => => , %d\n",model, bulletCount);
    }

    public AssaultRifle(String model) {
        super(model);
        bulletCount = 40;
    }
}
