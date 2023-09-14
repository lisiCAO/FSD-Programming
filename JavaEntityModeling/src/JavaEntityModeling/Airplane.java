package JavaEntityModeling;
import java.time.LocalDateTime;
public class Airplane {
	private String flightNumber;
	private String destination;
	private LocalDateTime departureTime;
	private String status;
	
	public Airplane(String fNum, String destination, LocalDateTime departureTime) {
		this.flightNumber = fNum;
		this.destination = destination;
		this.departureTime = departureTime;
		this.status = "on time";
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public String getDestination() {
		return destination;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public String getStatus() {
		return status;
	}
	public String setStatus(LocalDateTime actualDepartureTime) {
		if(departureTime.isBefore(actualDepartureTime)) {
			status = "delayed";
		}else {
			status = "on time";
		}
		return status;
	}
	
	public boolean isDelayed(LocalDateTime actualDepartureTime) {
		if(departureTime.isBefore(actualDepartureTime)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Airplane flight1 = new Airplane("CN123", "Montreal", LocalDateTime.of(2023,06,29,14,36));
        System.out.println("Flight status of " + flight1.getFlightNumber() + ": " + flight1.getStatus());

        flight1.setStatus(LocalDateTime.of(2023,06,29,17,36));
        System.out.println("Flight status of " + flight1.getFlightNumber() + ": " + flight1.getStatus());
    }
	}
