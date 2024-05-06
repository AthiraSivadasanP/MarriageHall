package com.hall.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.hall.booking.model.MarriageHall;

@Repository
public interface MarriageHallRepository extends JpaRepository<MarriageHall, Long>{

}
