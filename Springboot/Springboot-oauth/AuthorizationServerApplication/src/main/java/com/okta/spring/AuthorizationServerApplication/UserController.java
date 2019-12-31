package com.okta.spring.AuthorizationServerApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


@RestController
public class UserController {
    public static final Logger LOG = LoggerFactory.getLogger(UserController.class);
    @GetMapping("/user/me")
    public Principal user(Principal principal) {
        LOG.info("/user/me");
        LOG.info(principal.toString());
        return principal;
    }
}