package com.suhada.spring_jpa.dao;

import com.suhada.spring_jpa.entity.Materi;
import com.suhada.spring_jpa.entity.Sesi;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SesiDao extends PagingAndSortingRepository<Sesi, String> 
{
    public Page<Sesi> findByMateri(Materi m, Pageable page); 
}