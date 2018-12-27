package com.abc;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//==============================
// [倉儲租用]繼承了[租用]
// 也將完成父親所有的抽象方法
//==============================
public class WarehouseRental extends Rental{
    //=====================    
    // 成員
    //=====================  
    private int footage;  //坪數
    
    //=====================    
    // 建構元(1)
    //=====================    
    public WarehouseRental(String category, LocalDate startDate, LocalDate endDate, int footage){        
        super(category, startDate, endDate);
        this.footage = footage;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public WarehouseRental(){
        super();
        footage = 0;
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
    // 完成父親的抽象方法    
    //=====================    
    @Override
    public int fee(){
        int mu = rentDays() / 20;
        int left = rentDays() - mu * 20;
        return (250 * footage * mu) + (30 * footage * left);
    } 
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        String str = "租用類別:" + getCategory() + ", 起始日:" + getStartDate() + ", 終止日:" + getEndDate() + ", 日數:" + rentDays() + ", 坪數:" + footage + ", 租金:" + fee() + "元";
        return str;
    }     
    //=====================     
}