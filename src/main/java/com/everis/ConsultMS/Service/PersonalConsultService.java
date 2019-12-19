package com.everis.ConsultMS.Service;

import com.everis.ConsultMS.Model.PClientProducts;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalConsultService
{
    //Get all Personal Clients and their Products
    public Flux<PClientProducts> getAllClientsProducts();

    //Get Personal client and his/her products by dni
    public Mono<PClientProducts> getClientProductsByDNI(String dni);
}