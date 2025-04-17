package com.pluralsight;

public class Car {
    private int year;
    private String make;
    private String model;

    public Car() {
        this.year = 0;
        this.make = "";
        this.model = "";
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getMake(){
        return this.make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void drive(){
        System.out.println(this.getModel()+ " is now driving");
    }

}

