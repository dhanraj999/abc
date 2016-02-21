/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dhanraj.homework4;

import com.dhanraj.homework4.entity.Bag;
import com.dhanraj.homework4.entity.Big_bag;
import com.dhanraj.homework4.entity.Books;
import com.dhanraj.homework4.entity.Copies;
import com.dhanraj.homework4.entity.Medium_bag;
import com.dhanraj.homework4.entity.Small;

/**
 *
 * @author dhannu
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bag b=new Medium_bag(new Copies());
        b.store();
        b.setMaterial(new Copies());
         b.store();
        b.setMaterial(new Books());
        
        Bag s=new Small(new Books());
        s.store();
        s.setMaterial(new Copies());
        s.store();
        
        s.setMaterial(new Books());
        s.store();
        
        Bag bi=new Big_bag(new Books());
        bi.setMaterial(new Copies());
        bi.store();
        
        bi.setMaterial(new Books());
        bi.store();
        
    }
    
}
