package com.abc;

public class Iris {
    //===================== 
    //成員
    //=====================      

    private double sepalLength;
    private double sepalWidth;
    private double petalLength;
    private double petalWidth;
    private String species;

    //=====================  
    //建構元(1) 傳5個參數
    //=====================    
    public Iris(String item[]) {
        sepalLength = Double.parseDouble(item[0].trim());
        sepalWidth = Double.parseDouble(item[1].trim());
        petalLength = Double.parseDouble(item[2].trim());
        petalWidth = Double.parseDouble(item[3].trim());
        species = item[4].trim();
    }
    //=====================  
    //建構元(2) 傳0個參數
    //=====================    
    public Iris() {
        sepalLength = 0;
        sepalWidth = 0;
        petalLength = 0;
        petalWidth = 0;
        species = null;
    }
    //=====================  
    //getters
    //===================== 
    public double getSepalLength() {return sepalLength;}
    public double getSepalWidth() {return sepalWidth;}
    public double getPetalLength() {return petalLength;}
    public double getPetalWidth() {return petalWidth;}
    public String getSpecies() {return species;}
    //=====================  
    //setters
    //===================== 
    public void setSepalLength(double sepalLength) {this.sepalLength = sepalLength;}
    public void setSepalWidth(double sepalWidth) {this.sepalWidth = sepalWidth;}
    public void setPetalLength(double petalLength) {this.petalLength = petalLength;}
    public void setPetalWidth(double petalWidth) {this.petalWidth = petalWidth;}
    public void setSpecies(String species) {this.species = species;}
    //=====================  
    //方法(備註)
    //=====================    
    public String remark() {
        String info = null;
        if (sepalLength >= 5 && petalLength >= 5) {
            info = "***";
        }
        else {
            info = "";
        }
        return info;
    }
    public String remark(double minLength, double maxLength) {
        String info = null;
        if (sepalLength >= minLength && sepalLength <= maxLength && petalLength >= minLength && petalLength <= maxLength) {
            info = "***";
        }
        else {
            info = "";
        }
        return info;
    }
}