//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Vytvoření hostů + seznam hostů
    Guest guest1 = new Guest("Adéla", "Malíková",
            LocalDate.of(1993,3,13));
    Guest guest2 = new Guest("Jana", "Dvořáčková",
            LocalDate.of(1995,5,5));
    Guest karelDvorak = new Guest("Karel", "Dvořák",
            LocalDate.of(1990,5,15));
    Guest karelDvorak2 = new Guest("Karel", "Dvořák",
            LocalDate.of(1979,1,3));
    Guest karolinaTmava = new Guest("Karolína", "Tmavá",
            LocalDate.of(1992,4,29));


    List<Guest> guestList = new ArrayList<>();
    guestList.add(guest1);
    guestList.add(guest2);
    guestList.add(karelDvorak);
    guestList.add(karelDvorak2);
    guestList.add(karolinaTmava);

    System.out.println("-------------------------------------------");

    //Vytváření pokojů + seznam pokojů
    Room room1 = new Room(1,1,1000,true,true);
    Room room2 = new Room(2, 1, 1000,true,true);
    Room room3 = new Room(3,3,2400,false,
            true);

    List<Room> roomList = new ArrayList<>();
    roomList.add(room1);
    roomList.add(room2);
    roomList.add(room3);

    //Příprava hostů pro rezervaci
    List<Guest> moreGuest = new ArrayList<>();
    moreGuest.add(guest1);
    moreGuest.add(guest2);

    List<Guest> karelD = new ArrayList<>();
    karelD.add(karelDvorak);
    List<Guest> karelD2 = new ArrayList<>();
    karelD2.add(karelDvorak2);
    List<Guest> karolinaT = new ArrayList<>();
    karolinaT.add(karolinaTmava);

        //Přidání rezervace do rezervačního systému
    BookingManager bookingManager = new BookingManager();
        bookingManager.addBooking(new Booking(room3,moreGuest,LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14),"pracovní pobyt"));
        bookingManager.addBooking(new Booking(room3,karelD,LocalDate.of(2023,6,1),
            LocalDate.of(2023,6,7),"pracovní pobyt"));
        bookingManager.addBooking(new Booking(room2, karelD2, LocalDate.of(2023,7,18),
            LocalDate.of(2023,7,21),"rekreační pobyt"));
        bookingManager.addBooking(new Booking(room3,karolinaT,LocalDate.of(2023,8,1),
            LocalDate.of(2023,8,31), "rekreační pobyt"));

    for (int i = 1; i <= 20; i +=2){
        bookingManager.addBooking(new Booking(room2,karolinaT,
                LocalDate.of(2023,8, i),
                LocalDate.of(2023,8,i+1),"rekreační pobyt"));
        }
    List<Booking>bookings = bookingManager.getBookings();
    bookings.forEach(System.out::println);

    System.out.println("====================================================");
    printGuestStatistics(bookings);

    for (Booking booking : bookings){
        System.out.println("Rezervace od: "+booking.startDate+" do: "+ booking.endDate+" má délku: "
                +booking.getBookingLength()+" nocí a celková cena je: "+booking.getPrice()+" Kč.");
    }

    }
    public static void printGuestStatistics(List<Booking> bookings) {
        int oneGuest = 0;
        int twoGuests = 0;
        int moreThenTwo = 0;
        for (Booking booking : bookings) {
            if (booking.getNumberOfGuests() == 1) {
                oneGuest += 1;
            }
            else if (booking.getNumberOfGuests() == 2) {
                twoGuests += 1;
            }
            else if (booking.getNumberOfGuests() >= 3) {
                moreThenTwo += 1;
            }
        }
        System.out.println("Počet rezervací s jedním hostem: "
                + oneGuest + " Počet rezervací s dvoumi hosty: " + twoGuests +
                " Počet rezervací se třemi a více hosty: " + moreThenTwo);
    }
}