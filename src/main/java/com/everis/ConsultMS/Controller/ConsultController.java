package com.everis.ConsultMS.Controller;

import com.everis.ConsultMS.Model.PClientProducts;
import com.everis.ConsultMS.Model.Units.CheckAccountDTO;
import com.everis.ConsultMS.Model.Units.CreditCardDTO;
import com.everis.ConsultMS.Model.Units.PersonalClient;
import com.everis.ConsultMS.Model.Units.SavingAccountDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/pclients")
public class ConsultController {

    //Get All Personal Clients and Products
    @GetMapping(("/clientproducts/all"))
    public Flux<PClientProducts> getPersonalClientProducts() {
        
        return WebClient.create("http://localhost:8011/pclients/alldto")
                        .get()
                        .retrieve()
                        .bodyToFlux(PersonalClient.class)
                        .map(pclient -> 
                        {
                            return new PClientProducts(pclient);
                        })
                        .flatMap(pclient -> 
                        {
                            return WebClient.create("http://localhost:8013/savingacc/ownerdto/")
                                        .get()
                                        .uri("/{dni}", pclient.getPclient().getDni())
                                        .retrieve()
                                        .bodyToMono(SavingAccountDTO.class)
                                        .map(sa -> 
                                        {
                                            pclient.setSavingaccount(sa);
                                            return pclient;
                                        });                    
                        })
                        .flatMap(pclient -> 
                        {
                            return WebClient.create("http://localhost:8017/creditcard/ownerdto/")
                                        .get()
                                        .uri("/{dni}", pclient.getPclient().getDni())
                                        .retrieve()
                                        .bodyToMono(CreditCardDTO.class)
                                        .map(cc -> 
                                        {
                                            pclient.setCreditcard(cc);
                                            return pclient;
                                        });  
                        });
                        // .flatMap(pclient -> 
                        // {
                        //     return WebClient.create("http://localhost:8014/checkacc/ownerdto/")
                        //                 .get()
                        //                 .uri("/{dni}", pclient.getPclient().getDni())
                        //                 .retrieve()
                        //                 .bodyToMono(CheckAccountDTO.class)
                        //                 .map(ca -> 
                        //                 {
                        //                     pclient.setCheckaccount(ca);
                        //                     return pclient;
                        //                 });  
                        // });     
    }

    // @GetMapping("/testing/{dni}")
    // public Mono<SavingAccountDTO> getPersonalClientProducts(@PathVariable String dni)
    // {
    //     return WebClient.create("http://localhost:8013/savingacc/ownerdto/")
    //                         .get()
    //                         .uri("/{dni}", dni)
    //                         .retrieve()
    //                         .bodyToMono(SavingAccountDTO.class);
    // }

    // @GetMapping("/testing/{message}")
    // public Mono<String> testinguri(@PathVariable String message)
    // {
    //     return WebClient.create("http://localhost:8013/savingacc/ownerdto/ltest")
    //                         .get()
    //                         .uri("/{message}", message)
    //                         .retrieve()
    //                         .bodyToMono(String.class);
    // }
    

    // //Get Personal Client and Products by Dni
    // @GetMapping("/clientproductos/{dni}")


}