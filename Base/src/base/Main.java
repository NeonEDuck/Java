package base;

import java.io.*;
//import com.abc.;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        boolean fl = true;
        try {
            br = new BufferedReader(new FileReader(new File("in.txt")));
            bw = new BufferedWriter(new FileWriter(new File("out.txt")));
            //
            String line;
            while ((line = br.readLine()) != null) {
                String items[] = line.split(",");
                //<Class> <name> = new <name>(items);
                // = new ();
                
                String data = "";
                
                
                
                if (fl == false) {
                    bw.write("\n");
                }
                else {
                    fl = false;
                }
                bw.write(data);
            }
        }
        catch (IOException e) {
            System.out.println("Error: IOException(" + e + ")");
        }
        finally {
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.close();
            }
        }
    }
}
