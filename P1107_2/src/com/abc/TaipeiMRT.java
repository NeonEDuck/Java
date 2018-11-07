package com.abc;

public class TaipeiMRT{
    //=================================  
    // 成員
    //=================================       
    public int id;
    public String name;    
    public String line;
    public double lat;
    public double lng;            

    //=================================   
    // 建構元(1) 傳5個參數
    //=================================   
    public TaipeiMRT(String[] items) {
        id = Integer.parseInt(items[0].trim());
        name = items[1].trim();
        line = items[2].trim();
        lat = Double.parseDouble(items[3].trim());
        lng = Double.parseDouble(items[4].trim());
    }


    //=================================  
    // 建構元(2) 傳0個參數
    //=================================  
    public TaipeiMRT() {
        id = 0;
        name = null;
        line = null;
        lat = 0.0;
        lng = 0.0;
    }


    //=================================
    // 計算捷運站到某個地點的距離(公里)
    // 傳入參數:
    // (1) toLat, 目的地緯度
    // (2) toLng, 目的地經度
    //=================================    
    public double distance(double toLat, double toLng){
        final int R = 6371; 

        double latDistance = Math.toRadians(toLat - this.lat);
        double lngDistance = Math.toRadians(toLng - this.lng);

        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                   + Math.cos(Math.toRadians(toLat)) * Math.cos(Math.toRadians(this.lat))
                   * Math.sin(lngDistance / 2) * Math.sin(lngDistance / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double d = R * c; 
        return d;
    }
}