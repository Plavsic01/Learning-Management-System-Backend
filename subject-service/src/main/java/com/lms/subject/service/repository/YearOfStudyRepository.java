package com.lms.subject.service.repository;

import com.lms.subject.service.model.YearOfStudy;
import com.lms.subject.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface YearOfStudyRepository extends BaseRepository<YearOfStudy,Long> {

    List<YearOfStudy> findAllByStudyProgramId(Long studyProgramId);

}
