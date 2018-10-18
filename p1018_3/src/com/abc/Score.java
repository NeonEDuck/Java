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
    
    
    public Score() {
        stuNo = null;
        stuName = null;
        gender = null;
        chi = 0;
        eng = 0;
        stat = 0;
        comp = 0;
    }
    
    public Score(String[] args) {
        stuNo = args[0];
        stuName = args[1];
        gender = args[2];                
        chi = Integer.parseInt(args[3]);
        eng = Integer.parseInt(args[4]);
        stat = Integer.parseInt(args[5]);
        comp = Integer.parseInt(args[6]);   
    }
    
    public Score(String stuNo, String stuName, String gender, int chi, int eng, int stat, int comp) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.gender = gender;
        this.chi = chi;
        this.eng = eng;
        this.stat = stat;
        this.comp = comp;
    }
    
    
    //方法
    //===================== 
    public double total() {
        double tot = chi * 2 + eng * 2 + stat * 1.5 + comp * 2.5;
        return tot;
    }
    
    public double avg() {
        double avg = total() / 8;
        return avg;
    }
    
    public int rank() {
        return idvRank(chi) + idvRank(eng) + idvRank(stat) + idvRank(comp);
    }
    
    private int idvRank(int sc) {
        int r = 0;
        
        if (sc >= 90) {
            r = 5;
        }
        else if (sc >= 80) {
            r = 4;
        }
        else if (sc >= 70) {
            r = 3;
        }
        else if (sc >= 60) {
            r = 2;
        }
        else {
            r = 1;
        }
        
        return r;
    }
}