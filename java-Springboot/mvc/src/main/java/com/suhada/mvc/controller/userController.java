package com.suhada.mvc.controller;
// import com.suhada.mvc.model.namaUser;
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
        user.setNama();
        user.getListNama();
        System.out.println(user);
    }

     @RequestMapping(value="/login", method=RequestMethod.POST)
     public void Login(@RequestParam(value = "nama") String namaParam, @RequestParam(value="password") String password) 
     {
         User userCek = new User();
         userCek.setNama();
         userCek.getListNama();
        //  boolean cariNama = userCek.cekNama(namaParam);
        //  System.out.println(cariNama);
     }
     
}