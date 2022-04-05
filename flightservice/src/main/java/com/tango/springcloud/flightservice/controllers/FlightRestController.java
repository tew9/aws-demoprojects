package com.tango.springcloud.flightservice.controllers;

import com.tango.springcloud.flightservice.Repos.FlightRepo;
import com.tango.springcloud.flightservice.model.Flight;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/flightapi")
public class FlightRestController {
  @Autowired
  FlightRepo repo;

  @RequestMapping(value = "/flight")
  public List<Flight> getAllFlight(){
    return repo.findAll();
  }

  @RequestMapping(value = "/flight")
  public Flight create(@RequestBody Flight flight){
    return repo.save(flight);
  }
}
