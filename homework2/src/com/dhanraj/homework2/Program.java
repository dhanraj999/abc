/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dhanraj.homework2;

import com.dhanraj.homework2.util.entity.Gun;
import com.dhanraj.homework2.util.entity.LargeBullet;
import com.dhanraj.homework2.util.entity.MachineGun;
import com.dhanraj.homework2.util.entity.MediumBullet;
import com.dhanraj.homework2.util.entity.ShotGun;
import com.dhanraj.homework2.util.entity.SmallBullet;
import com.dhanraj.homework2.util.entity.ak47Gun;

/**
 *
 * @author Satish
 */
public class Program {
    public static void main(String[] args)
    {
        Gun g=new MachineGun(new SmallBullet());
        g.shoot();
        g.setBullet(new MediumBullet());
        g.shoot();
        g.setBullet(new LargeBullet());
        g.shoot();
        
        Gun s=new ShotGun(new SmallBullet());
        s.shoot();
        s.setBullet(new MediumBullet());
        s.shoot();
        s.setBullet(new LargeBullet());
        s.shoot();
        
        Gun smg=new ak47Gun(new SmallBullet());
        smg.shoot();
        smg.setBullet(new MediumBullet());
        smg.shoot();
        smg.setBullet(new LargeBullet());
        smg.shoot();
        
    }
    
}
