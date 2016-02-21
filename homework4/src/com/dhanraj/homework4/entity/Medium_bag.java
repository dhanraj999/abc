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
public class Medium_bag extends Bag {
    
    public Medium_bag (Material material){
        this.material=material;
        
    }

    @Override
    public void store() {
        System.out.println("Medium bag store"+ "  "+material.put());
    }
    
}
