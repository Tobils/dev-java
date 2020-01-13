package com.suhada.mvc.controller;

import java.util.*;

public class User
{
    private String namaDepan;
    private String namaTengah;
    private String namaBelakang;
    private List<String> listNama = new ArrayList<String>();

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

    public User()
    {
        namaDepan = "";
        namaTengah = "";
        namaBelakang = "";
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

        /**
     * this methode is used to set al the name list, before I use datase method.
     * @return list of name
     */
    public boolean setNama()
    {
        try{
            listNama.add("ade");
            listNama.add("suhada");
            listNama.add("frika");
            listNama.add("atrika");
            listNama.add("fira");
            listNama.add("aisyah");
            listNama.add("asfa");
            listNama.add("afsa");
            System.out.println(listNama);
        } catch(Error e)
        {
            System.out.println(e);
        }
        return true;
    }

    public boolean getListNama()
    {
        boolean status = false;
        
        
        if(listNama != null)
        {
            System.out.println(listNama);    
        }

        return status;
    }
}