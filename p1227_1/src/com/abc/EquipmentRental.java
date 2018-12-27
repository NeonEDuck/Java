package com.abc;

//==============================

import java.time.LocalDate;

// [設備租用]繼承了[租用]
// 也將完成父親所有的抽象方法
//==============================
public class EquipmentRental extends Rental{
    //=====================    
    // 成員
    //=====================  
    private String equipment;    //租用設備
    private int amount;          //租用數量
    
    //=====================    
    // 建構元(1)
    //=====================    
    public EquipmentRental(String category, LocalDate startDate, LocalDate endDate, String equipment, int amount){        
        super(category, startDate, endDate);
        this.equipment = equipment;
        this.amount = amount;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public EquipmentRental(){
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
    // 完成父親的抽象方法    
    //=====================    
    @Override
    public int fee(){
        int mon = 0;
        if (equipment.equals("3D印表機")) {
            mon = 350;
        }
        else if (equipment.equals("雷射雕刻機")) {
            mon = 280;
        }
        else if (equipment.equals("CNC雕刻機")) {
            mon = 450;
        }
        mon = mon * amount * rentDays();
        if (mon >= 10000) {
            mon = (int)(mon * 0.95);
        }
        return mon;
    } 
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        String str = "租用類別:" + getCategory() + ", 起始日:" + getStartDate().toString() + ", 終止日:" + getEndDate().toString() + ", 日數:" + rentDays() + "設備:" + equipment + ", 數量:" + amount + ", 租金:" + fee() + "元";
        return str;
    }     
    //=====================     
}