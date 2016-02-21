/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dhanraj.homework2a.main;

import com.dhanraj.homework2a.Bus;
import com.dhanraj.homework2a.diesel;
import com.dhanraj.homework2a.vehicle;

/**
 *
 * @author dhannu
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    vehicle v=new Bus(new diesel());
    v.run();
    
    }
    
}
