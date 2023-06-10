package com.lms.university.service.repository;

import com.lms.university.service.model.City;
import com.lms.university.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends BaseRepository<City,Long> {
}
