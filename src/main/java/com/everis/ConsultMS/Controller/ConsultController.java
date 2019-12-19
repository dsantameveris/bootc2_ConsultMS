package com.everis.ConsultMS.Controller;

import com.everis.ConsultMS.Model.PClientProducts;
import com.everis.ConsultMS.Model.Units.PersonalClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/pclients")
public class ConsultController {

    @GetMapping("/test")
    public String testing()
    {
        return "TestComplete!";
    }

    // //Get All Personal Clients and Products
    // @GetMapping(("/clientproducts/all"))
    // public Flux<PClientProducts> getPersonalClientProducts() {
        
    //     WebClient allclients = WebClient.create("http://localhost:8011/pclients/alldto");
    //     return allclients.get()
    //             .retrieve()
    //             .bodyToFlux(PersonalClient.class)
    //             .map(c -> 
    //             {
    //                 WebClient saveaccountcall = WebClient.create(baseUrl);
    //                 return new PClientProducts(c);
                    
    //             });           
    // }
    

    // //Get Personal Client and Products by Dni
    // @GetMapping("/clientproductos/{dni}")


}