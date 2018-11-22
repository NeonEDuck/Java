package p1122_3;
import java.util.List;
import java.util.ArrayList;
import com.abc.Utility;

public class Main {
    public static void main(String[] args) {
        //---------------------------
        // 產生測試資料
        //---------------------------        
        List<Integer> list = new ArrayList();

        list.add(10);
        list.add(15);
        list.add(20);
        list.add(35);
        list.add(40);
        list.add(45);
        list.add(55);
        list.add(75);
        list.add(85);
        list.add(90);

        //--------------------------------------------- 
        // 呼叫靜態方法反轉順序                
        //---------------------------------------------  
        List<Integer> result = Utility.reverse(list);

        //--------------------------------------------- 
        // 用lambda方法逐一印出result內容                
        //--------------------------------------------- 
        //內容自行完成  

        result.forEach(i -> {
            System.out.println(i);
        });
    }    
}