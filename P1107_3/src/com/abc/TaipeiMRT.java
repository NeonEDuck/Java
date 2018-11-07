package com.abc;

public class TaipeiMRT{
    //============================================
    // 成員
    //============================================    
    private int id;
    private String name;    
    private String line;
    private double lat;
    private double lng;

    //============================================
    // 建構元(1) 傳5個參數
    //============================================

    public TaipeiMRT(String[] items) {
        id = Integer.parseInt(items[0].trim());
        name = items[1].trim();
        line = items[2].trim();
        lat = Double.parseDouble(items[3].trim());
        lng = Double.parseDouble(items[4].trim());
    }

    //============================================
    // 建構元(2) 傳0個參數
    //============================================
    public TaipeiMRT() {
        id = 0;
        name = null;
        line = null;
        lat = 0.0;
        lng = 0.0;
    }


    //============================================
    // getters
    //============================================
    public int getId() {return id;}
    public String getName() {return name;}
    public String getLine() {return line;}
    public double getLat() {return lat;}
    public double getLng() {return lng;}

    //============================================
    // setters
    //============================================
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setLine(String line) {this.line = line;}
    public void setLat(double lat) {this.lat = lat;}
    public void setLng(double lng) {this.lng = lng;}

    //============================================
    // 計算捷運站到某個地點的距離(公里)
    // 傳入參數:
    // (1) toLat, 目的地緯度
    // (2) toLng, 目的地經度
    //============================================
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

    //============================================
    // 計算捷運站到某個地點的步行時間(分鐘)
    // 傳入參數:
    // (1) toLat, 目的地緯度
    // (2) toLng, 目的地經度            
    //============================================  
    public int minutes(double toLat, double toLng){
        return (int)Math.floor(distance(toLat, toLng) / 4 * 60);
    }  

    //============================================
    // 計算捷運站到某個地點的某交通工具時間(分鐘)
    // 傳入參數:
    // (1) toLat, 目的地緯度
    // (2) toLng, 目的地經度     
    // (3) type, 交通工具
    //============================================  
    public int minutes(double toLat, double toLng, String type){
        if (type.equals("UBike")) {
            return (int)Math.floor(distance(toLat, toLng) / 8 * 60);
        }
        else if (type.equals("Taxi")) {
            return (int)Math.floor(distance(toLat, toLng) / 40 * 60);
        }
        return -999;
    }             
}         