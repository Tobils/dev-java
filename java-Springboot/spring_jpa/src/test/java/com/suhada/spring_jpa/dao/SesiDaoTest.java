package com.suhada.spring_jpa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Optional;

import javax.sql.DataSource;

import com.suhada.spring_jpa.dao.PesertaDao;
import com.suhada.spring_jpa.entity.Peserta;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import junit.framework.Assert;

@SpringBootTest
@Sql
(
    executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD,
    scripts = {"/data/peserta.sql", "/data/materi.sql", "/data/sesi.sql"}
)
class SesiDaoTest {
	@Autowired
    private PesertaDao pd;
    
    @Autowired
    private DataSource ds;

    @Test
    public void cariIdByMateri()
    {
        System.out.println("ok");
    }

	
}

/**
 * @Test
    void testInsert() throws SQLException
    {
		Peserta p = new Peserta();
		p.setNama("Peserta 001");
		p.setEmail("Peserta001@gmail.com");
		p.setTanggalLahir(new Date());
        pd.save(p);	
        
        String sql =  "select count(*) as jumlah from peserta where email='Peserta001@gmail.com';"; 
        Connection c = ds.getConnection();
        ResultSet rs = c.createStatement().executeQuery(sql);
        Assert.assertTrue(rs.next());

        Long jumlahRow = rs.getLong("jumlah");
        Assert.assertEquals(1L, jumlahRow.longValue());
    }
    
    @AfterEach
    public void hapusData() throws SQLException
    {
        String sql = "delete from peserta where email='Peserta001@gmail.com';";
        Connection c = ds.getConnection();
        c.createStatement().executeUpdate(sql);
        System.out.println("after is executed !");
    }

    @Test
    public void testHitung()
    {
        Long jumlah = pd.count();
        Assert.assertEquals(3L, jumlah.longValue());
    }

    @Test
    public void testCariById()
    {
        Optional<Peserta> p = pd.findById("aa1");
        Assert.assertNotNull(p);
        Assert.assertEquals("Peserta Test 001", p.get().getNama());
        Assert.assertEquals("peserta.test.001@gmail.com", p.get().getEmail());

        Optional<Peserta> px = pd.findById("id");
        Assert.assertNotNull(px);
    }
 */
