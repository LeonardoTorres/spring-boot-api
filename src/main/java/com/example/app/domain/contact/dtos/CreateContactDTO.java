package com.example.app.domain.contact.dtos;

import com.example.app.domain.contact.Contact;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class CreateContactDTO {

    @Email(message = "{email.invalid}")
    private String email;
    @NotBlank
    private String phoneNumber;

    public Contact toContact(){
        return new Contact(email, phoneNumber);
    }
}
