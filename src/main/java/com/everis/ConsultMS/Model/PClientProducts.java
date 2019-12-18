package com.everis.ConsultMS.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class PClientProducts
{
    private String id;
    
    private String dni;

    private String name;

    private SavingAccount savingaccount;

    private CheckAccount checkaccount;

    private String termaccount;

    private String creditcard;

    private String loan;
}