package com.abc;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Sales {
    //=====================
    // 成員        
    //=====================    
    private String no;      //編號
    private String product; //品名  
    private int price;      //單價 
    private int amount;     //數量
    int shipment;   //運費
    
    //=====================    
    // 建構元(1)
    //=====================    
    public Sales(String no, String product, int price, int amount, int shipment){
        this.no = no;
        this.product = product;
        this.price = price;
        this.amount = amount;
        this.shipment = shipment;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public Sales(){
        this.no = null;
        this.product = null;
        this.price = 0;
        this.amount = 0;
        this.shipment = 0;
    }

    //=====================
    // getters
    //=====================    
    public String getNo(){return this.no;}
    public String getProduct(){return this.product;}    
    public int getPrice(){return this.price;}
    public int getAmount(){return this.amount;}
    public int getShipment(){return this.shipment;}
    
    //=====================    
    // setters
    //=====================    
    public void setNo(String no){this.no = no;}
    public void setProduct(String product){this.product = product;}
    public void setPrice(int price){this.price = price;}
    public void setAmount(int amount){this.amount = amount;}
    public void setShipment(int shipment){this.shipment = shipment;}
    
    //=====================    
    // 方法(總額)    
    //=====================    
    public int total(){
        return price * amount + shipment;
    }     
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("###,###");
        df.setRoundingMode(RoundingMode.HALF_UP);
        String s = "編號:" + no + ", 品名:" + product + ", 單價:" + df.format((long)price) + "元, 數量:" + amount + ", 運費:" + df.format((long)shipment) + "元, 總額:" + df.format((long)total()) + "元";
        return s;
    }     
    //=====================      
}