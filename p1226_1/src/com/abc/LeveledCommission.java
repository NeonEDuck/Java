package com.abc;

//==============================
// [績效傭金類別]繼承了[傭金類別]
// 也將完成父親所有的抽象方法
//==============================
public class LeveledCommission extends Commission{
    //=====================    
    // 成員
    //=====================  
    private int quota;   //達標金額
    
    //=====================    
    // 建構元(1)
    //=====================    
    public LeveledCommission(String name, int performance, int quota){
        super(name, performance);
        this.quota = quota;
    }

    //=====================    
    // 建構元(2)    
    //=====================  
    public LeveledCommission(){
        //自行完成
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
    // 完成父親的抽象方法    
    //=====================     
   /*
   若(業績 >= 達標金額), 傭金 = 業績 * 0.125,   
   否則, 傭金 = 業績 * 0.12 - (達標金額 - 業績) * 0.03.
   */
    @Override
    public int commission(){
        int fin = 0;
        int per = getPerformance();
        if (per >= quota) {
            fin = (int)Math.ceil(per * 0.125);
        }
        else {
            fin = (int)Math.ceil(per * 0.12 - (quota - per) * 0.03);
        }
        return fin;
    }
    
    //=====================    
    // 改寫父親的方法    
    //=====================      
    @Override
    public String toString(){
        String str = "交付對象:" + getName() + ", 業績:" + getPerformance() + "元, 達標金額:" + quota + " 元, 傭金:" + commission() + "元";
        return str;
    }
    //=====================      
}