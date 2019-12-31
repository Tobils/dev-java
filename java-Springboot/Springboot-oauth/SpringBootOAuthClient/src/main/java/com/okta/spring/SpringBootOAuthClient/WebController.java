package com.okta.spring.SpringBootOAuthClient;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.Principal;

@Controller
public class WebController {
    public static final Logger LOG = LoggerFactory.getLogger(WebController.class);
    @RequestMapping("/ecuredPage")
    public String securedpage(Model model, Principal principal)
    {
        LOG.info(">>>>>>>>>>>> secured Page");
        return "securedPage";
    }

    @RequestMapping("/")
    public String index(Model model, Principal principal)
    {
        LOG.info(">>>>>>>>>>>>>>>>> Index");
        return "index";
    }

    @RequestMapping("/errorPage")
    public String error(Model kodel, Principal principal)
    {
        LOG.info(">>>>>>>>>>> error page");
        return "error";
    }
}
