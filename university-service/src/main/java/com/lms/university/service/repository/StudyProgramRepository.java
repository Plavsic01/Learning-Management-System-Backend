package com.lms.university.service.repository;

import com.lms.university.service.model.StudyProgram;
import com.lms.university.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyProgramRepository extends BaseRepository<StudyProgram,Long> {
    List<StudyProgram> findAllByFacultyId(Long id);
}
