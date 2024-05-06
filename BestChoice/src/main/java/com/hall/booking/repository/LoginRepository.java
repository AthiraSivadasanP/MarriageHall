package com.hall.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.hall.booking.model.LoginUser;


@Repository
public interface LoginRepository extends JpaRepository<LoginUser, Long>{

}
