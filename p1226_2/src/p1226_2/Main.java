package p1226_2;

import java.util.ArrayList;
import java.util.List;

import com.abc.*;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Shipment> list = new ArrayList();

        // 加入幾個[一般貨運]物件
        list.add(new GeneralShipment(2.4, 1, "台中", 190));
        list.add(new GeneralShipment(3.6, 2, "台中", 180));
        list.add(new GeneralShipment(4.2, 1, "高雄", 335));
        list.add(new GeneralShipment(6.5, 2, "台南", 235));
        
        // 加入幾個[長途貨運]物件
        list.add(new LongShipment(2.4, 2, "高雄", 300));
        list.add(new LongShipment(2.4, 1, "高雄", 290));
        list.add(new LongShipment(3.6, 2, "屏東", 380));
        list.add(new LongShipment(4.2, 1, "高雄", 335));
        list.add(new LongShipment(6.5, 2, "屏東", 375));
        
        // 依序印出[一般貨運]資料
        for(Shipment s : list){
            System.out.println(s.toString());
        }
    }   
}
