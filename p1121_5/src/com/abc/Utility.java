package com.abc;
public class Utility {
    //======================== 
    // 靜態方法-密碼安全檢查
    // 傳入密碼, 
    // 回傳密碼安全評語
    //========================         
    public static String checkPassword(String pwd){
        int eng = 0;
        int lc = 0;
        int uc = 0;
        int num = 0;
        for (int i = 0; i < pwd.length(); i++) {
            char c = pwd.charAt(i);
            if (Character.isAlphabetic(c)) {
                eng++;
                if (Character.isLowerCase(c)) {
                    lc++;
                }
                else {
                    uc++;
                }
            }
            if (Character.isDigit(c)) {
                num++;
            }
        }
        
        
        if (pwd.length() < 6 || (eng == pwd.length() || num == pwd.length() || (lc == eng || uc == eng))) {
            return "不安全";
        }
        return "安全";
    }
}