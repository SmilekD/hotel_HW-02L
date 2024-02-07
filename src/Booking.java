import java.util.Date;
import java.util.List;

public class Booking {
    Room room;
    Guest guest;
    List<Guest> moreGuests;
    Date startDate;
    Date endDate;
    String typeOfVacation;

    enum vacationType{
        WORK, VACATION
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getMoreGuests() {
        return moreGuests;
    }

    public void setMoreGuests(List<Guest> moreGuests) {
        this.moreGuests = moreGuests;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Booking(Room room, Guest guest, Date startDate, Date endDate,
                   String vacationType) {
        this.room = room;
        this.guest = guest;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public Booking(Room room, List<Guest> moreGuests, Date startDate, Date endDate,
                   String typeOfVacation) {
        this.room = room;
        this.moreGuests = moreGuests;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}



