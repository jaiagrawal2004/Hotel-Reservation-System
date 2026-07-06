import model.*;
import service.*;

import java.util.Scanner;

public class Hotel {

    private RoomService roomService = new RoomService();
    private ReservationService reservationService = new ReservationService();
    private PaymentService paymentService = new PaymentService();

    Scanner sc = new Scanner(System.in);

    public void start() {

        while (true) {

            System.out.println("\n========= HOTEL RESERVATION SYSTEM =========");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. View Reservations");
            System.out.println("4. Cancel Reservation");
            System.out.println("5. Make Payment");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    roomService.displayRooms();
                    break;

                case 2:

                    System.out.print("Room Number : ");
                    int roomNo = sc.nextInt();
                    sc.nextLine();

                    Room room = roomService.searchRoom(roomNo);

                    if (room == null) {
                        System.out.println("Room Not Found");
                        break;
                    }

                    System.out.print("Customer Name : ");
                    String name = sc.nextLine();

                    System.out.print("Mobile : ");
                    String mobile = sc.nextLine();

                    System.out.print("Check In : ");
                    String in = sc.nextLine();

                    System.out.print("Check Out : ");
                    String out = sc.nextLine();

                    Customer customer =
                            new Customer(
                                    "CUS" + System.currentTimeMillis() % 10000,
                                    name,
                                    mobile
                            );

                    reservationService.bookRoom(customer, room, in, out);

                    break;

                case 3:

                    reservationService.viewReservations();

                    break;

                case 4:

                    sc.nextLine();

                    System.out.print("Reservation ID : ");

                    String id = sc.nextLine();

                    reservationService.cancelReservation(id);

                    break;

                case 5:

                    System.out.print("Amount : ");

                    double amount = sc.nextDouble();

                    sc.nextLine();

                    System.out.print("Payment Mode : ");

                    String mode = sc.nextLine();

                    paymentService.makePayment(amount, mode);

                    break;

                case 6:

                    System.out.println("Thank You");

                    return;

                default:

                    System.out.println("Invalid Choice");

            }

        }

    }

}