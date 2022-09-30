package com.example.javapart1.prac4_gun.prac4_car;

import com.example.javapart1.prac4_gun.Gun;

public class ShotGun extends Gun {
    public void fire() {
        bulletCount -= 1;
        System.out.printf("%s =}}}, %d\n", model, bulletCount);
    }

    public ShotGun(String model) {
        super(model);
    }
}
