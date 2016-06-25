package com.bigxodus.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@RestController
@RequestMapping(value = "/monitor")
public class L7checkController {
    @RequestMapping(value = "/l7check", method = RequestMethod.GET)
    public String monitor() {
        return "Ok";
    }
}

