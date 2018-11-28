package p1128;

import java.util.List;
import java.util.ArrayList;
import com.abc.Utility;
import com.abc.Passenger;

class Main {
    public static void main(String[] args) throws Exception{
        //========================================================
        // 呼叫靜態方法讀入的資料, 存在list中
        //========================================================
        List<String> lines = Utility.readData("titanic.csv");
        
        // 存放待處理物件的List
        List<Passenger> data = new ArrayList();
        
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
            
            // 產生成績物件, 加入data中
            data.add(new Passenger(items));                       
        });  
        
        //-------------------------------------------
        // 符合條件者, 加入output中 
        //-------------------------------------------
        
        int stat[] = {0, 0, 0, 0, 0, 0, 0};
        
        for (int i = 0; i < data.size(); i++) {
            Passenger s = data.get(i);
            if(s.getSurvived() == 1 && s.getGender().equals("female")){
                String str = s.getNum() + "," + s.getRank() + "," + s.getSurvived() + "," + s.getFirstName() + "," + s.getLastName() + "," + s.getGender() + "," + s.getBoarding(); 
                output.add(str);              
            }   
            if(s.getSurvived() == 1){
                if (s.getGender().equals("female")) {
                    stat[0]++;
                }
                if (s.getBoarding().equals("C")) {
                    stat[1]++;
                }
                if (s.getBoarding().equals("Q")) {
                    stat[2]++;
                }
                if (s.getBoarding().equals("S")) {
                    stat[3]++;
                }
                if (s.getRank() == 1) {
                    stat[4]++;
                }
                if (s.getRank() == 2) {
                    stat[5]++;
                }
                if (s.getRank() == 3) {
                    stat[6]++;
                }
            }
        }
        for (int i = 0; i < stat.length; i++) {
            double persent = (double)stat[i] / data.size();
            String text = "\n" + stat[i] + "," + Utility.round(persent, 2);
            output.add(text);
        }
        
        
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