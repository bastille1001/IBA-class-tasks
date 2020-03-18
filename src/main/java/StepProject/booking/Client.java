package StepProject.booking;

import StepProject.flights.Flight;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    private int userId;
    private String name;
    private String surname;
    private List<Flight> myFlights = new ArrayList<>();
    private Random rand = new Random();

    public Client(int userId, String name, String surname) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
    }

    public List<Flight> getMyFlights(){return myFlights;}

    public String getName(){return name;}

    public String getSurname(){return surname;}

    public int getUserId(){return userId;}

    public void addFlight(Flight flight){myFlights.add(flight);}

    public boolean cancelFlight(Flight flight){
        if (!myFlights.contains(flight)){
            return false;
        }
        myFlights.remove(flight);
        return true;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass() || this.hashCode() != that.hashCode()) return false;
        Client client = (Client) that;
        return userId == client.userId &&
                Objects.equals(name, client.name) &&
                Objects.equals(surname, client.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, surname);
    }

    @Override
    public String toString() {
        return String.format("Client{userId=%d, name='%s', surname='%s', myFlights=%s}", userId, name, surname, myFlights);
    }
}
