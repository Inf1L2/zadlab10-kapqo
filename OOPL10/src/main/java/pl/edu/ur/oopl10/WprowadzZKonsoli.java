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
public class WprowadzZKonsoli {
    

    
    static void wprowadzInt(){
        try{
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Wprowadz liczbe calkowita");
        x = in.nextInt();
        }
        catch(Exception e){
            System.out.println("Podany ciąg znaków nie jest liczba calkowita");
             }
         }
    
        static void wprowadzString(){
        try{
        String y;
        Scanner in = new Scanner(System.in);
        System.out.println("Wprowadz słowo");
        y = in.nextLine();
        }
        catch(Exception e){
            System.out.println("Podany ciąg znaków nie jest słowem");
            }
        }
        
        static void wprowadzDouble(){
        try{
        Double z;
        Scanner in = new Scanner(System.in);
        System.out.println("Wprowadz liczbe rzeczywistą");
        z = in.nextDouble();
        }
        catch(Exception e){
            System.out.println("Podany ciąg znaków nie jest liczbą rzeczywistą");
        }
    }
    
}
