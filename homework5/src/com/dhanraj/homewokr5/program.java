/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dhanraj.homewokr5;

import com.dhanraj.homewokr5.entity.Colors;
import com.dhanraj.homewokr5.entity.Elecrtricity;
import com.dhanraj.homewokr5.entity.Inverter;
import com.dhanraj.homewokr5.entity.Mobile;
import com.dhanraj.homewokr5.entity.Power_bank;
import com.dhanraj.homewokr5.entity.Samsung;
import com.dhanraj.homewokr5.entity.Sony;

/**
 *
 * @author dhannu
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Mobile m=new Colors(new Power_bank());
      m.charge();
      m.setCharge_source(new Inverter());
      m.charge();
      m.setCharge_source(new  Elecrtricity());
      m.charge();
      
      Mobile s=new Sony(new Elecrtricity());
      s.charge();
      s.setCharge_source(new Inverter());
      s.charge();
      s.setCharge_source(new Power_bank());
      s.charge();
      
      Mobile sa=new Samsung(new Inverter());
      sa.charge();
      
      sa.setCharge_source(new Power_bank());
      sa.charge();
      
      sa.setCharge_source(new Elecrtricity());
      sa.charge();
      
    
    }
    
}
