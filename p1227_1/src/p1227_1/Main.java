package p1227_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;
import com.abc.*;

public class Main {
    public static void main(String[] args) {
        // 設定日期格式      
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        
        // 產生一個List
        List<Rental> list = new ArrayList();

        // 加入幾個[汽車租用]物件        
        list.add(new CarRental("租車", LocalDate.parse("2018-12-20", formatter), LocalDate.parse("2018-12-20", formatter)));
        list.add(new CarRental("租車", LocalDate.parse("2018-12-20", formatter), LocalDate.parse("2018-12-23", formatter)));
        list.add(new CarRental("租車", LocalDate.parse("2018-12-21", formatter), LocalDate.parse("2018-12-31", formatter)));

        // 加入幾個[倉儲租用]物件        
        list.add(new WarehouseRental("倉儲租用類別", LocalDate.parse("2018-12-20", formatter), LocalDate.parse("2019-1-31", formatter), 50));
        list.add(new WarehouseRental("倉儲租用類別", LocalDate.parse("2018-12-20", formatter), LocalDate.parse("2019-2-20", formatter), 60));
        list.add(new WarehouseRental("倉儲租用類別", LocalDate.parse("2018-12-21", formatter), LocalDate.parse("2019-8-31", formatter), 80));
        
        // 加入幾個[人力租用]物件        
        list.add(new LaborRental("人力租用", LocalDate.parse("2018-12-20", formatter), LocalDate.parse("2018-12-31", formatter), 2, 'A', true));
        list.add(new LaborRental("人力租用", LocalDate.parse("2018-12-20", formatter), LocalDate.parse("2019-1-20", formatter), 3, 'B', false));
        list.add(new LaborRental("人力租用", LocalDate.parse("2018-12-21", formatter), LocalDate.parse("2019-2-20", formatter), 4, 'A', true));

        // 加入幾個[設備租用]物件        
        list.add(new EquipmentRental("設備租用", LocalDate.parse("2018-12-21", formatter), LocalDate.parse("2018-12-25", formatter), "3D印表機", 2));
        list.add(new EquipmentRental("設備租用", LocalDate.parse("2018-12-20", formatter), LocalDate.parse("2019-1-10", formatter), "雷射雕刻機", 5));
        list.add(new EquipmentRental("設備租用", LocalDate.parse("2018-12-21", formatter), LocalDate.parse("2019-1-20", formatter), "CNC雕刻機", 10));
        
        // 依序印出[汽車租用]資料
        list.forEach(s -> {
            System.out.println(s.toString());
        });
    }   
}