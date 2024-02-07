//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Guest guest1 = new Guest("Adéla", "Malíková",
            LocalDate.of(1993,3,13));
    Guest guest2 = new Guest("Jana", "Dvořáčková",
            LocalDate.of(1995,5,5));

    List<Guest> guestList = new ArrayList<>();
    guestList.add(guest1);
    guestList.add(guest2);

    for (Guest guest : guestList){
        System.out.println(guest.getName()+ " "+ guest.getSurname());
    }

    Room room1 = new Room(10);
    Room room2 = new Room(20);
    Room room3 = new Room(30,3,2400,false,
            true);

    List<Room> roomList = new ArrayList<>();
    roomList.add(room1);
    roomList.add(room2);
    roomList.add(room3);

    // Datumy první rezervace
    Date startDate1 = new Date(2021,6,1);
    Date endDate1 = new Date(2021,6, 19);

    // Datumy druhé rezervace
    Date startDate2 = new Date(2021,8,1);
    Date endDate2 = new Date(2021,8,14);
    // Druhá rezervace
    //List<Guest> moreGuests = new ArrayList<>();
    //moreGuests.add(guest1);
    //moreGuests.add(guest2);

    List<Guest> moreGuests = Arrays.asList(guest1,guest2);

    //Vytvoření rezervace
    Booking firstBooking = new Booking(room1,guest1,startDate1,endDate1, "Rekreace");

    //Booking secondBooking = new Booking(room2,moreGuests,startDate2,endDate2);
    Booking secondBooking = new Booking(room3,moreGuests,startDate2,endDate2,"Rekreace");

    ReservationSystem reservationSystem = new ReservationSystem();
    reservationSystem.addBooking(firstBooking);
    reservationSystem.addBooking(secondBooking);

    reservationSystem.printAllBooking();
    }


}