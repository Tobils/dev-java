package com.suhada.spring_jpa;

import java.util.Date;

import com.suhada.spring_jpa.dao.PesertaDao;
import com.suhada.spring_jpa.entity.Peserta;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private PesertaDao pd;

	@Test
	void contextLoads() {
		Peserta p = new Peserta();
		p.setNama("nama");
		p.setEmail("email");
		p.setTanggalLahir(new Date());

		pd.save(p);
		
	}

}
