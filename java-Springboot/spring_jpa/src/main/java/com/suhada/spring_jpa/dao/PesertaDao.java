package com.suhada.spring_jpa.dao;

import com.suhada.spring_jpa.entity.Peserta;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PesertaDao extends PagingAndSortingRepository<Peserta, String>{  }