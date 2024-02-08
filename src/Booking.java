import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

public class Booking {
    Room room;
    private List<Guest> moreGuests;
    Guest guest;
    LocalDate startDate;
    LocalDate endDate;
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

    public List<Guest> getMoreGuests() {
        return moreGuests;
    }

    public void setMoreGuests(List<Guest> moreGuests) {
        this.moreGuests = moreGuests;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Booking(Room room, List<Guest> moreGuests, LocalDate startDate, LocalDate endDate,
                   String typeOfVacation) {
        this.room = room;
        this.moreGuests = moreGuests;
        this.startDate = startDate;
        this.endDate = endDate;
        this.typeOfVacation = typeOfVacation;
    }
    public int getNumberOfGuests(){
        return moreGuests.size();
    }

    public long getBookingLength(){
        return ChronoUnit.DAYS.between(startDate,endDate);
    }

    public int getPrice(){
        long numberOfNights = ChronoUnit.DAYS.between(startDate, endDate);
        return (int) (numberOfNights * room.getPricePerNight());
    }

    @Override
    public String toString() {
        return startDate+" až "+endDate+": "+moreGuests.get(0).getFullName()+ " ("+moreGuests.get(0).getBirhdate()+")"+" ["
                +moreGuests.size()+" , "+room.isSeeSight()+"]"+" za cenu: "+room.getPricePerNight();
    }
}



