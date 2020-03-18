package StepProject.flights;

import StepProject.booking.Client;

import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Objects;

public class Flight implements Serializable {
    private static final long serialVersionUID = 1L;

    private String startingCity;
    private String destinationCity;

    private int id;
    private int numberOfSeats;
    private int numberOfFreeSeats;

    private HashMap<Integer, Client> seats;

    private long startingDate;
    private long destinationDate;

    public Flight(int id, int numberOfSeats,
                  String startingDate, String destinationDate,
                  String startingCity, String destinationPoint) throws ParseException {
        this.id = id;
        this.numberOfSeats = numberOfSeats;
        this.seats = new HashMap<Integer, Client>();
        this.startingDate = DateConverter.stringToMills(startingDate);
        this.destinationDate = DateConverter.stringToMills(destinationDate);
        this.startingCity = startingCity;
        this.destinationCity = destinationPoint;
        this.numberOfFreeSeats = getNumberOfFreeSeats();
    }

    public int getId() {
        return id;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public HashMap<Integer, Client> getSeats() {
        return seats;
    }

    public Long getStartingDate() {
        return startingDate;
    }

    public Long getDestinationDate() {
        return destinationDate;
    }

    public String getStartingCity() {
        return startingCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public int getNumberOfFreeSeats() {
        numberOfFreeSeats = numberOfSeats - seats.size();
        return numberOfFreeSeats;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flight ");
        sb.append("Id: ").append(id);
        sb.append("\n      Number of seats: ").append(numberOfSeats);
        sb.append("\n      Available seats: ").append(getNumberOfFreeSeats());
        sb.append("\n      Starting city: '").append(startingCity).append('\'');
        sb.append(" Starting date: ").append(DateConverter.millsToString(startingDate));
        sb.append("\n      Destination city: '").append(destinationCity).append('\'');
        sb.append(" Destination date: ").append(DateConverter.millsToString(destinationDate));
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this.hashCode() != that.hashCode()) return false;
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Flight flight = (Flight) that;
        return id == flight.id &&
                numberOfSeats == flight.numberOfSeats &&
                startingDate == flight.startingDate &&
                destinationDate == flight.destinationDate &&
                Objects.equals(startingCity, flight.startingCity) &&
                Objects.equals(destinationCity, flight.destinationCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberOfSeats, startingDate, destinationDate, startingCity, destinationCity);
    }
}
