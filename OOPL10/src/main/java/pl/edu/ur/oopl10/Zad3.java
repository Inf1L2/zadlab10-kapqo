/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;
import java.lang.Exception;

/**
 *
 * @author kapqo
 */
public class Zad3 extends java.lang.Exception{
    
    static void dzielenie(){
        try{
            int dzielnik;
            int dzielna;
            int wynik;
            dzielnik = 0;
            dzielna = 256;
            wynik = dzielna/dzielnik;
            
            
        }
        catch(Exception e){
            System.out.println("Dzielenie przez 0 jest niemożliwe");
    }
    
    
}
}