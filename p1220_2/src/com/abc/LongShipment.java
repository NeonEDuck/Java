package com.abc;

import java.text.DecimalFormat;

public class LongShipment extends Shipment{
    private int _distance;
    //==========================    
    // 建構元(1)
    //==========================    
    public LongShipment(double type, int employees, String destination, int distance){
        super(type, employees, destination, distance);
        _distance = getDistance();
    }
    
    //==========================    
    // 建構元(2)    
    //==========================         
    public LongShipment(){
       super();     
       _distance = getDistance();
    }
    
    private double pro(int d, double m) {
        double tot;
        if (_distance > d) {
            tot = m * d;
            _distance -= d;
        }
        else {
            tot = m * _distance;
            _distance = 0;
        }
        return tot;
    }
    
    //==========================    
    // 方法(運輸成本, 小數捨去)    
    //==========================     
    public int cost(){
        double p = getEmployees() * getDistance() * 2.8;
        double c = 0;
        double type = getType();
        c += pro(100, 4.8);
        c += pro(80, 4.2);
        c += pro(70, 3.6);
        c += _distance * 3.3;
        c *= type;
        
        return (int)(p + c);
    }

    //==========================    
    // 改寫父親的方法    
    //==========================   
    @Override
    public String toString(){
        return super.toString();
    }
}