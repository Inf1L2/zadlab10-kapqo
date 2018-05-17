package pl.edu.ur.oopl10;

import static pl.edu.ur.oopl10.WprowadzZKonsoli.*;
import static pl.edu.ur.oopl10.zad2.zad2;
import static pl.edu.ur.oopl10.Zad3.dzielenie;
import java.util.*;
import static pl.edu.ur.oopl10.Zad4.zad4;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) {
        
        int w;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj numer zadania do wykonania: ");
        w = in.nextInt();
        
        switch(w){
            case 1:
                wprowadzInt();
                wprowadzString();
                wprowadzDouble();
        break;
            case 2:
                zad2();
        break;
            case 3:
                dzielenie();
        break;        
            case 4:
                zad4();
        break;        
        }
    }

  

   
    
}
