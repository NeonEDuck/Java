package com.abc;

//==============================
// [一般貨運]繼承了[貨運]
// 也將完成父親所有的抽象方法
//==============================
public class GeneralShipment extends Shipment{
    //------------------------------    
    // 建構元(1)
    //------------------------------   
    public GeneralShipment(double carType, int labors, String destination, int distance){
        super(carType, labors, destination, distance);
    }
    
    //------------------------------    
    // 建構元(2)    
    //------------------------------         
    public GeneralShipment(){
        super();        
    }
    
    //===============================    
    // 完成父親的抽象方法: 
    // 人力成本(小數捨去)    
    //===============================     
    public int laborCost(){
       return (int)(getLabors() * getDistance() * 2.8);
    } 
    //===============================    
    // 完成父親的抽象方法:
    // 貨車成本(小數捨去)    
    //===============================     
    public int carCost(){
       return (int)(getCarType() * getDistance() * 4.7);
    } 
    
    //===============================  
    // 完成父親的抽象方法:    
    // 總成本    
    //===============================     
    public int totalCost(){
        return laborCost() + carCost();
    }     

    //===============================     
    // 改寫父親的方法    
    //===============================      
    @Override
    public String toString(){
       String str = "貨車噸位:" + getCarType() + ", 送貨員:" + getLabors() + "人, 目的地:" + getDestination() + ", 距離:" + getDistance() + "公里, 人力成本:" + laborCost() + "元, 貨車成本:" + carCost() + "元, 總成本:" + totalCost() + "元";
       return str;
    }
    //===============================     
}