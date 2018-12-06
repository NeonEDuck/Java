package p1206_2;

import com.abc.Expense;
import com.abc.Salary;
import com.abc.Material;
import java.awt.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String s[] = {"2018/11/22,王小明,A,10", "2018/11/22,陳小華,B,12", "2018/11/22,張小文,C,15"};
        
        String m[] = {"2018/11/20,可可豆,1350,10", "2018/11/21,咖啡豆,1565,12", "2018/11/22,奶油,695,15"};
        
        ArrayList<Expense> e = new ArrayList();
        
        for (int i = 0; i < s.length; i++) {
            e.add(new Salary(s[i].split(",")));
        }
        for (int i = 0; i < m.length; i++) {
            e.add(new Material(m[i].split(",")));
        }
        
        e.forEach(l -> {
            System.out.println(l.detail());
            System.out.println(l.total());
        });
    }
    
}
