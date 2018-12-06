package com.abc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Salary implements Expense{
    //======================== 
    // 成員
    //======================== 
    private LocalDate date;    //發薪日
    private String employee;   //員工姓名
    private char rank;         //職等, 分為A, B, C三種
    private int overHours;     //加班時數
    
    
    
    public Salary(String items[]) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/M/d");
        
        date = LocalDate.parse(items[0].trim(), formatter);
        employee = items[1].trim();
        rank = items[2].trim().charAt(0);
        overHours = Integer.parseInt(items[3].trim());
    }
    
    //========================   
    // 建構元(1) 傳4個參數
    //========================  
    public Salary(LocalDate date, String employee, char rank, int overHours) {
        this.date = date;
        this.employee = employee;
        this.rank = rank;
        this.overHours = overHours;
    }

    //======================== 
    // 建構元(2) 傳0個參數
    //======================== 
    public Salary() {}

    //======================== 
    // Setters
    //======================== 
    public void setDate(LocalDate date) {this.date = date;}
    public void setEmployee(String employee) {this.employee = employee;}
    public void setRank(char rank) {this.rank = rank;}
    public void setOverHours(int overHours) {this.overHours = overHours;}

    //========================  
    // Getters
    //======================== 
    public LocalDate getDate() {return date;}
    public String getEmployee() {return employee;}
    public char getRank() {return rank;}
    public int getOverHour() {return overHours;}

    //======================== 
    // 完成介面的抽象方法(1)
    //========================    
    @Override
    public String category(){
        return "薪水支出";
    }

    //======================== 
    // 完成介面的抽象方法(2)
    //======================== 
    @Override
    public String detail() {
        String t = date.toString() + "發薪,員工" + employee + ",職等" + rank + ",加班" + overHours + "小時";
        return t;
    }


    //======================== 
    // 完成介面的抽象方法(3)
    //======================== 
    @Override
    public int total() {
        int base = 0;
        if (rank == 'A') {
            base = 60000 + 300 * overHours;
        }
        else if (rank == 'B') {
            base = 50000 + 200 * overHours;
        }
        else {
            base = 35000 + 150 * overHours;
        }
        return base;
    }

    //======================== 
}