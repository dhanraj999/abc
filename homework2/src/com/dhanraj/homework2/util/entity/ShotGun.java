/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dhanraj.homework2.util.entity;

/**
 *
 * @author Satish
 */
public class ShotGun extends Gun {
    public ShotGun(Bullet bullet)
    {
        this.bullet=bullet;
    }

    @Override
    public void shoot() {
        System.out.println("Shotgun is firing with" + bullet.size());
    }
    
}
