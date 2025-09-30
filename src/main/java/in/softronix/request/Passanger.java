package in.softronix.request;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
@Data
public class Passanger {
	
	private String fname;
	private String lname;
	private String mno;
	private String email;
	private String from;
	private String to;
	private String doj;
	private String trainNumber;

}
