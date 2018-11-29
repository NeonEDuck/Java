package p1129_1;

import java.util.List;
import java.util.ArrayList;
import com.abc.Utility;
import com.abc.Hostel;

class Main {
    public static void main(String[] args) throws Exception{
        //========================================================
        // 呼叫靜態方法讀入的資料, 存在list中
        //========================================================
        List<String> lines = Utility.readData("hostel.csv");
        
        // 存放待處理物件的List
        List<Hostel> data = new ArrayList();
        
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
            data.add(new Hostel(items));                       
        });  
        
        //-------------------------------------------
        // 符合條件者, 加入output中 
        //-------------------------------------------
        
        int stat[] = {0, 0, 0, 0, 0};
        int c = 0;
        
        for (int i = 0; i < data.size(); i++) {
            Hostel s = data.get(i);
            String block = Utility.district(s.getAddress());
            if (block.equals("萬里區") || block.equals("三芝區") || block.equals("貢寮區")) {
                String line = s.getId() + "," + s.getName() + "," + s.getTel() + "," + s.getFax() + "," + s.getAddress() + "," + s.getLat() + "," + s.getLng() + "," + s.getRegularPrice() + "," + s.getHolidayPrice() + "," + s.getRoom();
                output.add(line);
                c++;
            }
            if (s.getHolidayPrice() >= 8000) {
                stat[0]++;
            }
            else if (s.getHolidayPrice() >= 6000) {
                stat[1]++;
            }
            else if (s.getHolidayPrice() >= 4000) {
                stat[2]++;
            }
            else if (s.getHolidayPrice() >= 2000) {
                stat[3]++;
            }
            else {
                stat[4]++;
            }
            System.out.println(Utility.district(s.getAddress()));
        }
        output.add(c + "");
        int sum = 0;
        for (int i : stat) {
            double persant = (double)i / data.size();
            System.out.println("共" + i + "筆," + Utility.round(persant, 2)); 
            sum += i; 
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