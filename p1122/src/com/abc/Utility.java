package com.abc;
	
public class Utility {
    //===================== 
    // 磅數轉公斤數
    // 傳入磅數, 
    // 回傳公斤數
    //=====================          
    public static double toKg(double lb){
        return Math.round(lb * 0.45359237 * 100) / 100.0;
    }

    //===================== 
    // 公斤數轉磅數
    // 傳入公斤數, 
    // 回傳磅數
    //=====================          
    public static double toLb(double kg){
        return Math.round(kg / 0.45359237 * 100) / 100.0;
    }
    //===================== 
    // 華氐轉攝氐
    // 傳入華氐溫度, 
    // 回傳攝氐溫度
    //=====================          
    public static double toCelsius(int f){
        return Math.round(((double)f - 32) * 5 / 9 * 10.0)/10.0;
    }

    //===================== 
    // 攝氐轉華氐
    // 傳入攝氐溫度, 
    // 回傳華氐溫度
    //=====================          
    public static double toFahrenheit(int c){
        return Math.round(((double)c * (9/5.0) + 32)*10.0)/10.0;
    }
}