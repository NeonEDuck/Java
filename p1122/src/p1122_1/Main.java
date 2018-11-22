package p1122_1;

import com.abc.Utility;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double kg[] = {40, 50, 55.5, 60, 75}; 
        
        double lb[] ={100, 140, 195.5, 200, 220}; 
        
        int f[] = {100, 85, 93, 40, 20}; 
        
        int c[] = {20, 25, 30, 33, 37}; 
        
        for (int i = 0; i < lb.length; i++) {
            System.out.println(Utility.toKg(lb[i]));
        }
        for (int i = 0; i < kg.length; i++) {
            System.out.println(Utility.toLb(kg[i]));
        }
        
        for (int i = 0; i < f.length; i++) {
            System.out.println(Utility.toCelsius(f[i]));
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(Utility.toFahrenheit(c[i]));
        }
    }
}
