package com.abc;

import java.text.DecimalFormat;

public class Shipment {
    //==========================  
    // 成員    
    //==========================  
    private double type;         //貨車噸位
    private int employees;       //送貨員人數
    private String destination;  //目的地
    private int distance;        //距離(公里)
    
    //==========================    
    // 建構元(1)
    //==========================    
    public Shipment(double type, int employees, String destination, int distance){
        this.type = type;
        this.employees = employees;
        this.destination = destination;
        this.distance = distance;
    }
    
    //==========================    
    // 建構元(2)    
    //==========================         
    public Shipment(){
        this.type = 0;
        this.employees = 0;
        this.destination = null;
        this.distance = 0;        
    }
    
    //==========================  
    // getters
    //==========================       
    public double getType(){return this.type;}
    public int getEmployees(){return this.employees;}
    public String getDestination(){return this.destination;}
    public int getDistance(){return this.distance;}
    
    //==========================  
    // setters
    //==========================       
    public void setType(double type){this.type = type;}
    public void setEmployees(int employees){this.employees = employees;}
    public void setDestination(String destination){this.destination = destination;}
    public void setDistance(int distance){this.distance = distance;}
    
    //==========================    
    // 方法(運輸成本, 小數捨去)    
    //==========================     
    public int cost(){
        double p = employees * distance * 3.1;
        double c = type * 4.5 *distance;
        return (int)(p + c);
    }

    //==========================    
    // 改寫父親的方法    
    //==========================   
    @Override
    public String toString(){
       String s = "貨車噸位:" + type + ", 送貨員:" + employees + "人, 目的地:" + destination + ", 距離:" + distance + "公里, 運輸成本:" + cost() + "元";
       return s;
    }
}