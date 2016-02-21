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
public class Big_bag extends Bag{
    
    public Big_bag(Material meterial)
    {
        this.material=material;
    }

    @Override
    public void store() {
        System.out.println("Big bag sotre"+" "+material.put());
    }
    
}
