/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dhanraj.homewokr5.entity;

/**
 *
 * @author dhannu
 */
public abstract class Mobile {
    protected Charge_source charge_source;
    public abstract void charge();
    
    public void setCharge_source(Charge_source charge_source){
        this.charge_source=charge_source;
    }
}
