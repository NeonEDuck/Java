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
    public int mat;
    public int soc;
    public int sci;
    public int wod;
    
    //方法
    //=====================     
    public Score(String[] args) {
            stuNo = args[0];
            gender = args[1];       
            chi = Integer.parseInt(args[2]);
            eng = Integer.parseInt(args[3]);
            mat = Integer.parseInt(args[4]);
            soc = Integer.parseInt(args[5]);   
            sci = Integer.parseInt(args[6]);   
            wod = Integer.parseInt(args[7]);   
    }
    
    public int total() {
        int tot = chi + eng + mat + soc + sci + wod;
        return tot;
    }
}