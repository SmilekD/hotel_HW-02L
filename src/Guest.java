import java.time.LocalDate;

public class Guest {
    String name;
    String surname;
    LocalDate birhdate;

    public Guest(String name, String surname, LocalDate birhdate) {
        this.name = name;
        this.surname = surname;
        this.birhdate = birhdate;
    }
    public String getFullName(){
        return name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirhdate() {
        return birhdate;
    }

    public void setBirhdate(LocalDate birhdate) {
        this.birhdate = birhdate;
    }
}
