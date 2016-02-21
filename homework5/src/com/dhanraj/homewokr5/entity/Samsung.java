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
public class Samsung extends Mobile{
    
    public Samsung(Charge_source charge_source){
        this.charge_source=charge_source;
    }

    @Override
    public void charge() {
        System.out.println("Samsung mobile is charging through"+"  "+charge_source.Connect());
    }
    
}
