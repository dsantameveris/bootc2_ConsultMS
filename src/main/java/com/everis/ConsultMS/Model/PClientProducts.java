package com.everis.ConsultMS.Model;

import javax.validation.constraints.NotBlank;

import com.everis.ConsultMS.Model.Units.CreditCardDTO;
import com.everis.ConsultMS.Model.Units.PersonalClient;
import com.everis.ConsultMS.Model.Units.SavingAccountDTO;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class PClientProducts
{   
    @NotBlank 
    private PersonalClient pclient;

    @NotBlank
    private SavingAccountDTO savingaccount;

    @NotBlank
    private CreditCardDTO checkaccount;


    public PClientProducts(PersonalClient pclient)
    {
        this.pclient = pclient;
    }

    // public PClientProducts(PersonalClient client, SavingAccountDTO savingaccount)
    // {
    //     this.client = client;
    //     this.savingaccount = savingaccount;
    // }

    //private SavingAccount savingaccount;

    // private CheckAccount checkaccount;

    // private TermAccount termaccount;

    // private CreditCard creditcard;

    // private Loan loan;
}