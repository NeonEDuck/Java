package com.abc;
import java.time.LocalDate;

public class Agriculture { 
    public LocalDate date;
    public String mktName;
    public String fodName;    
    public double upPrice;    
    public double midPrice;    
    public double downPrice;    
    public double avgPrice;   
    public double count;
    
    
    public Agriculture() {
        date = null;   
        mktName = null;
        fodName = null;    
        upPrice = 0.0;    
        midPrice = 0.0;    
        downPrice = 0.0;    
        avgPrice =0.0;   
        count = 0.0;
    }
    public Agriculture(String items[]) {
        date = LocalDate.parse(items[0]);   
        mktName = items[1];
        fodName = items[2];    
        upPrice = Double.parseDouble(items[3]);    
        midPrice = Double.parseDouble(items[4]);    
        downPrice = Double.parseDouble(items[5]);    
        avgPrice = Double.parseDouble(items[6]);   
        count = Double.parseDouble(items[7]);
    }
    
    public int total() {
        int tot = (int)Math.floor(avgPrice * count);
        return tot;
    }
}
