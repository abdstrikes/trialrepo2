package org.weblearner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.weblearner.model.Staff;
import org.weblearner.repository.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService{

	@Autowired 
	StaffRepository repository;
		
	public boolean saveRecord(Staff staff) {
		// TODO Auto-generated method stub
		try{
			staff.getSalaryAccount().setStaff(staff);
				repository.save(staff);
				return true;
		}
		catch(Exception e){
			return false;
		}
		
	}

}
