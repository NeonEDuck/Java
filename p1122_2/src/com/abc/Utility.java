package com.abc;
	
public class Utility {
    //======================== 
    // 靜態方法-計算成績
    // 傳入學生答案
    // 回傳成績
    //=====================          
    public static int score(String answer){
        String a = "ABBDACCDACBCDADAABCD";
        int score = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (a.charAt(i) == answer.charAt(i)) {
                score += 5;
            }
        }
        return score;
    }

    //======================== 
    // 靜態方法-計算配分成績
    // 傳入學生答案
    // 回傳成績
    //=====================          
    public static int weightedScore(String answer){
        String a = "ABBDACCDACBCDADAABCD";
        int score = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (a.charAt(i) == answer.charAt(i)) {
                if (i < 10) {
                    score += 4;
                }
                else {
                    score += 6;
                }
            }
        }
        return score;
    }
    
    public static String remark(String answer){
        String a = "ABBDACCDACBCDADAABCD";
        String st = "";
        int score = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (a.charAt(i) == answer.charAt(i)) {
                st = st + ".";
            }
            else {
                st = st + "*";
            }
        }
        return st;
    }
}