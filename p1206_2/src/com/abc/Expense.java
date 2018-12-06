package com.abc;

public interface Expense {
    public String category();   //支出項目
    public String detail();     //支出說明
    public int total();         //支出金額
}