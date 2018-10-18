package com.abc;
import java.time.LocalDate;

public class Bill {       
    public String cusNo; 
    public boolean isSummer;
    public int degree;
    public int _degree;
    
    
    public Bill() {
        cusNo = null;
        isSummer = false;
        degree = 0;
    }
    public Bill(String items[]) {
        cusNo = items[0];
        isSummer = Boolean.parseBoolean(items[1]);
        degree = Integer.parseInt(items[2]);
    }
    
    public int fee() {
        double cos = 0;
        if (isSummer == true) {
            cos = summerFee();
        }
        return (int)Math.floor(cos);
    }
    
    private double summerFee() {
        double cos = 0;
        _degree = degree;
        cos += idvFee(2.1, 120-0);
        cos += idvFee(3.02, 330-120);
        cos += idvFee(4.39, 500-330);
        cos += idvFee(5.44, 700-500);
        cos += idvFee(6.16, 1000-700);
        cos += 6.71 * _degree;
        return cos;
    }
    
    private double idvFee(double money, double max) {
        double cos = 0;
        if (_degree > max) {
            _degree -= max;
            cos = money * max;
        }
        else {
        
            cos = money * _degree;
            _degree = 0;
        }
        return cos;
    } 
}
