/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dhanraj.process;

/**
 *
 * @author dhannu
 */
  
public abstract class Plan{  
       protected  double rate;  
        public abstract void getRate();  
   
         public void calculateBill(int units){  
              System.out.println(units*rate);  
          }  
 
         
}