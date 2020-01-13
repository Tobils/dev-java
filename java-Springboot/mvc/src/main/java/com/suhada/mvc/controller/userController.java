package com.suhada.mvc.controller;
import com.suhada.mvc.model.namaUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class userController
{

    /**
     * method dataUser menerima vpost data dari client berupa :
     * @param namaDepan nama depan
     * @param namaTengah nama tengah
     * @param namaBelakang nama belakang
     * @return objek User dengan @param
     */
    @RequestMapping(value="/user", method=RequestMethod.POST)
    public void dataUser(@RequestParam(value = "namaDepan", defaultValue = "ade") String namaDepan, @RequestParam(value = "namaTengah", defaultValue = "suhada") String namaTengah, @RequestParam(value = "namaBelakang", defaultValue = "asfa") String namaBelakang)
    {
        User user =  new User(namaDepan, namaTengah, namaBelakang);
        System.out.println(user);
    }

    @RequestMapping(value="/user", method=RequestMethod.GET)
    public void getUser() 
    {
        String data_user = "man Jadda wa jada ";
        System.out.println(data_user);
    }


    @RequestMapping(value="/namaUser", method=RequestMethod.POST)
    public void reqPostNama(@RequestParam(value="namaUser", defaultValue="suhada") String paramNama) 
    {
        System.out.println("/namaUser");
        System.out.println(paramNama);
    }
}