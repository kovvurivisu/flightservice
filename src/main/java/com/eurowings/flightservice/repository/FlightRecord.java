package com.eurowings.flightservice.repository;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class FlightRecord {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String flightNumber;

	private String origin;
	private String destination;
	private Calendar std;
	private Calendar sta;
	private String status;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}
	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the std
	 */
	public Calendar getStd() {
		return std;
	}
	/**
	 * @param std the std to set
	 */
	public void setStd(Calendar std) {
		this.std = std;
	}
	/**
	 * @return the sta
	 */
	public Calendar getSta() {
		return sta;
	}
	/**
	 * @param sta the sta to set
	 */
	public void setSta(Calendar sta) {
		this.sta = sta;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
