package service;

import model.Room;
import java.util.ArrayList;

public class RoomService {

    private ArrayList<Room> rooms = new ArrayList<>();

    public RoomService() {

        rooms.add(new Room(101, "Standard", 1500));
        rooms.add(new Room(102, "Standard", 1500));

        rooms.add(new Room(201, "Deluxe", 2500));
        rooms.add(new Room(202, "Deluxe", 2500));

        rooms.add(new Room(301, "Suite", 4000));
    }

    public void displayRooms() {

        System.out.println("\n===== Room List =====");

        for(Room room : rooms){
            System.out.println(room);
        }
    }

    public Room searchRoom(int roomNo){

        for(Room room : rooms){

            if(room.getRoomNumber()==roomNo){
                return room;
            }

        }

        return null;
    }

    public ArrayList<Room> getRooms(){
        return rooms;
    }

}