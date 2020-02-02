package com.suhada.spring_jpa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Sesi
{
    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Temporal(TemporalType.DATE)
    private Date mulai;

    @Temporal(TemporalType.DATE)
    private Date sampai;

    @ManyToOne
    @JoinColumn(name = "id_materi", nullable = false) // mandatory alias harus ada
    private Materi materi;

    @ManyToMany
    @JoinTable(
        name = "peserta_pelatihan",
        joinColumns = @JoinColumn(name = "id_sesi"),
        inverseJoinColumns = @JoinColumn(name = "id_peserta")
        )
    private List<Peserta> daftarPeserta = new ArrayList<Peserta>();


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getMulai() {
        return this.mulai;
    }

    public void setMulai(Date mulai) {
        this.mulai = mulai;
    }

    public Date getSampai() {
        return this.sampai;
    }

    public void setSampai(Date sampai) {
        this.sampai = sampai;
    }

    public Materi getMateri() {
        return this.materi;
    }

    public void setMateri(Materi materi) {
        this.materi = materi;
    }

    public List<Peserta> getDaftarPeserta() {
        return this.daftarPeserta;
    }

    public void setDaftarPeserta(List<Peserta> daftarPeserta) {
        this.daftarPeserta = daftarPeserta;
    }

}