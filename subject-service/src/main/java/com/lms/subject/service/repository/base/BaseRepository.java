package com.lms.subject.service.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface BaseRepository<T,I> extends JpaRepository<T,I> {
    T getById(I id);
}
