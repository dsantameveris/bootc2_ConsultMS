package com.everis.ConsultMS.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class PClientProducts
{    
    private PersonalClient client;

    private SavingAccount savingaccount;

    // private CheckAccount checkaccount;

    // private TermAccount termaccount;

    // private CreditCard creditcard;

    // private Loan loan;
}