package p1220_2;

import com.abc.LongShipment;
import java.util.ArrayList;
import java.util.List;

import com.abc.Shipment;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Shipment> list = new ArrayList();

        // 加入幾個[運輸]物件
        list.add(new Shipment(2.4, 1, "台中", 170));
        list.add(new Shipment(2.4, 1, "台中", 180));
        list.add(new Shipment(3.5, 1, "高雄", 310));
        list.add(new Shipment(3.5, 1, "高雄", 295));
        list.add(new Shipment(6.5, 2, "台南", 240));
        // 加入幾個[長途運輸]物件
        list.add(new LongShipment(2.4, 1, "台中", 190));
        list.add(new LongShipment(3.6, 2, "台中", 180));
        list.add(new LongShipment(4.2, 1, "高雄", 335));
        list.add(new LongShipment(6.5, 2, "台南", 235));
        
        // 依序印出[運輸]資料
        list.forEach(s ->{
            System.out.println(s.toString());
        });
    }   
}