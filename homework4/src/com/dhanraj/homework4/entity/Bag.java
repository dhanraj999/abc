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
public  abstract class Bag {
    protected Material material;
    public abstract void store();
    public void setMaterial(Material material)
    {
        this.material=material;
    }
    
}
