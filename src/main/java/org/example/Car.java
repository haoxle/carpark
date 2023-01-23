package org.example;

public class Car {
    private String type = "car";
    private int space = 1;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public void parkCar(CarPark carPark) {
        carPark.decreaseRegularSpot(this.space);
    }

    public String toString(){
    return "This " + this.type + " has parked.";
    }
}
