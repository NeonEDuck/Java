package com.abc;

//==============================
// [長途貨運]繼承了[貨運]
// 也將完成父親所有的抽象方法
//==============================
public class LongShipment extends Shipment{
    int _dis;
    //------------------------------    
    // 建構元(1)
    //------------------------------   
    public LongShipment(double carType, int labors, String destination, int distance){
        super(carType, labors, destination, distance);
    }
    
    //------------------------------    
    // 建構元(2)    
    //------------------------------         
    public LongShipment(){
        super();        
    }
    
    //===============================    
    // 完成父親的抽象方法: 
    // 人力成本(小數捨去)    
    //===============================     
    public int laborCost(){
       return (int)(getLabors() * getDistance() * 2.8);
    } 
    
    /*
        
      (2-1) 100公里以內(含), 每1噸位, 每1公里4.8元. 
      (2-2) 100公里以上, 180公里以內(含), 每1噸位, 每1公里4.2元. 
      (2-3) 180公里以上, 250公里以內(含), 每1噸位, 每1公里3.6元. 
      (2-4) 250公里以上, 每1公里3.3元.
    */
    private double subCarCost(int dis, double mon) {
        double cos;
        if (_dis > dis) {
            cos = dis * mon;
            _dis -= dis;
        }
        else {
            cos = _dis * mon;
            _dis = 0;
        }
        return cos;
    }
    
    //===============================    
    // 完成父親的抽象方法:
    // 貨車成本(小數捨去)    
    //===============================     
    public int carCost(){
        _dis = getDistance();
        double tot = 0;
        
        tot += subCarCost(100 - 0, 4.8);
        tot += subCarCost(180 - 100, 4.2);
        tot += subCarCost(250 - 180, 3.6);
        tot += _dis * 3.3;
        return (int)(tot * getCarType());
    } 
    
    //===============================  
    // 完成父親的抽象方法:    
    // 總成本    
    //===============================     
    public int totalCost(){
        return laborCost() + carCost();
    }     

    //===============================     
    // 改寫父親的方法    
    //===============================      
    @Override
    public String toString(){
       String str = "貨車噸位:" + getCarType() + ", 送貨員:" + getLabors() + "人, 目的地:" + getDestination() + ", 距離:" + getDistance() + "公里, 人力成本:" + laborCost() + "元, 貨車成本:" + carCost() + "元, 總成本:" + totalCost() + "元";
       return str;
    }
    //===============================     
}