package e05_2;

import java.io.*;
import com.abc.Score;

class Main {
    public static void main(String[] args) throws IOException {
        //(1) 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        //------------------------------------------      
        try{   
            //(2) 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("exams.csv"))); 
            bw = new BufferedWriter(new FileWriter(new File("out.csv")));
            
            //(3) 逐行讀入檔案內容
            //--------------------- 
            boolean firstLine = true;            
            String line;     
            
            while ((line = br.readLine()) != null) {                           
                //切割欄位內容
                String items[] = line.split(",");     
                Score score = new Score(items);      
                
                
                //顯示物件中的資料
                System.out.println(line);                
                System.out.println(score.stuNo);
                System.out.println(score.stuName);
                System.out.println(score.gender);
                System.out.println(score.chi);
                System.out.println(score.rank());
                
                System.out.println("-------------------------");   
                
                //將物件內容寫至檔案
                String data = score.stuNo + "," + score.stuName + "," + score.gender + "," + score.chi + "," + score.eng + "," + score.stat + "," + score.comp + "," + score.total() + "," +  score.avg() +  "," +  score.rank();
                
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