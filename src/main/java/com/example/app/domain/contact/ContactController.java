package com.example.app.domain.contact;

import com.example.app.domain.contact.dtos.CreateContactDTO;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Tag(name = "Contact Controller")
@RestController
@RequestMapping("/contacts")
public class ContactController {

    private ContactService contactService;

    @Autowired
    public ContactController (ContactService contactService){
        this.contactService = contactService;
    }

    @Operation(summary = "Add new contact")
    @ApiResponse(responseCode = "200", description = "It's ok")
    @PostMapping
    public void create(@Valid @RequestBody CreateContactDTO createContactDTO){
        System.out.println("oi");
    }

    @GetMapping
    public void find(){
        System.out.println("oi");
    }
}
