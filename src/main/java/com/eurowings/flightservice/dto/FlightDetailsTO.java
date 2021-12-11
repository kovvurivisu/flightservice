/**
 * 
 */
package com.eurowings.flightservice.dto;

/**
 * @author Naga
 *
 */
public class FlightDetailsTO {
	private String flightNumber;
	private String origin;
	private String destination;
	private String stdS;
	private String staS;
	private String status;

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
	/*
	 * public Calendar getStd() { return std; }
	 *//**
		 * @param std the std to set
		 */
	/*
	 * public void setStd(Calendar std) { this.std = std; }
	 *//**
		 * @return the atd
		 */
	/*
	 * public Calendar getAtd() { return atd; }
	 *//**
		 * @param atd the atd to set
		 *//*
			 * public void setAtd(Calendar atd) { this.atd = atd; }
			 */

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

	/**
	 * @return the stdS
	 */
	public String getStdS() {
		return stdS;
	}

	/**
	 * @param stdS the stdS to set
	 */
	public void setStdS(String stdS) {
		this.stdS = stdS;
	}

	/**
	 * @return the atdS
	 */
	public String getStaS() {
		return staS;
	}

	/**
	 * @param atdS the atdS to set
	 */
	public void setStaS(String staS) {
		this.staS = staS;
	}

	@Override
	public String toString() {
		return "FlightDetailsTO [flightNumber=" + flightNumber + ", origin=" + origin + ", destination=" + destination
				+ ", status=" + status + "]";
	}

}
