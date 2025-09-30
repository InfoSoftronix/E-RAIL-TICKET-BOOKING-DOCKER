package in.softronix.controller;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.softronix.request.Passanger;
import in.softronix.response.Ticket;

@RestController
public class TicketBookingRestController {
	
	Map<Integer,Ticket> ticket=new HashMap<>();
	
	
	@PostMapping(value="/ticket",
			consumes = {"application/xml","application/json"},
			produces = {"application/xml","application/json"})
	public Ticket ticketBooking(@RequestBody Passanger passanger)
	{
		Ticket t=new Ticket();
		
		Random r=new Random();
		
		Integer ticketid=r.nextInt(100000000);
		t.setTicketid(ticketid);
		t.setTrainNumber(passanger.getTrainNumber());
		t.setFrom(passanger.getFrom());
		t.setTo(passanger.getTo());
		t.setDoj(passanger.getDoj());
		t.setCoachNumber("1024");
		t.setSeatNumber("s-65");
		t.setTicketCost("350Rs");
		
		ticket.put(ticketid, t);
		
		return t ;
	}
	
	@GetMapping(value="/ticket/{ticketid}")
	public Ticket getTicket(@PathVariable Integer ticketid)
	{
		
		System.out.println(ticketid);
		
		if(ticket.containsKey(ticketid))
		{
			return ticket.get(ticketid);
		}
		else
		{
			return null;
		}
	}

}
