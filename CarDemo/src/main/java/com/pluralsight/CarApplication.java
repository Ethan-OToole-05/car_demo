package com.pluralsight;

import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {

        Car myCar = new Car();
        Car otherCar = new Car();

        Scanner input = new Scanner(System.in);

        String carModel, carMake;
        int carYear;

        myCar.setYear(2016);
        myCar.setMake("Mazda");
        myCar.setModel("CX-5");

        System.out.println("Year: " + myCar.getYear());
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());

        System.out.print("Who is your car manufacturer? ");
        carMake = input.nextLine();
        otherCar.setMake(carMake);

        System.out.print("What is your car's model? ");
        carModel = input.nextLine();
        otherCar.setModel(carModel);

        System.out.print("What year was your car made? ");
        carYear = input.nextInt();
        otherCar.setYear(carYear);

        System.out.println("Year: " + otherCar.getYear());
        System.out.println("Make: " + otherCar.getMake());
        System.out.println("Model: " + otherCar.getModel());

        otherCar.drive();

    }
}
