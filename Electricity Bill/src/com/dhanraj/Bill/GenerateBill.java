/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dhanraj.Bill;

import com.dhanraj.process.GetPlanFactory;
import com.dhanraj.process.GetPlanFactory;
import com.dhanraj.process.Plan;
import com.dhanraj.process.Plan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author dhannu
 */
public class GenerateBill{  
    public static void main(String args[])throws IOException{  
      GetPlanFactory planFactory = new GetPlanFactory();  
        
      System.out.print("Enter the name of plan for which the bill will be generated: ");  
  Scanner input= new Scanner(System.in); 
  
      String planName=input.nextLine();  
      System.out.print("Enter the number of units for bill will be calculated: ");  
      int units=Integer.parseInt(input.nextLine());  
  
      Plan p = planFactory.getPlan(planName);  
      
  
       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
           p.getRate();  
           p.calculateBill(units);  
            }  
    }