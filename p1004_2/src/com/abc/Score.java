package com.abc;

public class Score{
    
    //修飾詞: public(公用), private(私人), protected(保護)
    //===================== 
    //成員
    //=====================     
    public String stuNo;
    public String stuName;    
    public String gender;
    public int chi;
    public int eng;
    public int stat;
    public int comp;
    
    //方法
    //=====================     
    public Score(String[] args) {
            stuNo = args[0];
            stuName = args[1];
            gender = args[2];                
            chi = Integer.parseInt(args[3]);
            eng = Integer.parseInt(args[4]);
            stat = Integer.parseInt(args[5]);
            comp = Integer.parseInt(args[6]);   
    }
    
    public double total() {
        double tot = chi * 2 + eng * 2 + stat * 1.5 + comp * 2.5;
        return tot;
    }
    public double avg() {
        double avg = total() / 8;
        return avg;
    }
    public String rank() {
        double tot = total();
        if (tot > 500) {
            return "A";
        }
        else if (tot > 400) {
            return "B";
        }
        return "C";
    }
}