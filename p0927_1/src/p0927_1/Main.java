package p0927_1;
import java.io.*;
import java.lang.Math;


class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(new File("mashroom.txt")));
        BufferedWriter bw = new BufferedWriter( new FileWriter(new File("out.txt")));
  
        String line; 
        boolean firstLine = true;
        int tot = 0;
        int ecnt = 0;
        int bcnt[] = {0,0};
        int ccnt[] = {0,0};
        
        while ((line = br.readLine()) != null) {            
            //顯示讀入內容          
            System.out.println(line);
            String edible = line.substring(0, 1);
            String type = line.substring(1, 2);
            tot++;
            if (edible.equals("e")) {
                ecnt++;
                if(firstLine){
                    bw.write(line);
                    firstLine=false;
                }else{
                    bw.write(("\n"));
                    bw.write(line);                
                }
            }
            if (type.equals("b")) {
                bcnt[0]++;
                if (edible.equals("e")) {
                    bcnt[1]++;
                }
            }
            else if (type.equals("c")) {
                ccnt[0]++;
                if (edible.equals("e")) {
                    ccnt[1]++;
                }
            }
        }
        bw.write(("\n"));
        bw.write("共" + tot + "筆");
        bw.write(("\n"));
        bw.write("可食" + ecnt + "筆");
        bw.write(("\n"));
        bw.write("可食用比例" + Math.round(((double)ecnt / tot)*100) + "%");
        bw.write(("\n"));
        bw.write("鐘型" + bcnt[0] + "筆");
        bw.write(("\n"));
        bw.write("錐型" + ccnt[0] + "筆");
        bw.write(("\n"));
        bw.write("鐘型且可食用" + bcnt[1] + "筆");
        bw.write(("\n"));
        bw.write("錐形且可食用比例" + Math.round(((double)bcnt[1] / bcnt[0])*100) + "%");
        br.close();
        bw.close();      
    }
} 
