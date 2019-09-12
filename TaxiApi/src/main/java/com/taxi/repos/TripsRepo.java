package com.taxi.repos;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.taxi.entities.Drivers;
import com.taxi.entities.Trips;

public interface TripsRepo extends PagingAndSortingRepository<Trips, Long>{
	
	List<Trips> findBytripStatus(String tripStatus);

}
