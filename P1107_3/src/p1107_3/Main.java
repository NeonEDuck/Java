package p1107_3;
import java.io.*;
import com.abc.TaipeiMRT;

class Main {
    public static void main(String[] args) throws IOException {
        //(1) 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        //------------------------------------------      
        try{   
            //(2) 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("taipeiMRT.csv"))); 
            bw = new BufferedWriter(new FileWriter(new File("out.csv")));
            
            //(3) 逐行讀入檔案內容
            //--------------------- 
            boolean firstLine = true;            
            String line;     
            
            while ((line = br.readLine()) != null) {                           
                //切割欄位內容
                String items[] = line.split(",");     
                TaipeiMRT tm = new TaipeiMRT(items);
                 //=======================================================================  
                // (方法2) 產生成績物件, 並將資料分別存入物件的成員中
                //=======================================================================                
                /*
                Score score = new Score();  
                
                score.stuNo = stuNo;
                */
                
                //將物件內容寫至檔案
                String data = tm.getId() + "," + tm.getName() + "," + tm.getLine() + "," + tm.getLat() + "," + tm.getLng() + "," + tm.minutes(25.043268, 121.525279) + "," + tm.minutes(25.043268, 121.525279,"UBike");
                
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