package course;

import java.util.ArrayList;
import java.util.Collection;

import users.Professor;

public class Location {
    private String building;
    private int roomNumber;
    private boolean isOnline;
    
    private Location() {
        this.roomNumber = 0;
        this.building = null;
        this.isOnline = null;
    }
        
    private Location(String building, int roomNumber, boolean isOnline) {
    this.building = building;
    this.roomNumber = roomNumber;
    this.isOnline = isOnline;
    }
    
    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String meetingDescription() {
        if (isOnline) {
            return "This meeting is online.";
        } else {
            return "This meeting is in " + building + " room " + roomNumber + ".";
        }
    }
}


