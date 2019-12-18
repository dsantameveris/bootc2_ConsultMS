package com.everis.ConsultMS.Model;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class BClientProducts
{
    private String id;
    
    private String ruc;

    private String name;

    private Set<CheckAccount> checkaccount;

    private String creditcard;

    private String loan;
}