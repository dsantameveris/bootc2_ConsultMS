package com.everis.ConsultMS.Model;

import com.everis.ConsultMS.Model.Units.PersonalClient;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class PClientProducts
{    
    private PersonalClient client;

    public PClientProducts(PersonalClient client)
    {
        this.client = client;
    }

    //private SavingAccount savingaccount;

    // private CheckAccount checkaccount;

    // private TermAccount termaccount;

    // private CreditCard creditcard;

    // private Loan loan;
}