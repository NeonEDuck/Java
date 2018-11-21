package p1121;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //-----------------------------------
        // 生成一個List物件, 
        // 其中放置的均為Double型態的物件.
        //-----------------------------------        
        List<Double> list = new ArrayList();
        Double od = 170.5;
        System.out.println(od);
        double m = od;
        System.out.println(m);
        //-----------------------------------
        // 將double資料存入Double物件內, 
        // 稱為boxing.
        //-----------------------------------         
        list.add(33.5);
        list.add(28.3);
        list.add(32.3);
        list.add(40.1);
        list.add(30.8);
        
        //-----------------------------------
        // 用lambda表示式生成一個函式, 
        // 處理list中的每個元素.
        //-----------------------------------
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        for (Double k : list) {
            System.out.println(k);
        }
        
        list.forEach(
            d -> {
                System.out.println(d);
            }
        );
        //-----------------------------------        
    }    
}