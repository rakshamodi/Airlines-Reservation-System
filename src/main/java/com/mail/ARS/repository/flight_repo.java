package com.mail.ARS.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mail.ARS.model.Flight;

public interface flight_repo extends JpaRepository<Flight,Integer> {

	@Query("from Flight where dep_city=:ffrom and arl_city=:fto and day=:fweekday")
	 List<Flight> findflight(@Param("ffrom")String from,@Param("fto") String to, @Param("fweekday")Date weekday);
	
	@Query("from Flight where dep_city=:ffrom and arl_city=:fto and day=:fweekday")
	List<Flight> indflight(@Param("ffrom")String from,@Param("fto") String to, @Param("fweekday")Date weekday);


}
