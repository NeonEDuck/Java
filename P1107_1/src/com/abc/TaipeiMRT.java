package com.abc;

public class TaipeiMRT{
    //===================== 
    // 成員
    //=====================      
    public int id;
    public String name;    
    public String line;
    public double lat;
    public double lng;            

    public TaipeiMRT(String[] items) {
        id = Integer.parseInt(items[0].trim());
        name = items[1].trim();
        line = items[2].trim();
        lat = Double.parseDouble(items[3].trim());
        lng = Double.parseDouble(items[4].trim());
    }


    //=====================  
    // 備註
    //=====================    
    public String remark(){
        String ex = "";
        if (line.equals("文山內湖線")) {
            ex = "*";
        }
        else if (line.equals("南港、板橋、土城線")) {
            ex = "**";
        }
        return ex;
    }  		 			
}