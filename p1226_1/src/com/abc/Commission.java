package com.abc;

abstract public class Commission {
    //------------------------------   
    // 成員    
    //------------------------------ 
    private String name;       //交付對象
    private int performance;   //業績
    
    //------------------------------    
    // 建構元(1)
    //------------------------------       
    public Commission(String name, int performance){
        this.name = name;
        this.performance = performance;
    }
    
    //------------------------------    
    // 建構元(2)    
    //------------------------------      
    public Commission(){
        this.name = null;
        this.performance = 0;
    }
    
    //------------------------------  
    // getters
    //------------------------------        
    public String getName(){return this.name;}
    public int getPerformance(){return this.performance;}

    //------------------------------  
    // setters
    //------------------------------ 
    public void setName(String name){this.name = name;}
    public void setPerformance(int performance){this.performance = performance;}

    //===============================    
    // 抽象方法: 傭金    
    //===============================  
    abstract public int commission();   
    //===============================     
}