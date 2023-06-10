package com.lms.university.service.repository;

import com.lms.university.service.model.Country;
import com.lms.university.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends BaseRepository<Country,Long> {
}
