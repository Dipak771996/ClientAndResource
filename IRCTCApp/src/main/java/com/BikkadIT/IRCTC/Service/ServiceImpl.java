package com.BikkadIT.IRCTC.Service;

import org.springframework.stereotype.Service;

import com.BikkadIT.IRCTC.model.Passenger;
import com.BikkadIT.IRCTC.model.Ticket;

@Service
public class ServiceImpl {

	public Ticket getTicket(Passenger passenger)
	{
		if(passenger!=null)
		{
			Ticket t=new Ticket();
			t.setPnr((int)(Math.random()*1000));
			t.setPrice(500);
			t.setStatus("Booking Confirmed");
			return t;
		}
		
		return null;
	}
}
