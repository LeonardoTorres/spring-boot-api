package com.example.app.domain.contact;

import com.example.app.domain.contact.dtos.CreateContactDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository){
      this.contactRepository = contactRepository;
    }

    public void create(CreateContactDTO contactDTO){
        this.contactRepository.save(contactDTO.toContact());
    }
}
