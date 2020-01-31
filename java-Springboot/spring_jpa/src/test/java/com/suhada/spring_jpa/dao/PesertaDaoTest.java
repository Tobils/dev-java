package com.suhada.spring_jpa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.sql.DataSource;

import com.suhada.spring_jpa.entity.Peserta;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PesertaDaoTest 
{
    @Autowired
    private PesertaDao pd;

    @Autowired
    private DataSource ds ;

    @Test
    public void testInsert() throws SQLException
    {
        Peserta p = new Peserta();
        p.setNama("Peserta 001");
        p.setEmail("Peserta001@gmail.com");
        p.setTanggalLahir(new Date());

        pd.save(p);

        // String sql =  "select count(*) as jumlah"
        //             + "from peserta "
        //             + "where email = 'Peserta001@gmail.com'";
        
        // Connection c = ds.getConnection();
        // ResultSet  rs = c.createStatement().executeQuery(sql);
        
        // Long jumlah = rs.getLong("jumlah");
        // System.out.println(jumlah);

        // c.close();
    }


    public void hapusData()
    {
        String sql = "delete from peserta where email ='Peserta001@gmail.com'";

    }
}