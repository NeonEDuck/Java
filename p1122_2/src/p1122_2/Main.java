
package p1122_2;

import com.abc.Utility;

public class Main {
    public static void main(String[] args) {
        String stu[] = {
            "ABBBACCDACBCDADAABAC",
            "ABADACDAACBCDADACBCD",
            "ABBAACCDACBCDADAABCD",
            "DBBBACADACBADADDABCD",
            "CBCDACCDACBCDADACBCB",
            "DCBDAACDACBCAADAABCD",
            "ABBDACCDACBCDADAABCD",
            "ABBDACCDAABCDADAABCB",
            "ABBDAACDACACDADCABCD",
            "ABDDABCDACBCDADAABCD"
        };
        
        for (int i = 0; i < 10; i++) {
            System.out.println(Utility.score(stu[i]));
        }
        
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(Utility.weightedScore(stu[i]));
        }
        
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(Utility.remark(stu[i]));
        }
    }
}
