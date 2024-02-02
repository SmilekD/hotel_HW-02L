import java.util.Date;

public class Booking {
    Room room;
    Guest guest;
    Date startDate;
    Date endDate;
    enum vacationType{
        WORK, VACATION
    }

    public Booking(Room room, Guest guest, Date startDate, Date endDate) {
        this.room = room;
        this.guest = guest;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}



