package p1226_1;

import com.abc.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Commission> list = new ArrayList();

        // 加入幾個[一般傭金類別]物件
        list.add(new RegularCommission("黃宜勻", 200055));
        list.add(new RegularCommission("陳霈蓁", 350500));
        list.add(new RegularCommission("賴孟穎", 180065));
        list.add(new RegularCommission("沈家佑", 415645));    

        // 加入幾個[績效傭金類別]物件
        list.add(new LeveledCommission("黃宜勻", 200055, 180000));
        list.add(new LeveledCommission("陳霈蓁", 350500, 360000));
        list.add(new LeveledCommission("賴孟穎", 180065, 200000));
        list.add(new LeveledCommission("沈家佑", 415645, 350000));    
        
        // 加入幾個[累進傭金類別]物件
        list.add(new AccumulatedCommission("黃宜勻", 200055, 180000, 0.145));
        list.add(new AccumulatedCommission("陳霈蓁", 350500, 360000, 0.155));
        list.add(new AccumulatedCommission("賴孟穎", 180065, 200000, 0.138));
        list.add(new AccumulatedCommission("沈家佑", 415645, 350000, 0.135));            
        
        // 依序印出list內容
        list.forEach(s -> {
            System.out.println(s.toString());
        });
    }   
}