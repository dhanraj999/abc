/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util.dhanraj.hw1;


/**
 *
 * @author dhannu
 */
public class multiple_table {
    
 
    public int multiple_table(){
    for(int i=1; i<=10; i++){
            System.out.println("2 *"+ i+"="+(2*i));
        }
        return 0;
    
}
    public int multiple_ten(){
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.println(i+" *"+ j+"="+(i*j));
                
            }
        }
        return 0;
    }
    public int pattern1(){
        for(int row=1; row<=5; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println("");
        }
        return 0;
    }
    
    
}

