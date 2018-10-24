package com.abc;

public class Score{
    
    //修飾詞: public(公用), private(私人), protected(保護)
    //===================== 
    //成員
    //=====================     
    private String stuNo;
    private String stuName;    
    private String gender;
    private int chi;
    private int eng;
    private int stat;
    private int comp;
    
    
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
    
    public void setStuNo(String stuNo) {this.stuNo = stuNo;}
    public void setStuName(String stuName) {this.stuName = stuName;}
    public void setGender(String gender) {this.gender = gender;}
    public void setChi(int chi) {this.chi = chi;}
    public void setEng(int eng) {this.eng = eng;}
    public void setStat(int stat) {this.stat = stat;}
    public void setComp(int comp) {this.comp = comp;}
    
    public String getStuNo() {return stuNo;}
    public String getStuName() {return stuName;}
    public String getGender() {return gender;}
    public int getChi() {return chi;}
    public int getEng() {return eng;}
    public int getStat() {return stat;}
    public int getComp() {return comp;}
    
    //方法
    //===================== 
    public double total() {
        double tot = chi * 2 + eng * 2 + stat * 1.5 + comp * 2.5;
        return tot;
    }
    
    public double total(double chiW, double engW, double statW, double compW) {
        double tot = chi * chiW + eng * engW + stat * statW + comp * compW;
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