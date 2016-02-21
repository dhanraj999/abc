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
public class ak47Gun extends Gun {
     public ak47Gun(Bullet bullet)
    {
        this.bullet=bullet;
    }


    @Override
    public void shoot() {
        System.out.println("Semi-Machine Gun is firing with " + bullet.size());
    }
    
}
