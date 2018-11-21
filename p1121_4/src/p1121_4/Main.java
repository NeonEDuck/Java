package p1121_4;
import java.util.List;
import java.util.ArrayList;
import com.abc.Utility;

public class Main {
    public static void main(String[] args) {    
        double stat[][] = {{1.75, 1.63, 1.78, 1.63, 1.56}, {78, 50, 51, 77, 43}};
        
        for (int i = 0; i < 5; i++) {
            System.out.println(Utility.bmi(stat[0][i], stat[1][i]));
            System.out.println(Utility.evaluation(stat[0][i], stat[1][i]));
        }
    }
}
