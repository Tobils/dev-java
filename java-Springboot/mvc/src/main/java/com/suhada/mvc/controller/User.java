package com.suhada.mvc.controller;

public class User
{
    private String namaDepan;
    private String namaTengah;
    private String namaBelakang;

    public User(String namaDepan, String namaTengah, String namaBelakang)
    {
        this.namaDepan = namaDepan;
        this.namaTengah = namaTengah;
        this.namaBelakang = namaBelakang;
    }

    public User(User objek2)
    {
        this.namaDepan = objek2.namaDepan;
        this.namaTengah = objek2.namaTengah;
        this.namaBelakang = objek2.namaBelakang;
    }

    public String getNamaDepan()
    {
        return namaDepan;
    }

    public String getNamaTengah()
    {
        return namaTengah;
    }

    public String getNamaBelakang()
    {
        return namaBelakang;
    }

    public String getNama()
    {
        return namaDepan + namaTengah + namaBelakang;
    }

    public String toString()
    {
        String str = "Data nama : \n \t Nama Depan \t : " + namaDepan + "\n \t Nama Tengah \t : " + namaTengah + "\n \t Nama Belakang \t : " + namaBelakang;
        return str;
    }
}