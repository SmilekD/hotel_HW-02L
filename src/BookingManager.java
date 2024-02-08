import java.util.ArrayList;
import java.util.List;
public class BookingManager {
    private List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking){
        bookings.add(booking);
    }
    public void clearBooking(Booking booking){
        bookings.clear();
    }
    public void getNumberOfWorkingBookings(){
        int number = 0;
        String text = "pracovní pobyt";
        for (Booking booking : bookings){
            if (booking.typeOfVacation.equals(text)){
                number += 1;
            }
        }
        System.out.println("Počet rezervací pro pracovní pobyt je: "+number);
    }
    public double getAverageGuests(){
        double numberOfGuests = 0;
        double numberOfReservations = 0;
        double averageGuests = 0;
        for (Booking booking : bookings){
            numberOfGuests += booking.getNumberOfGuests();
        }
        numberOfReservations += bookings.size();
        return averageGuests = numberOfGuests / numberOfReservations;
    }
    public List<Booking> getBookings(){
        return new ArrayList<>(bookings);

    }
    public void firstEightRecre() {
        int number = 0;
        System.out.println("Seznam rekreačních ubytování");
        for (Booking booking : bookings) {
            if (booking.typeOfVacation.equals("rekreační pobyt")) {
                System.out.println(booking);
                number += 1;
                if (number >= 20) {
                    break;
                }
            }
        }
        if (number == 0) {
            System.out.println("V seznamu se nenachází žádná rezervace s typem: rekreační pobyt");
        }
    }
}
