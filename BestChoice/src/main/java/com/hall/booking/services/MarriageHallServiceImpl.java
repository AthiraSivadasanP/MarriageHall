package com.hall.booking.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hall.booking.model.Employee;
import com.hall.booking.model.LoginUser;
import com.hall.booking.model.MarriageHall;
import com.hall.booking.repository.MarriageHallRepository;
import com.hall.booking.repository.LoginRepository;
import com.hall.booking.repository.MarriageHallRepository;

@Service
public class MarriageHallServiceImpl implements MarriageHallService {

	@Autowired
	private MarriageHallRepository marriageHallRepository;
	@Autowired
	private LoginRepository loginRepository;


	@Override
	public List<MarriageHall> getAllHalls() {
		// TODO Auto-generated method stub
		return marriageHallRepository.findAll();
	}

	@Override
	public void saveHall(MarriageHall hall) {
		this.marriageHallRepository.save(hall);
		
	}

	@Override
	public MarriageHall getMarriageHallById(long id) {
		Optional<MarriageHall> optional = marriageHallRepository.findById(id);
		MarriageHall hall = null;
		if (optional.isPresent()) {
			hall = optional.get();
		} else {
			throw new RuntimeException(" MarriagHall not found for id :: " + id);
		}
		return hall;
	}

	@Override
	public void deleteMarriageHallById(long id) {
		this.marriageHallRepository.deleteById(id);
		
	}

	@Override
	public Page<MarriageHall> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, 100, sort);
		return this.marriageHallRepository.findAll(pageable);
	}

	@Override
	public List<LoginUser> getAllLogins() {
		return loginRepository.findAll();
	}

	 
}
