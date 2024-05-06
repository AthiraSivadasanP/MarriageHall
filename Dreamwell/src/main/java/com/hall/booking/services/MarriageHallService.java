package com.hall.booking.services;

import java.util.List;

import org.springframework.data.domain.Page;


import com.hall.booking.model.LoginUser;
import com.hall.booking.model.MarriageHall;

public interface MarriageHallService {
	List<LoginUser> getAllLogins();
	List<MarriageHall> getAllHalls();
	void saveHall(MarriageHall hall);
	MarriageHall getMarriageHallById(long id);
	void deleteMarriageHallById(long id);
	Page<MarriageHall> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
