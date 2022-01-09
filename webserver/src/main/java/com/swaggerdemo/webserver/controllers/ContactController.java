package com.swaggerdemo.webserver.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.swaggerdemo.webserver.models.Contact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
@Tag(name = "contact api")
@RestController
@RequestMapping("contact")
public class ContactController {

    ConcurrentMap<String,Contact> contacts = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    public Contact getContact(@PathVariable String id){
        return contacts.get(id);
        //return new Contact(Integer.parseInt(id),"Mandar","Kumbre");
    }

    @GetMapping()
    public List<Contact> getAllContacts(){
        return new ArrayList<>(contacts.values()); 
    }

    @PostMapping()
    public Contact addContact(@RequestBody Contact contact) {
        contacts.put(String.valueOf(contact.getId()), contact);
        return contact;
    }
}
