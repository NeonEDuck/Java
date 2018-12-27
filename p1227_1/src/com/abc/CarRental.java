package com.abc;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
//==============================

// [汽車租用]繼承了[租用]
// 也將完成父親所有的抽象方法
//==============================
public class CarRental extends Rental{
    //=====================    
    // 建構元(1)
    //=====================    
    public CarRental(String category, LocalDate startDate, LocalDate endDate){ 
        super(category,startDate, endDate);
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public CarRental(){
        super();
    }    

    //=====================    
    // 完成父親的抽象方法    
    //===================== 
    @Override
    public int fee(){
        return 2000 * rentDays();
    } 
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        String str = "租用類別:" + getCategory() + ", 起始日:" + getStartDate().toString() + ", 終止日:" + getEndDate().toString() + ", 日數:" + rentDays() + ", 租金:" + fee() + "元";
        return str;
    }     
    //=====================     
}