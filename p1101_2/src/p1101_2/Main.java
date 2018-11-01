package p1101_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.abc.Score;

class Main {    
    public static void main(String[] args) throws IOException {
        //-------------------------------------------------
        // 宣告一個data儲存所有成績物件
        //-------------------------------------------------      
        List<Score> data = new ArrayList<>();
       
        // 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;        
   
        try{   
            // 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("exams.csv"))); 
            bw = new BufferedWriter(new FileWriter(new File("out.csv")));            
      
            // 逐行讀入檔案內容, 加入list中          
            String line;                 
            
            while ((line = br.readLine()) != null) {    
                // 顯示輸入資料
                System.out.println(line);  
                
                // 切割欄位內容
                String items[] = line.split(",");
                
                String stuNo = items[0].trim();
                String stuName = items[1].trim();
                String gender = items[2].trim();
                int chi = Integer.parseInt(items[3].trim());
                int eng = Integer.parseInt(items[4].trim());                
                int stat = Integer.parseInt(items[5].trim());
                int comp = Integer.parseInt(items[6].trim());                
               
                // 產生一個成績物件並將資料透過建構元放入其中
                Score score = new Score(stuNo, stuName, gender, chi, eng, stat, comp);
                
                // 將成績物件加入data中
                data.add(score);                                 
            }                                                    
            
            //-------------------------------------------------
            // 從data計算國文成績的平均成績及標準差(篩選條件)
            //-------------------------------------------------
            double totChi = 0;
            double avgChi;
            
            for(Score s : data){
                totChi += s.getChi();
            }            
            
            avgChi = totChi / data.size();    
            
            double totEng = 0;
            double avgEng;
            
            for(Score s : data){
                totEng += s.getEng();
            }            
            
            avgEng = totEng / data.size();  
            
            double totStat = 0;
            double avgStat;
            
            for(Score s : data){
                totStat += s.getStat();
            }            
            
            avgStat = totStat / data.size();       
            
            double totComp = 0;
            double avgComp;
            
            for(Score s : data){
                totComp += s.getComp();
            }            
            
            avgComp = totComp / data.size();   
            
            //-------------------------------------------------          
            // 符合條件(國文>=平均成績+1倍標準差)的資料輸出
            //-------------------------------------------------
            boolean firstLine = true;                 
            
            for(Score s : data){               
                if(s.getChi() >= avgChi && s.getEng() >= avgEng && s.getStat() >= avgStat && s.getComp() >= avgComp){
                    String str = s.getStuNo() + "," + s.getStuName() + "," + s.getGender() + "," + s.getChi() + "," + s.getEng() + "," + s.getStat() + "," + s.getComp() + "," + s.total();
                
                    if(firstLine){
                        bw.write(str);
                        firstLine=false;
                    }else{
                        bw.write(("\n"));
                        bw.write(str);                
                    }                        
                }   
            }
            //-------------------------------------------------          
        }catch(IOException e){
            System.out.println("發生錯誤, 原因: " + e);                     
            return;
        }finally{
            // 關閉reader
            if(br != null){
                br.close();              
            }  
            
            // 關閉writer
            if(bw != null){
                bw.close();              
            }              
        }       
    }    
}