package org.example;

public class CarPark {
    int compactSpot;
    int regularSpot;

    public CarPark(int compactSpot, int regularSpot) {
        this.compactSpot = compactSpot;
        this.regularSpot = regularSpot;
    }

    public int getCompactSpot() {
        return compactSpot;
    }

    public void setCompactSpot(int compactSpot) {
        this.compactSpot = compactSpot;
    }

    public int getRegularSpot() {
        return regularSpot;
    }

    public void setRegularSpot(int regularSpot) {
        this.regularSpot = regularSpot;
    }

    public void decreaseRegularSpot(int space) {
        this.regularSpot = this.regularSpot - space;
    }

    public void decreaseCompactSpot(int space) {
        this.compactSpot = this.compactSpot - space;
    }

    public void checkAvaiableSpots(){
        System.out.println("There are " + this.compactSpot + " compact spots and " + this.regularSpot + " regular spots available.");
    }

    public boolean checkCompactSpot(int space){
        if(this.compactSpot - space < 0) {
            System.out.println("This spot is empty, please wait for someone to leave.");
            return true;
        } else return false;
    }

    public boolean checkRegularSpot(int space){
        if(this.regularSpot == 0) {
            System.out.println("This spot is empty, please wait for someone to leave.");
            return true;
        } else if(this.regularSpot - space < 0) {
            System.out.println("You cannot park your van here there is not enough space.");
            return true;
        }
        return false;
    }
}
