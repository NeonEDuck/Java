package p1003_2;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        //(1) 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        //------------------------------------------      
        try{   
            //(2) 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("exam.csv"))); 
            bw = new BufferedWriter(new FileWriter(new File("out.csv")));
            
            //(3) 逐行讀入檔案內容
            //--------------------- 
            boolean firstLine = true;            
            String line;
            int cnt = 0;
            while ((line = br.readLine()) != null) {            
                System.out.println(line);
                
                //切割欄位內容
                String items[] = line.split(",");
                
                String stuNo = items[0].trim();
                String name = items[1].trim();
                String gender = items[2].trim();
                int chi = Integer.parseInt(items[3].trim());
                int eng = Integer.parseInt(items[4].trim());
                int sat = Integer.parseInt(items[5].trim());
                int com = Integer.parseInt(items[6].trim());
                
                int sum = chi + eng + sat + com;
                
                if (gender.equals("M")) {
                    //顯示欄位內容
                    System.out.println(stuNo);
                    System.out.println(name);
                    System.out.println(gender);
                    System.out.println(chi);
                    System.out.println(eng);
                    System.out.println(sat);
                    System.out.println(com);
                    System.out.println(sum);
                    System.out.println("-------------------------");   

                    //將內容寫出檔案
                    String data = stuNo + "," + name + "," + gender + "," + chi + "," + eng + "," + sat + "," + com;
                    
                    cnt++;
                    
                    if(firstLine){
                        bw.write(data);
                        firstLine=false;
                    }else{
                        bw.write(("\n"));
                        bw.write(data);                
                    }                
                }
            }    
            System.out.println("------------------");
            System.out.println("count:" + cnt);
            
            //---------------------            
        }catch(IOException e){
            System.out.println("發生錯誤, 原因: " + e);                     
            return;
        }finally{
            //(4) 關閉reader
            if(br != null){
                br.close();              
            }  
            
            //(4) 關閉writer
            if(bw != null){
                bw.close();              
            }              
        }  
        //------------------------------------------         
    }    
}