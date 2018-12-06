package p1206_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.abc.Income;
import com.abc.SalesIncome;
import com.abc.LaborIncome;

public class Main {
    public static void main(String[] args) {
        //----------------------------
        // 儲存收入資料的List
        //----------------------------      
        List<Income> list = new ArrayList();
        
        //----------------------------
        // 設定日期格式
        //----------------------------
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");  
          
        //----------------------------
        // 加入幾筆銷貨收入記錄
        //----------------------------      
        list.add(new SalesIncome(LocalDate.parse("2018-11-18", formatter), "新源貿易公司", 1500000, 75000));
        list.add(new SalesIncome(LocalDate.parse("2018-11-19", formatter), "正旭貿易公司", 2154000, 186000));
        list.add(new SalesIncome(LocalDate.parse("2018-11-20", formatter), "騰躍貿易公司", 925000, 41500)); 
        
        //----------------------------
        // 加入幾筆勞務收入記錄
        //----------------------------      
        list.add(new LaborIncome(LocalDate.parse("2018-11-20", formatter), "本新公司", 3));
        list.add(new LaborIncome(LocalDate.parse("2018-11-21", formatter), "全松公司", 2));
        list.add(new LaborIncome(LocalDate.parse("2018-11-22", formatter), "日晉公司", 1)); 
        
        //----------------------------
        // 呼叫方法印出資料
        //----------------------------       
        printInfo(list);
    }    
    
    //=============================
    // 印出資料的方法
    //=============================
    public static void printInfo(List<Income> list){
        list.forEach(data  -> {
            System.out.println(data.category());
            System.out.println(data.detail());
            System.out.println(data.total());
            System.out.println("----------");
        });         
    }
    //=============================    
}