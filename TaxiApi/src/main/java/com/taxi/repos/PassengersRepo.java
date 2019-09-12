package com.taxi.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.taxi.entities.Passengers;

public interface PassengersRepo extends PagingAndSortingRepository<Passengers, Long>{

}
