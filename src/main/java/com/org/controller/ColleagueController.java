package com.org.controller;

import com.org.dto.Colleague;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("colleague")
public class ColleagueController {

	@GET
	@Path("/getrecord")
	@Produces(MediaType.APPLICATION_XML)
	public Colleague getCollegue() {
		Colleague collegue = new Colleague();
		collegue.setName("Amit Ghosh");
		collegue.setAge(30);
		collegue.setActive(true);
		return collegue;
	}

}
