package com.abc;

//==============================

import java.time.LocalDate;

// [人力租用]繼承了[租用]
// 也將完成父親所有的抽象方法
//==============================
public class LaborRental extends Rental{
    //=====================    
    // 成員
    //=====================  
    private int labors;       //人數
    private char period;      //工作時段
    private boolean isHeavy;  //是否大量勞力型工作
    
    //=====================    
    // 建構元(1)
    //=====================    
    public LaborRental(String category, LocalDate startDate, LocalDate endDate, int labors, char period, boolean isHeavy){        
        super(category, startDate, endDate);
        this.labors = labors;
        this.period = period;
        this.isHeavy = isHeavy;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public LaborRental(){
        super();
        labors = 0;
        period = ' ';
        isHeavy = false;
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
        int mon = 0;
        if (period == 'A') {
            mon = 1000;
        }
        else {
            mon = 1500;
        }
        if (isHeavy == true) {
            mon += 500;
        }
        return labors * mon * rentDays();
    } 
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        String y = "不是";
        if (isHeavy == true) {
            y = "是";
        }
        String str = "工作" + rentDays() + "天, 人數" + labors + "人, 工作時段" + period + ", " + y + "大量勞力型工作, 租金:" + fee() + "元";
        return str;
    }     
    //=====================     
}