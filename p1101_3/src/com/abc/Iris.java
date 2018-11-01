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
    public Iris(double sepalLength, double sepalWidth, double petalLength, double petalWidth, String species) {
        this.sepalLength = sepalLength;
        this.sepalWidth = sepalWidth;
        this.petalLength = petalLength;
        this.petalWidth = petalWidth;
        this.species = species;
    }

    //=====================  
    //建構元(2) 傳0個參數
    //===================== 
    public Iris() {
        this.sepalLength = 0;
        this.sepalWidth = 0;
        this.petalLength = 0;
        this.petalWidth = 0;
        this.species = null;
    }

    //=====================  
    //getters
    //===================== 
    public double getSepalLength() {
        return this.sepalLength;
    }

    public double getSepalWidth() {
        return this.sepalWidth;
    }

    public double getPetalLength() {
        return this.petalLength;
    }

    public double getPetalWidth() {
        return this.petalWidth;
    }

    public String getSpecies() {
        return this.species;
    }

    //=====================  
    //setters
    //===================== 
    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    public void setSepalWidth(double sepalWidth) {
        this.sepalWidth = sepalWidth;
    }

    public void setPetalLength(double petalLength) {
        this.petalLength = petalLength;
    }

    public void setPetalWidth(double petalWidth) {
        this.petalWidth = petalWidth;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
