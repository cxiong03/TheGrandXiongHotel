package com.codewithchang;

public class Room {
    private String roomNumber;
    private String floor;
    private String roomType;
    private boolean isOccupied = false;
    private boolean needsCleaning = false;
    private double price;

    public Room(String roomNumber, String floor, String roomType,
                double price) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.roomType = roomType;
        this.price = price;
    }

}
