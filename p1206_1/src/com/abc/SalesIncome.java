package com.abc;

import java.time.LocalDate;

//----------------------------
// 類別, 它實作了Income介面
//----------------------------
public class SalesIncome implements Income{
    //======================== 
    // 成員
    //======================== 
    private LocalDate date;
    private String dealer;
    private int total;
    private int discount;

    //========================   
    // 建構元(1) 傳4個參數
    //========================  
    public SalesIncome(LocalDate date, String dealer, int total, int discount){
        this.date = date;
        this.dealer = dealer;
        this.total = total;
        this.discount = discount;
    }

    //======================== 
    // 建構元(2) 傳0個參數
    //======================== 
    public SalesIncome(){}

    //======================== 
    // Setters
    //======================== 
    public void setLocalDate(LocalDate date){this.date = date;}
    public void setDealer(String dealer){this.dealer = dealer;}
    public void setTotal(int total){this.total = total;}
    public void setDiscount(int discount){this.discount = discount;}

    //========================  
    // Getters
    //======================== 
    public LocalDate getDate(){return this.date;}
    public String getDealer(){return this.dealer;}
    public int getTotal(){return this.total;}
    public int getDiscount(){return this.discount;}
    
    //======================== 
    // 完成介面的抽象方法(1)
    //========================    
    @Override
    public String category(){
        return "銷貨收入";
    }
 
    //======================== 
    // 完成介面的抽象方法(2)
    //======================== 
    @Override
    public String detail(){
        return this.date + "出貨給" + this.dealer + "," + "銷售金額" + this.total + "元, 折扣" + this.discount + "元";
    }

    //======================== 
    // 完成介面的抽象方法(3)
    //======================== 
    @Override
    public int total(){
        return this.total - this.discount;
    } 
    //======================== 
}