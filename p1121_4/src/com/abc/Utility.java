package com.abc;

public class Utility {
    //===================== 
    // 靜態方法-計算
    // 傳入身高及體重, 
    // 回傳bmi值
    //=====================          
    public static double bmi(double height, double weight){
        return weight / (height * height);
    }

    //===================== 
    // 靜態方法(2)
    // 傳入身高及體重, 
    // 回傳bmi評語
    //===================== 
    public static String evaluation(double height, double weight){
        double bmi = bmi(height, weight);
        if (bmi >= 27) {
            return "肥胖";
        }
        else if (bmi >= 24) {
            return "過重";
        }
        else if (bmi >=18.5) {
            return "正常體重";
        }
        return "過輕";
    }  
}   