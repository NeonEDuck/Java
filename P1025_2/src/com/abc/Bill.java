package com.abc;

public class Bill {       
    private String cusNo; 
    private int degree;
    
    
    public Bill() {
        cusNo = null;
        degree = 0;
    }
    public Bill(String items[]) {
        cusNo = items[0];
        degree = Integer.parseInt(items[1]);
    }
    
    public int fee() {
        double cos = 0;
        return (int)Math.floor(cos);
    }
    
    public String getCusNo() {return cusNo;}
    public int getDegree() {return degree;}
    
    public void setCusNo(String cusNo) {this.cusNo = cusNo;}
    public void setDegree(int degree) {this.degree = degree;}
    
    public int fee(int level) {
        double cost;
        if (degree >= level) {
            cost = 4.2 * degree;
        }
        else {
            cost = 3.8 * degree;
        }
        return (int)Math.round(cost);
    }
}
