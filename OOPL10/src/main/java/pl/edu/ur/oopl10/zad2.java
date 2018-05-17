/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Random;

/**
 *
 * @author kapqo
 */
public class zad2 {
    
    static void zad2(){
    
    try{
         int [] losowe;
        losowe = new int[100];
        Random rand = new Random();
    for(int i=0; i<=losowe.length; i++){
         losowe[i] =rand.nextInt(100);   
        }
        
}
    catch(ArrayIndexOutOfBoundsException e){
        
        System.out.println("Tablica posiada tylko 100 elementów!");
}
    
    }
}
