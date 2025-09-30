package in.softronix.response;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
@Data
public class Ticket {
	
	private Integer ticketid;
	private String trainNumber;
	private String from;
	private String to;
	private String doj;
	private String coachNumber;
	private String seatNumber;
	private String ticketCost;

}
