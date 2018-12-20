package com.abc;

public class DiscountSales extends Sales {
    //=====================    
    // 成員
    //===================== 
    private double discount; //折扣
    
    //=====================    
    // 建構元(1)
    //=====================    
    public DiscountSales(String no, String product, int price, int amount, int shipment, double discount){
        super(no, product, price, amount, shipment);
        this.discount = discount;
        //自行完成
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public DiscountSales(){
        super();
    }
    
    //=====================    
    // getter
    //===================== 
    //自行完成    
    
    //=====================    
    // setter
    //=====================     
    //自行完成    
    
    //=====================    
    // 改寫父親的方法(總額)    
    //=====================   
    @Override    
    public int total(){
        double tot = (getPrice() * getAmount()) * discount + getShipment();
        if (tot >= 200000) {
            tot *= 0.95;
        }
        return (int)tot;
        //自行完成
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