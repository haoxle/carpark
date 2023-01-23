package org.example;

public class Motorbike {

    private String type = "Motorbike";
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

    public void parkMotorbike(CarPark carPark){
        carPark.decreaseCompactSpot(this.space);
    }
    public String toString(){
        return "This " + this.type + " has parked.";
    }
}
