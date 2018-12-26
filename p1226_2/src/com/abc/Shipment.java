package com.abc;

abstract public class Shipment {
    //------------------------------   
    // 成員    
    //------------------------------  
    private double carType;      //貨車噸位
    private int labors;          //送貨員人數
    private String destination;  //目的地
    private int distance;        //距離(公里)
    
    //------------------------------    
    // 建構元(1)
    //------------------------------   
    public Shipment(double carType, int labors, String destination, int distance){
        this.carType = carType;
        this.labors = labors;
        this.destination = destination;
        this.distance = distance;
    }
    
    //------------------------------    
    // 建構元(2)    
    //------------------------------         
    public Shipment(){
        this.carType = 0;
        this.labors = 0;
        this.destination = null;
        this.distance = 0;        
    }
    
    //------------------------------  
    // getters
    //------------------------------       
    public double getCarType(){return this.carType;}
    public int getLabors(){return this.labors;}
    public String getDestination(){return this.destination;}
    public int getDistance(){return this.distance;}
    
    //------------------------------  
    // setters
    //------------------------------       
    public void setCarType(double carType){this.carType = carType;}
    public void setEmployees(int labors){this.labors = labors;}
    public void setDestination(String destination){this.destination = destination;}
    public void setDistance(int distance){this.distance = distance;}
    
    //===============================    
    // 抽象方法: 人力成本    
    //===============================     
    abstract public int laborCost(); 
    
    //===============================    
    // 抽象方法: 貨車成本    
    //===============================     
    abstract public int carCost();  
    
    //===============================    
    // 抽象方法: 總成本    
    //===============================     
    abstract public int totalCost(); 
    //===============================         
}
