package org.weblearner.service;

import org.springframework.stereotype.Service;
import org.weblearner.model.Staff;

@Service
public interface StaffService {
	
	public boolean saveRecord(Staff staff);
	
}
