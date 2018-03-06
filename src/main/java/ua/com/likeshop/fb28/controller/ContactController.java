package ua.com.likeshop.fb28.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.com.likeshop.fb28.entity.Contact;
import ua.com.likeshop.fb28.repository.ContactRepository;

import java.util.List;


@RestController
public class ContactController {
    @Autowired
    ContactRepository contactRepository;


//    @GetMapping(path="/contact") // Map ONLY GET Requests
//    public @ResponseBody String addNewUser (@RequestParam String firstName
//            , @RequestParam String email) {
//        // @ResponseBody means the returned String is the response, not a view name
//        // @RequestParam means it is a parameter from the GET or POST request
//
//        Contact n = new Contact();
//        n.setfirstName(firstName);
//        n.setEmail(email);
//        contactRepository.save(n);
//        return "Saved";
//    }

//    @GetMapping("/contacts")
//    public Iterable<Contact> list2() {
//        return contactRepository.findAll();
//    }

    @PostMapping ("/contacts")
    public String saveContact(@RequestBody Contact mes){
        contactRepository.save(mes);
        return "save";
    }

    }

