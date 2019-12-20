package com.everis.ConsultMS.Model.Units;

import lombok.Data;

@Data
public class SavingAccountDTO
{
    private String number;

    private String currency;

    public SavingAccountDTO(String number, String currency)
    {
        this.number = number;
        this.currency = currency;
    }

    //No Idea why but both Saving SavingAccountDTO (from server and client) need a matching constructor (Using no param one).
    public SavingAccountDTO(){};
}