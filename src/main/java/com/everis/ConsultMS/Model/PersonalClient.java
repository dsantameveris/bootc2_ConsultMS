package com.everis.ConsultMS.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class PersonalClient
{
    private String dni;

    private String name;
}
