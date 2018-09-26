package test;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        //(1) 建立一個檔案讀取物件
        File file = new File("scores.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        //(2) 逐行讀入檔案內容
        //------------------------------------
        String line;
        int num = 0;
        int gnd[] = {0,0};
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            String sGnd = line.substring(3,4);
            int scrCh = Integer.parseInt(line.substring(4,6));
            int scrEn = Integer.parseInt(line.substring(6,8));
            int scrMt = Integer.parseInt(line.substring(8,10));
            int sum = scrCh + scrEn + scrMt;
            System.out.println(""scrCh);
            System.out.println(scrEn);
            System.out.println(scrMt);
            System.out.println(sum);
            if (sGnd.equals("男")) {
                gnd[0]++;
            }
            else if (sGnd.equals("女")) {
                gnd[1]++;
            }
            num++;
        }

        System.out.println("---------------");
        System.out.println("共 " + num + " 人");
        System.out.println("男生 共 " + gnd[0] + " 人");
        System.out.println("女生 共 " + gnd[1] + " 人");
        //------------------------------------
        
        //(3) 關閉reader
        br.close();         
    }
} 
