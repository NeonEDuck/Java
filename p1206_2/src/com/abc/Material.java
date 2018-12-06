package com.abc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Material implements Expense {
    //======================== 
    // 成員
    //======================== 

    private LocalDate date;    //購入日
    private String item;       //項目名稱
    private int price;         //每公斤價格
    private int weight;        //購入公斤數

    public Material(String items[]) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/M/d");
        
        date = LocalDate.parse(items[0].trim(), formatter);
        item = items[1].trim();
        price = Integer.parseInt(items[2].trim());
        weight = Integer.parseInt(items[3].trim());
    }
    //========================   
    // 建構元(1) 傳4個參數
    //========================  
    public Material(LocalDate date, String item, int price, int weight) {
        this.date = date;
        this.item = item;
        this.price = price;
        this.weight = weight;
    }
    //======================== 
    // 建構元(2) 傳0個參數
    //======================== 
    public Material() {}
    
    //======================== 
    // Setters
    //======================== 
    public void setDate(LocalDate date) {this.date = date;}
    public void setItem(String item) {this.item = item;}
    public void setPrice(int price) {this.price = price;}
    public void setWeight(int wright) {this.weight = weight;}
    //========================  
    // Getters
    //======================== 
    public LocalDate getDate() {return date;}
    public String getItem() {return item;}
    public int getPrice() {return price;}
    public int getWeight() {return weight;}
    
    //======================== 
    // 完成介面的抽象方法(1)
    //========================    
    @Override
    public String category() {
        return "原料支出";
    }

    //======================== 
    // 完成介面的抽象方法(2)
    //======================== 
    @Override
    public String detail() {
        String t = date.toString()+ "購入" + item + ",1公斤" + price + "元,購入" + weight + "公斤";
        return t;
    }

    //======================== 
    // 完成介面的抽象方法(3)
    //======================== 
    @Override
    public int total() {
        return weight * price;
    }
}
