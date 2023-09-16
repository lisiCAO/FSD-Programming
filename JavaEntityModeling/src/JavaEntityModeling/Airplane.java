package JavaEntityModeling;

import java.time.LocalDateTime;

/**
 * The class "Airplane" represents a flight with its attributes like flight number,
 * destination, departure time, actual departure time, and flight status.
 * 
 * @author Lisi Cao
 * @version 2.1
 * @since September 15, 2023
 */
public class Airplane {

    // Attributes of the airplane class
    private String flightNumber;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime actualDepartureTime;
    private FlightStatus status;

    // Enum representing the status of the flight: ON_TIME or DELAYED
    private enum FlightStatus {
        ON_TIME, DELAYED
    }

    /**
     * Private constructor used by the builder to create an instance of the Airplane.
     * 
     * @param builder The builder object containing the airplane attributes.
     */
    public Airplane(Builder builder) {
        this.flightNumber = builder.flightNumber;
        this.destination = builder.destination;
        this.departureTime = builder.departureTime;
        this.status = FlightStatus.ON_TIME;
        this.actualDepartureTime = null;  // Initially set to null since it's not provided at the time of instantiation
    }

    // Getters for various attributes of the Airplane class
    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public LocalDateTime getDepartureTime() { return departureTime; }
    public FlightStatus getStatus() { return status; }

    /**
     * Returns the actual departure time if it's set or provides a message if the plane hasn't departed yet.
     * 
     * @return The actual departure time of the flight.
     */
    public LocalDateTime getActualDepartureTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        if (currentDateTime.isAfter(departureTime)) {
            System.out.println("The airplane has not departed yet.");
            return null;
        }
        if (currentDateTime.isBefore(departureTime) && actualDepartureTime == null) {
            System.out.println("Actual departure time has not been set.");
            return null;
        }
        return actualDepartureTime;
    }

    /**
     * Sets the actual departure time and updates the status accordingly.
     * 
     * @param actualDepartureTime The actual departure time to be set.
     */
    public void setActualDepartureTime(LocalDateTime actualDepartureTime) {
        this.actualDepartureTime = actualDepartureTime;
        isDelayed();  // Check if the flight is delayed
        setStatus();  // Update the flight status
    }

    /**
     * Determines and sets the flight status based on departure times.
     * 
     * @return The updated flight status.
     */
    public FlightStatus setStatus() {
        if (isDelayed()) {
            status = FlightStatus.DELAYED;
        } else {
            status = FlightStatus.ON_TIME;
        }
        return status;
    }

    /**
     * Checks if the flight is delayed based on the scheduled and actual departure times.
     * 
     * @return true if the flight is delayed, false otherwise.
     */
    public boolean isDelayed() {
        if (actualDepartureTime == null) {
            throw new IllegalStateException("Actual departure time is not set.");
        }
        return departureTime.isBefore(actualDepartureTime);
    }

    /**
     * Displays the flight details using a StringBuilder.
     */
    public void display() {
        StringBuilder display = new StringBuilder();
        display.append("Flight Number: ").append(flightNumber)
               .append("\nDestination: ").append(destination)
               .append("\nScheduled Departure Time: ").append(departureTime)
               .append("\nStatus: ").append(status);
               
        if (actualDepartureTime != null) {
            display.append("\nActual Departure Time: ").append(actualDepartureTime);
        }
        display.append("\n---------------------------------------------");
        System.out.println(display.toString());
    }

    /**
     * Builder class for creating an instance of the Airplane class.
     */
    public static class Builder {
        // Attributes for the builder
        private String flightNumber;
        private String destination;
        private LocalDateTime departureTime;

        /**
         * Constructor to initialize the builder with a flight number.
         * 
         * @param flightNumber The flight number to be set.
         */
        public Builder(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        // Setters for builder attributes
        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder departureTime(LocalDateTime departureTime) {
            this.departureTime = departureTime;
            return this;
        }

        /**
         * Constructs and returns an instance of the Airplane using the attributes set in the builder.
         * 
         * @return A new Airplane object.
         */
        public Airplane build() {
            return new Airplane(this);
        }
    }

	public static void main(String[] args) {
		// Test	
		// Airplane 1 - delay
		Airplane airplane = new Airplane.Builder("CN123").destination("Montreal")
				.departureTime(LocalDateTime.of(2023, 6, 29, 14, 36)).build();

		airplane.setActualDepartureTime(LocalDateTime.of(2023, 6, 29, 17, 36));

		airplane.display();
		
		// Airplane 2 - delay
		Airplane delayedAirplane = new Airplane.Builder("CN123").destination("Montreal")
				.departureTime(LocalDateTime.of(2023, 6, 29, 14, 36)).build();

		delayedAirplane.setActualDepartureTime(LocalDateTime.of(2023, 6, 29, 17, 36));

		// Airplane 3 - not depart
		Airplane notDepartedAirplane = new Airplane.Builder("CN124").destination("Toronto")
				.departureTime(LocalDateTime.of(2023, 6, 30, 10, 00)).build();

		notDepartedAirplane.getActualDepartureTime();
		notDepartedAirplane.display();

		// Airplane 4 - On time
		Airplane onTimeAirplane = new Airplane.Builder("CN125").destination("Vancouver")
				.departureTime(LocalDateTime.of(2023, 6, 29, 18, 45)).build();

		onTimeAirplane.setActualDepartureTime(LocalDateTime.of(2023, 6, 29, 18, 45));
		onTimeAirplane.display();
	}
}
