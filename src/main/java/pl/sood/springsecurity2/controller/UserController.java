package pl.sood.springsecurity2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sood.springsecurity2.repository.AppUserRepo;

import java.security.Principal;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

     public  AppUserRepo appUserRepo;

    @Autowired
    public UserController(AppUserRepo appUserRepo) {

        this.appUserRepo = appUserRepo;
    }

    @GetMapping("/login")
    public Principal user(Principal user) {
        return user;
    }


}
