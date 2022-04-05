package com.tango.springcloud.flightservice.Repos;

import com.tango.springcloud.flightservice.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepo extends JpaRepository<Flight, Long> {

}
