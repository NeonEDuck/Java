package com.abc;

//==============================
// [累進傭金類別]繼承了[傭金類別]
// 也將完成父親所有的抽象方法
//==============================
public class AccumulatedCommission extends Commission{
    //=====================    
    // 成員
    //=====================  
    private int quota;         //達標金額
    private double extraRate;  //累進傭金率
    
    //=====================    
    // 建構元(1)
    //=====================    
    public AccumulatedCommission(String name, int performance, int quota, double extraRate){
        super(name, performance);
        this.quota = quota;
        this.extraRate = extraRate;
    }

    //=====================    
    // 建構元(2)    
    //=====================  
    public AccumulatedCommission(){
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
    
    
    /*
    若(業績 >= 達標金額),
         傭金 = 達標金額 * 0.125 + (業績 - 達標金額) * 累進傭金率,   
   (3-2) 否則, 傭金 = 達標金額 * 0.11 - (達標金額 - 業績) * (累進傭金率 - 0.123).   
    */
    //=====================    
    // 完成父親的抽象方法    
    //=====================     
    @Override
    public int commission(){
        int fin = 0;
        int per = getPerformance();
        
        if (per >= quota) {
            fin = (int)Math.ceil(quota * 0.125 + (per - quota) * extraRate);
        }
        else {
            fin = (int)Math.ceil(quota * 0.11 - (quota - per) * (extraRate - 0.123));
        }
        return fin;
    }
    
    //=====================    
    // 改寫父親的方法    
    //=====================      
    @Override
    public String toString(){
        String str = "交付對象:" + getName() + ", 業績:" + getPerformance() + "元, 達標金額:" + quota + "元, 累進傭金率:" + extraRate + ", 傭金:" + commission() + "元";
        return str;
    }
    //=====================      
}