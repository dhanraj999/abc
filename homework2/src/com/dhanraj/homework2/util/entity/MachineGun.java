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
public class MachineGun extends Gun {
    public MachineGun(Bullet bullet)
    {
        this.bullet=bullet;
    }

    @Override
    public void shoot() {
        System.out.println("Machine gun is firing wih" + " " + bullet.size());
    }
    
}
