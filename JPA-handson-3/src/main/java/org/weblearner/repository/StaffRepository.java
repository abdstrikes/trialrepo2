package org.weblearner.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.weblearner.model.Staff;

@Repository
public interface StaffRepository extends CrudRepository<Staff, Integer>{


}
