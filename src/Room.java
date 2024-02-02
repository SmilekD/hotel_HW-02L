public class Room {
    int numberOfBeds, pricePerNight, roomNumber;
    boolean balcony, seeSight;

    public Room(int roomNumber,int numberOfBeds, int pricePerNight, boolean balcony,
                boolean seeSight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.pricePerNight = pricePerNight;
        this.balcony = balcony;
        this.seeSight = seeSight;
    }
    public Room(int roomNumber){
        this(roomNumber,1,1000,true,true);
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeeSight() {
        return seeSight;
    }

    public void setSeeSight(boolean seeSight) {
        this.seeSight = seeSight;
    }
}
