package p1031_3;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        //----------------------------------------------    
        // 宣告一個存放String的list,
        // 這個list的實際結構是ArrayList
        //
        // 若將ArrayList和LinkedList比較,          
        // ArrayList的查詢速度較快, 新增/刪除的速度較慢    
        //----------------------------------------------        
        List<String> list = new LinkedList();
        
        //----------------------------------------------  
        // 將String物件加入list中
        //----------------------------------------------      
        list.add("資料1");
        list.add("資料2");
        list.add("資料3");
        list.add("資料4");
        list.add("資料5");
        list.remove("資料2");

        //----------------------------------------------      
        // 依序取出list的元素個數
        //---------------------------------------------- 
        System.out.println("list長度:" + list.size());
        
        //----------------------------------------------      
        // 依序取出list中的字串
        //----------------------------------------------         
        for(String s : list){
            System.out.println(s);
        }
    }    
}