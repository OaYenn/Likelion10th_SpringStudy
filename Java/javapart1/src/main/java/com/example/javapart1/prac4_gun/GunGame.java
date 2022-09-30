package com.example.javapart1.prac4_gun.prac4_car;

import com.example.javapart1.prac4_gun.Gun;

public class GunGame {
    public static void main(String[] args) {
//        Gun gun = new ShotGun("S12K");
        Gun gun = new com.example.javapart1.prac4_gun.prac4_car.AssaultRifle("M416");

        gun.fire();
    }
}
