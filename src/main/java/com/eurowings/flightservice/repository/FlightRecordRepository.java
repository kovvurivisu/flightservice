package com.eurowings.flightservice.repository;

import java.util.Calendar;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface FlightRecordRepository extends CrudRepository<FlightRecord, Integer> {
 
    @Query("SELECT t FROM FlightRecord t where t.flightNumber=?1 and trunc(t.std)=trunc(?2) and t.origin=?3 and t.destination=?4")
    FlightRecord findFlightSatus(String flightNumber, Calendar std,String origin,String destination);

    @Query("SELECT t FROM FlightRecord t")
    List<FlightRecord> getAllFlights();

}
