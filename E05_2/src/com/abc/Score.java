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
        double tot = chi + eng + stat + comp;
        return tot;
    }
    public double avg() {
        double avg = total() / 4;
        return avg;
    }
    public int rank() {
        int tot = idvRank(chi) + idvRank(eng) + idvRank(stat) +  idvRank(comp);
        return tot;
    }
    private int idvRank(int sc) {
        if (sc >= 90) {
            return 5;
        }
        else if (sc >= 80) {
            return 4;
        }
        else if (sc >= 70) {
            return 3;
        }
        else if (sc >= 60) {
            return 2;
        }
        return 1;
    }
}