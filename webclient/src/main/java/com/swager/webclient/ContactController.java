package com.swager.webclient;

import java.util.List;

import openapi.api.ContactApiApi;
import openapi.model.Contact;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController(value = "contact")
@RequestMapping("contact")
public class ContactController {
    @Autowired
    private ContactApiApi contactApi;
    @GetMapping()
    public List<Contact> getContacts() {
        var result = contactApi.getAllContacts();
        for (Contact contact : result) {
            System.out.println(contact);
        }
        return result;
    }  
}
