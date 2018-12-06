package com.abc;

import java.time.LocalDate;

//----------------------------
// 類別, 它實作了Income介面
//----------------------------
public class LaborIncome implements Income{
    //======================== 
    // 成員
    //======================== 
    private LocalDate date;
    private String firm;
    private int persons;

    //========================   
    // 建構元(1) 傳4個參數
    //========================  
    public LaborIncome(LocalDate date, String firm, int persons){
        this.date = date;
        this.firm = firm;
        this.persons = persons;
    }

    //======================== 
    // 建構元(2) 傳0個參數
    //======================== 
    public LaborIncome(){}

    //======================== 
    // Setters
    //======================== 
    public void setLocalDate(LocalDate date){this.date = date;}
    public void setFirm(String firm){this.firm = firm;}
    public void setPersons(int persons){this.persons = persons;}

    //========================  
    // Getters
    //======================== 
    public LocalDate getDate(){return this.date;}
    public String getFirm(){return this.firm;}
    public int getPersons(){return this.persons;}
    
    //======================== 
    // 完成介面的抽象方法(1)
    //========================    
    @Override
    public String category(){
        return "勞務收入";
    }
 
    //======================== 
    // 完成介面的抽象方法(2)
    //======================== 
    @Override
    public String detail(){
        return this.date + "外派" + this.persons + "人至" + this.firm;
    }

    //======================== 
    // 完成介面的抽象方法(3)
    //======================== 
    @Override
    public int total(){
        return 2500 * this.persons;
    } 
    //======================== 
}