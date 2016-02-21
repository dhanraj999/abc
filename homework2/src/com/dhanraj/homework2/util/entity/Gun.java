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
public abstract class Gun {
    protected Bullet bullet;
    public abstract void shoot();
    public void setBullet(Bullet bullet)
    {
        this.bullet=bullet;
    }
}
