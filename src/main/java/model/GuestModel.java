package model;

public class GuestModel {
    private int adultsNumber;
    private int childrenNumber;
    private int roomsNumber;

    public GuestModel(int adultsNumber, int childrenNumber, int roomsNumber) {
        this.adultsNumber = adultsNumber;
        this.childrenNumber = childrenNumber;
        this.roomsNumber = roomsNumber;
    }

    public int getAdultsNumber() {
        return adultsNumber;
    }

    public void setAdultsNumber(int adultsNumber) {
        this.adultsNumber = adultsNumber;
    }

    public int getChildrenNumber() {
        return childrenNumber;
    }

    public void setChildrenNumber(int childrenNumber) {
        this.childrenNumber = childrenNumber;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }
}
