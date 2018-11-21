
package com.abc;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Utility{
    //============================================================
    // 從檔案讀入資料, 全部存在List物件中再回傳
    // 傳入: 檔名, String
    // 回傳: 檔案內容, List<String>
    //       失敗時回傳null
    //============================================================
    public static List<String> readData(String fileName) throws Exception{  
        // 存放輸出結果的物件
        List<String> results = new ArrayList();  
        
        //------------------------------------------      
        try{   
            // 建立檔案讀取及寫出物件  
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName))); 
            
            // 逐行讀入檔案內容     
            String line;                 
            
            while ((line = br.readLine()) != null) {               
                // 將讀入資料加入results中
                results.add(line);
            }                              
            
            br.close();                        
        }catch(IOException e){ 
            // 失敗時        
            results = null;                  
        }         
        //------------------------------------------             
        
        // 回傳結果
        return results;
    } 
    

    //============================================================
    // 將List物件寫入檔案, 回傳true表示寫入成功, false表示失敗
    // 傳入: 檔名(String), 待寫資料(List<String>)
    // 回傳: boolean
    //============================================================    
    public static boolean writeData(String fileName, List<String> list) throws Exception{     
        boolean result = true;
        
        //------------------------------------------      
        try{   
            // 建立檔案讀取及寫出物件  
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileName))); 
            
            // 逐行寫出檔案內容  
            boolean firstLine=true;
            
            for(String data : list){
                if(firstLine){
                    bw.write(data);
                    firstLine=false;
                }else{
                    bw.write(("\n"));
                    bw.write(data);                
                }   
            }                            
            
            bw.close();                        
        }catch(IOException e){                
            result = false;                  
        }         
        //------------------------------------------             
        
        // 回傳結果
        return result;
    }     
}