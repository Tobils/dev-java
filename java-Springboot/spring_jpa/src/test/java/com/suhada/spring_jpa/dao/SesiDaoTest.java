package com.suhada.spring_jpa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Optional;

import javax.sql.DataSource;

import com.suhada.spring_jpa.dao.PesertaDao;
import com.suhada.spring_jpa.entity.Materi;
import com.suhada.spring_jpa.entity.Peserta;
import com.suhada.spring_jpa.entity.Sesi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.jdbc.Sql;

import junit.framework.Assert;

@SpringBootTest
@Sql
(
    executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD,
    scripts = {"/data/peserta.sql","/materi.sql", "/sesi.sql"}
)
class SesiDaoTest {
	@Autowired
    private SesiDao sd;

     
    @Test
    public void testCariByMateri()
    {
        Materi m = new Materi();
        m.setId("aa6");
        
        PageRequest page = PageRequest.of(0, 5); // 0 -> awal halaaman, 5 -> jumlah query setiap halamannya

        Page<Sesi> hasilQuery = sd.findByMateri(m, page);
        Assert.assertEquals(1L, hasilQuery.getTotalElements());

        Sesi s = hasilQuery.getContent().get(0);
        Assert.assertNotNull(s);
        Assert.assertEquals("Java Fundamental", s.getMateri().getNama());
        
    }
   
}
