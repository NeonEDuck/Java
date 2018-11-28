package p1128_1;

import java.util.List;
import java.util.ArrayList;
import com.abc.Score;
import com.abc.Utility;

class Main {
    public static void main(String[] args) throws Exception{
        //========================================================
        // 呼叫靜態方法讀入的資料, 存在list中
        //========================================================
        List<String> lines = Utility.readData("exams.csv");
        
        // 存放待處理物件的List
        List<Score> data = new ArrayList();
        
        // 存放將寫出的資料
        List<String> output = new ArrayList();
        //========================================================        

        //-------------------------------------------
        // 判斷回傳結果
        //-------------------------------------------        
        if(lines==null || lines.isEmpty()){
            System.out.println("找不到檔案, 或檔案中沒有資料");
            return;
        }
        
        //-------------------------------------------
        // 逐筆處理讀入的字串
        //-------------------------------------------
        lines.forEach(line -> {
            // 顯示目前處理的資料
            System.out.println(line);
            
            //切割欄位            
            String items[] = line.split(",");
                
            String stuNo = items[0].trim();
            String stuName = items[1].trim();
            int chi = Integer.parseInt(items[2].trim());
            int eng = Integer.parseInt(items[3].trim());                
            int stat = Integer.parseInt(items[4].trim());
            int comp = Integer.parseInt(items[5].trim());    
            
            // 產生成績物件, 加入data中
            data.add(new Score(stuNo, stuName, chi, eng, stat, comp));                       
        });  
        
        //-------------------------------------------
        // 符合條件者, 加入output中 
        //-------------------------------------------
        data.forEach(s -> {
            if(s.getChi() >= 80){
                String str = s.getStuNo() + "," + s.getStuName() + "," + s.total(); 
                output.add(str);              
            }   
        });
        
        //========================================================
        // 呼叫靜態方法, 將output內資料寫到檔案中
        //========================================================       
        boolean flag = Utility.writeData("out.csv", output);
        
        if(flag){
            System.out.println("寫檔成功");
        }else{
            System.out.println("寫檔失敗");
        }
        //========================================================        
    }    
}