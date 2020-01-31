package com.suhada.spring_jpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name = "m_materi")
public class Materi
{
    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false, unique = true, length = 10)
    private String kode;

    @Column(nullable = false)
    private String nama; 

    @OneToMany(
        cascade = CascadeType.ALL, 
        orphanRemoval = true,
        mappedBy = "materi"
        )
    private List<Sesi> daftarSesi = new ArrayList<>(); 
}