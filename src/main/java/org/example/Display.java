package org.example;

import java.util.Scanner;

public class Display {

    CarPark carPark = new CarPark(10, 20);
    Car car = new Car();
    Van van = new Van();
    Motorbike motorbike = new Motorbike();
    Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("What would you like to do? \n(1) Check Available Spaces.\n(2) Park your vehicle.");
        String option = scanner.next();
        switch (option) {
            case "0":
                System.exit(0);
            case "1":
                carPark.checkAvaiableSpots();
                mainMenu();
            case "2":
                chooseVehicle();
            default:
                System.out.println("Didn't understand input, try again");
                mainMenu();
                break;
        }
    }

    public void chooseVehicle() {
        System.out.println("What vehicle are you parking? \n(1) Motorbike\n(2) Car \n(3) Van");
        String choice = scanner.next();
        switch (choice) {
            case "1":
                if (carPark.checkCompactSpot(motorbike.getSpace())) {
                } else {
                    motorbike.parkMotorbike(carPark);
                    motorbike.toString();
                }
                mainMenu();
            case "2":
                if (carPark.checkRegularSpot(car.getSpace())) {
                } else {
                    car.parkCar(carPark);
                    car.toString();
                }
                mainMenu();
            case "3":
                if (carPark.checkRegularSpot(van.getSpace())) {
                } else {
                    van.parkVan(carPark);
                    van.toString();
                }
                mainMenu();
            default:
                System.out.println("Didn't understand input, try again");
                chooseVehicle();
        }

    }
}