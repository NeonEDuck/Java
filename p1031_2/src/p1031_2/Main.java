package p1031_2;

public class Main {
    public static void main(String[] args) {
        //-----------------------------------------------------    
        // 宣告一個陣列, 名稱是data, 長度為由資料數量決定,
        // 內容為double. 陣列長度不可再更改.   
        //-----------------------------------------------------        
        double data[] = {76, 87, 55, 70, 90, 72, 45, 77, 85, 82, 90, 95, 65, 100, 30, 50, 70, 65};
      
        //----------------------------------------------      
        // 印出陣列長度
        //----------------------------------------------  
        System.out.println("陣列長度:" + data.length);

        //----------------------------------------------      
        // 依序取出data中的元素
        //---------------------------------------------- 
        double tot = 0;
        double avg = 0;
        
        for (double d : data){
            tot += d;
        }
        avg = tot/data.length;
        System.out.println(avg);
        
        
        
        double distot2 = 0;
        
        for (double d : data){
            distot2 += Math.pow(d - avg,2);
        }
        System.out.println(distot2);
        
        
        
        double disavg2 = distot2/(data.length - 1);
        System.out.println(disavg2);
        
        
        
        double disavg = Math.sqrt(disavg2);
        System.out.println(disavg);
    }
}