package com.abc;

public class Bill {       
    private String cusNo; 
    private int degree;
    private int _degree;
    
    
    public Bill() {
        cusNo = null;
        degree = 0;
    }
    public Bill(String items[]) {
        cusNo = items[0];
        degree = Integer.parseInt(items[1]);
    }
    
    public String getCusNo() {return cusNo;}
    public int getDegree() {return degree;}
    
    public void setCusNo(String cusNo) {this.cusNo = cusNo;}
    public void setDegree(int degree) {this.degree = degree;}
    
    public int fee() {
        double cost = 0;
        if (degree > 1000) {
            cost = degree * 6.71;
        }
        else if (degree > 700) {
            cost = degree * 6.16;
        }
        else if (degree > 500) {
            cost = degree * 5.44;
        }
        else if (degree > 330) {
            cost = degree * 4.39;
        }
        else if (degree > 120) {
            cost = degree * 3.02;
        }
        else {
            cost = degree * 2.10;
        }
        
        
        return (int)Math.round(cost);
    }
    
}
