package com.eurowings.flightservice.web.rest;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eurowings.flightservice.dto.FlightDetailsTO;
import com.eurowings.flightservice.repository.FlightRecord;
import com.eurowings.flightservice.repository.FlightRecordRepository;

@RestController
@RequestMapping("/api/rest")
public class FlightStatus {
	
	@Autowired
	private FlightRecordRepository flightRecordRepository;
	
	@RequestMapping(value="/flightstatus",method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public FlightRecord getStatus(@Valid @RequestBody FlightDetailsTO flightDetailsTO,BindingResult bindingResult) {
		/*
		 * FlightDetailsTO flight=flightDetailsTO; flightRecordRepository. DateFormat
		 * format=new SimpleDateFormat("dd-MMM-yyyy"); Date date=null; try {
		 * date=format.parse(flightDetailsTO.getStdS()); } catch (ParseException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); } Calendar
		 * std=Calendar.getInstance(); std.set(Calendar.DAY_OF_MONTH,date.getDay());
		 * std.set(Calendar.MONTH,date.getMonth());
		 * std.set(Calendar.YEAR,date.getYear()); Calendar atd = (Calendar)std.clone();
		 * atd.set(Calendar.HOUR_OF_DAY,std.get(Calendar.HOUR_OF_DAY)+4);
		 * //flight.setAtd(atd); //flight.setStd(std);
		 * flight.setStatus(getRandomString());
		 */
		
		FlightRecord flight = flightRecordRepository.findFlightSatus(flightDetailsTO.getFlightNumber(),toCalendar(flightDetailsTO.getStdS(),"dd-MMM-yyyy"),flightDetailsTO.getOrigin(),flightDetailsTO.getDestination());
		
		return flight;
	}
	
	@RequestMapping(value="/addflt",method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public String addFlight(@Valid @RequestBody List<FlightDetailsTO> flightDetailsTOs,BindingResult bindingResult) {
		
		
		if(flightDetailsTOs==null || flightDetailsTOs.isEmpty()) {
			return "Nothing to insert, please insert some records";
		}
		for(FlightDetailsTO flightDetailsTO:flightDetailsTOs) {
		FlightRecord flightRecord=new FlightRecord();
		flightRecord.setFlightNumber(flightDetailsTO.getFlightNumber());
		flightRecord.setDestination(flightDetailsTO.getDestination());
		flightRecord.setOrigin(flightDetailsTO.getOrigin());
		flightRecord.setStd(toCalendar(flightDetailsTO.getStdS(),null));
		flightRecord.setSta(toCalendar(flightDetailsTO.getStaS(),null));
		flightRecord.setStatus(flightDetailsTO.getStatus());
		flightRecordRepository.save(flightRecord);
		//flightRecordRepository.saveAll(flightDetailsTOs.iterator());
		
		}
		
		return "Successfully inserted!!";
	}
	
	@RequestMapping(value="/allflights",method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<FlightRecord> addFlight() {
		flightRecordRepository.getAllFlights();
		
		return flightRecordRepository.getAllFlights();
	}
	
	static String getRandomString(){
        int r = (int) (Math.random()*5);
        String name = new String [] {"Scheduled","Redirected","Diverted","Cancelled","Active"}[r];
        return name;
    }
	
	public static Calendar toCalendar(String dateString,String dateFormat){ 
		    DateFormat format=new SimpleDateFormat(dateFormat==null ? "dd-MMM-yyyy HH:mm" : dateFormat);
			Date date=null;
			try {
				date=format.parse(dateString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  Calendar cal = Calendar.getInstance();
		  cal.setTime(date);
		  return cal;
	}


}
