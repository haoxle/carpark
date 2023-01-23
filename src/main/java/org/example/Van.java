package org.example;

public class Van {
    private String type = "van";
    private int space = 3;

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

    public void parkVan(CarPark carPark){
        carPark.decreaseRegularSpot(this.space);
    }
    public String toString(){
        return "This " + this.type + " has parked.";
    }
}
