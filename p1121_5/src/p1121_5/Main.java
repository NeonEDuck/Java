package p1121_5;

import com.abc.Utility;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Utility.checkPassword("abcab"));
        System.out.println(Utility.checkPassword("12312"));
        System.out.println(Utility.checkPassword("123123123"));
        System.out.println(Utility.checkPassword("123abc123abc"));
        System.out.println(Utility.checkPassword("123abc123ABC"));
    }
    
}
