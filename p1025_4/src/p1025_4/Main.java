package p1025_4;

import java.io.*;
import com.abc.Logs;

class Main {
    public static void main(String[] args) throws IOException {
        //(1) 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        //------------------------------------------      
        try{   
            //(2) 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("phoneLogs.csv"))); 
            bw = new BufferedWriter(new FileWriter(new File("out.csv")));
            
            //(3) 逐行讀入檔案內容
            //--------------------- 
            boolean firstLine = true;            
            String line;     
            while ((line = br.readLine()) != null) {                           
                //切割欄位內容
                String items[] = line.split(",");     
                Logs log = new Logs(items);
                
                //將物件內容寫至檔案
                String data =  log.getSerNo() + "," + log.getStart() + "," + log.getEnd() + "," + log.fee();
                
                System.out.println(data);
                
                if(firstLine){
                    bw.write(data);
                    firstLine=false;
                }else{
                    bw.write(("\n"));
                    bw.write(data);                
                }                
            }                   
            //---------------------            
        }catch(IOException e){
            System.out.println("發生錯誤, 原因: " + e);                     
            return;
        }finally{
            //(4) 關閉reader
            if(br != null){
                br.close();              
            }  
            
            //(4) 關閉writer
            if(bw != null){
                bw.close();              
            }              
        }  
        //------------------------------------------         
    }    
}