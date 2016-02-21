/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dhanraj.homework2a;

/**
 *
 * @author dhannu
 */
public class Bus extends vehicle {

    public Bus(oil oil)
    {
        this.oil=oil;
    }

  

    @Override
    public void run() {
        System.out.println(" Bus is with help of  "+oil.fill());
    }
    
}
