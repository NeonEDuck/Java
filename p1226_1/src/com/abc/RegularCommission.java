package com.abc;

//==============================
// [一般傭金類別]繼承了[傭金類別]
// 也將完成父親所有的抽象方法
//==============================
public class RegularCommission extends Commission{
    //=====================    
    // 建構元(1)
    //=====================    
    public RegularCommission(String name, int performance){
        super(name, performance);
    }

    //=====================    
    // 建構元(2)    
    //=====================  
    public RegularCommission(){
        super();
    }
    
    //=====================    
    // 完成父親的抽象方法    
    //=====================     
    //業績 * 0.125, 小數無條件進位
    @Override
    public int commission(){
        int fin = (int)Math.ceil(getPerformance() * 0.125);
        return fin;
    }
    
    //=====================    
    // 改寫父親的方法    
    //=====================      
    @Override
    public String toString(){
        String str = "交付對象:" + getName() + ", 業績:" + getPerformance() + "元, 傭金:" + commission() + "元";
        return str;
    }
    //=====================      
}