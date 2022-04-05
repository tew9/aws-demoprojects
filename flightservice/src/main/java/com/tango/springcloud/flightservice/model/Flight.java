package com.tango.springcloud.flightservice.model;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String flightNumber;
  private String operatingAirlines;
  private String departureCity;
  private String arrivalCity;
  private String dateOfDeparture;
  private String estimatedDepartureTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public String getOperatingAirlines() {
    return operatingAirlines;
  }

  public void setOperatingAirlines(String operatingAirlines) {
    this.operatingAirlines = operatingAirlines;
  }

  public String getDepartureCity() {
    return departureCity;
  }

  public void setDepartureCity(String departureCity) {
    this.departureCity = departureCity;
  }

  public String getArrivalCity() {
    return arrivalCity;
  }

  public void setArrivalCity(String arrivalCity) {
    this.arrivalCity = arrivalCity;
  }

  public String getDateOfDeparture() {
    return dateOfDeparture;
  }

  public void setDateOfDeparture(String dateOfDeparture) {
    this.dateOfDeparture = dateOfDeparture;
  }

  public String getEstimatedDepartureTime() {
    return estimatedDepartureTime;
  }

  public void setEstimatedDepartureTime(String estimatedDepartureTime) {
    this.estimatedDepartureTime = estimatedDepartureTime;
  }

}
