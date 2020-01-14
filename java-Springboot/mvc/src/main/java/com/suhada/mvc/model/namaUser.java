package com.suhada.mvc.model;

import java.util.*;

public class namaUser
{
    private String nama;
    private List<String> listNama = new ArrayList<String>();

    public namaUser(String nama)
    {
        this.nama = nama;
    }

    /**
     * this methode is used to set al the name list, before I use datase method. 
     * @return list of name
     */
    public List<String> setNama()
    {
        listNama.add("ade");
        listNama.add("suhada");
        listNama.add("frika");
        listNama.add("atrika");
        listNama.add("fira");
        listNama.add("aisyah");
        listNama.add("asfa");
        listNama.add("afsa");
        return listNama;
    }


    public boolean getNama()
    {
        System.out.println(nama);
        boolean status = false;
        if(listNama != null)
        {
            System.out.println(listNama);    
        }
        return status;
    }
}