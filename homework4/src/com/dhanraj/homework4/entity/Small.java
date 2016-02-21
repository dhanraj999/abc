/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dhanraj.homework4.entity;

/**
 *
 * @author dhannu
 */
public class Small  extends Bag{
    
    public Small( Material material){
        this.material=material;
        
    }

    @Override
    public void store() {
        System.out.println("Small bag store "+" "+material.put());
    }
    
}
