package com.abc;
import java.util.List;
import java.util.ArrayList;
import com.abc.Utility;

public class Utility {
    //===================== 
    // 反轉List內容的順序
    // 傳入List, 
    // 回傳反轉後的List
    //=====================          
    public static List<Integer> reverse(List<Integer> list){
        List<Integer> fl = new ArrayList();
        for (int i = list.size()-1; i >= 0; i--) {
            fl.add(list.get(i));
        }
        return fl;
    }
}    