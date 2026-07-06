package service;

import model.*;

import java.util.ArrayList;

public class ReservationService {

    private ArrayList<Reservation> reservations = new ArrayList<>();

    public void bookRoom(Customer customer,
                         Room room,
                         String checkIn,
                         String checkOut){

        if(!room.isAvailable()){

            System.out.println("Room Already Booked.");
            return;
        }

        String reservationId = "RES" + (reservations.size()+101);

        Reservation reservation =
                new Reservation(
                        reservationId,
                        customer,
                        room,
                        checkIn,
                        checkOut
                );

        reservations.add(reservation);

        room.setAvailable(false);

        System.out.println("Booking Successful.");
        System.out.println(reservation);

    }

    public void viewReservations(){

        if(reservations.isEmpty()){

            System.out.println("No Reservations Found.");
            return;
        }

        for(Reservation reservation : reservations){

            System.out.println("------------------------");
            System.out.println(reservation);

        }

    }

    public void cancelReservation(String reservationId){

        for(Reservation reservation : reservations){

            if(reservation.getReservationId().equalsIgnoreCase(reservationId)){

                reservation.getRoom().setAvailable(true);

                reservations.remove(reservation);

                System.out.println("Reservation Cancelled.");

                return;
            }

        }

        System.out.println("Reservation Not Found.");

    }

}