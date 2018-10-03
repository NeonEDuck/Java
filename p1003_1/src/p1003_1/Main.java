package p1003_1;
import java.io.*;

class Main {
    public static void main(String[] args) {
        //(1) 宣告輸入及輸出變數     
        BufferedReader br = null;
        BufferedWriter bw = null;   
        //------------------------------------------
        try{
            //(2) 建立一個檔案讀取及寫出物件      
            br = new BufferedReader(new FileReader(new File("scores.txt")));   
            bw = new BufferedWriter(new FileWriter(new File("out.txt")));        

            //(3) 逐行讀入檔案內容
            //---------------------
            String line; 
            boolean firstLine = true;                
            
            while ((line = br.readLine()) != null) {            
                //顯示讀入內容          
                System.out.println(line);

                //將內容寫出檔案
                if(firstLine){
                    bw.write(line);
                    firstLine=false;
                }else{
                    bw.write(("\n"));
                    bw.write(line);                
                }  
            } 
            //---------------------
        }catch(IOException e){
            System.out.println("發生錯誤, 原因: " + e);
            return;           
        }finally{
            try {
                //(4-1) 關閉reader
                if(br != null){
                    br.close(); 
                } 

                //(4-2) 關閉writer, 強制輸出未寫出的暫存內容
                if(bw != null){
                    bw.close(); 
                }
            }
            catch (IOException e) {
                System.out.println("Fail to close the file.");
            }
        }
    }
} 