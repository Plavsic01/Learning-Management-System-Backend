package com.lms.university.service.repository;

import com.lms.university.service.model.Address;
import com.lms.university.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends BaseRepository<Address,Long> {
}
