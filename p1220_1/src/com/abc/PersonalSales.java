package com.abc;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class PersonalSales extends Sales {
    //=====================    
    // 成員
    //===================== 
    private boolean hasElevator; //是否有電梯
    private int floor;           //樓層
    
    //=====================    
    // 建構元(1)
    //=====================    
    public PersonalSales(String no, String product, int price, int amount, int shipment, boolean hasElevator, int floor){
        super(no, product, price, amount, shipment);
        this.hasElevator = hasElevator;
        this.floor = floor;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public PersonalSales(){
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
    // 改寫父親的方法(總額)    
    //=====================   
    public int extra() {
        if (hasElevator == false) {
            return (floor - 1) * 300;
        }
        return 0;
    }
    @Override    
    public int total(){
        int tot = getPrice() * getAmount() + getShipment();
        tot += extra();
        return tot;
    }     
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("###,###");
        df.setRoundingMode(RoundingMode.HALF_UP);
        String s = "編號:" + getNo() + ", 品名:" + getProduct() + ", 單價:" + df.format((long)getPrice()) + "元, 數量:" + getAmount() + ", 運費:" + df.format((long)getShipment()) + "元, 樓層搬運費:" + extra() + "元, 總額:" + df.format((long)total()) + "元";
        return s;
    }     
    //=====================      
}