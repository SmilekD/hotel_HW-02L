import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class ReservationSystem {
    public List<Booking> bookings;
    public ReservationSystem(){
        this.bookings = new ArrayList<>();
    }
    public void addBooking(Booking booking){
        bookings.add(booking);
    }
    public void printAllBooking(){
        for (Booking booking : bookings){
            System.out.println(booking.guest);
            System.out.println(booking.room);
            System.out.println(booking.startDate);
            System.out.println(booking.endDate);
        }
    }

}
