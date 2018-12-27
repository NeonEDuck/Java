package com.abc;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract public class Rental {
    //------------------------------   
    // 成員    
    //------------------------------  
    private String category;       //租用類別
    private LocalDate startDate;   //租用起始日
    private LocalDate endDate;     //租用終止日
    
    //------------------------------    
    // 建構元(1)
    //------------------------------   
    public Rental(String category, LocalDate startDate, LocalDate endDate){
        this.category = category;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    //------------------------------    
    // 建構元(2)    
    //------------------------------         
    public Rental(){
        this.category = null;
        this.startDate = null;
        this.endDate = null;      
    }
    
    //------------------------------  
    // getters
    //------------------------------       
    public String getCategory(){return this.category;}
    public LocalDate getStartDate(){return this.startDate;}
    public LocalDate getEndDate(){return this.endDate;}
    
    //------------------------------  
    // setters
    //------------------------------       
    public void setCategory(String category){this.category = category;}
    public void setStartDate(LocalDate startDate){this.startDate = startDate;}
    public void setEndDate(LocalDate endDate){this.endDate = endDate;}
    
    //===============================    
    // 租用日數    
    //===============================     
    public int rentDays(){   
        return (int)(ChronoUnit.DAYS.between(this.startDate, this.endDate) + 1);
    } 
    
    //===============================    
    // 抽象方法: 租用費用    
    //===============================     
    abstract public int fee();        
}