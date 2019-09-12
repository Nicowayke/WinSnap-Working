package com.taxi.repos;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.taxi.entities.Drivers;

public interface DriversRepo extends PagingAndSortingRepository<Drivers, Long>{
	
	List<Drivers> findAll();
	
	Drivers findByDrMobileNumber(String drMobileNumber);
	
	List<Drivers> findBydrStatus(String drStatus);

//	Drivers findBylatlong(String drMobileNumber);
}
