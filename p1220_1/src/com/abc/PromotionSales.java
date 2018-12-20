package com.abc;

public class PromotionSales extends Sales {
    //=====================    
    // 建構元(1)
    //=====================    
    public PromotionSales(String no, String product, int price, int amount, int shipment){
        super(no, product, price, amount, shipment);
        if (total() >= 200000) {
            setShipment(0);
        }
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public PromotionSales(){
        super();
        if (total() >= 200000) {
            setShipment(0);
        }
    }
    
    //=====================    
    // 改寫父親的方法(總額)    
    //=====================   
    @Override    
    public int total(){
        int tot = (getPrice() * getAmount() + getShipment());
        return tot;
    }     
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        return super.toString();
    }     
    //=====================      
}