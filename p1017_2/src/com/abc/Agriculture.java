package com.abc;

public class Agriculture { 
    public String mktName;
    public String fodName;    
    public double upPrice;    
    public double midPrice;    
    public double downPrice;    
    public double avgPrice;   
    public double count;
    
    
    public Agriculture() {
        //nothing
    }
    public Agriculture(String items[]) {
        mktName = items[1];
        fodName = items[2];    
        upPrice = Double.parseDouble(items[3]);    
        midPrice = Double.parseDouble(items[4]);    
        downPrice = Double.parseDouble(items[5]);    
        avgPrice = Double.parseDouble(items[6]);   
        count = Double.parseDouble(items[7]);
    }
}
