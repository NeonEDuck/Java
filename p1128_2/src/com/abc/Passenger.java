package com.abc;

public class Passenger {
    //===================== 
    // 成員
    //=====================          
    private int num;
    private int rank;
    private int survived;
    private String firstName;
    private String lastName;
    private String gender;
    private String boarding;
    
    //=====================  
    // 建構元(1) 傳7個參數
    //===================== 
    public Passenger(String items[]){
        this.num = Integer.parseInt(items[0].trim());
        this.rank = Integer.parseInt(items[1].trim());
        this.survived = Integer.parseInt(items[2].trim());
        this.firstName = items[3].trim();
        this.lastName = items[4].trim();
        this.gender = items[5].trim();
        this.boarding = items[12].trim();
    }

    //=====================  
    // 建構元(1) 傳7個參數
    //===================== 
    public Passenger(int num, int rank, int survived, String firstName, String lastName, String gender, String boarding){
        this.num = num;
        this.rank = rank;
        this.survived = survived;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.boarding = boarding;
    }

    //=====================  
    // 建構元(2) 傳0個參數
    //=====================
    public Passenger(){}

    //=====================  
    // getters
    //===================== 
    public int getNum() {return num;}
    public int getRank() {return rank;}
    public int getSurvived() {return survived;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getGender() {return gender;}
    public String getBoarding() {return boarding;}

    //=====================  
    // setters
    //=====================  
    public void setNum(int num) {this.num = num;}
    public void setRank(int rank) {this.rank = rank;}
    public void setSurvived(int survived) {this.survived = survived;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setGender(String gender) {this.gender = gender;}
    public void setBoarding(String boarding) {this.boarding = boarding;}
}