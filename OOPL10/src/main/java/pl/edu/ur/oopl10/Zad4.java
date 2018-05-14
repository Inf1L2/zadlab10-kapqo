/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;
import java.util.*;

/**
 *
 * @author kapqo
 */
public class Zad4 {
    
    static void zad4(){
        int a, b;
        double wynik;
        Random rand = new Random();
        
        
        try{
        System.out.println("Losujemy 2 liczby z zakresu (-10 -> 10)");
        a=rand.nextInt(20)-10;
        System.out.println("Pierwsza liczba wynosi: " + a);
        b=rand.nextInt(20)-10;
        System.out.println("Druga liczba wynosi: " + b);
        
        wynik = a/b;
        System.out.println("Wynik dzielenia pierwszej liczby przez drugą = " + wynik);
        }
        catch(Exception e){
            
            System.out.println("Dzielenie przez 0 nie jest możliwe");
            
        }
        
        
    }
    
}
