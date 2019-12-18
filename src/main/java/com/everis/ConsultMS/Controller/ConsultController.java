package com.everis.PersonalClientMS.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/pclients")
public class PersonalClientClientController {

    
    //Get All Personal Clients and Products
    @GetMapping(("/clientproducts/all"))
    public Flux<> getMethodName(@RequestParam String param) {

            //This line creates a webclient(I think it is like a handler to retrieve info from another service) pointing to given URI
    WebClient client = WebClient.create("http://localhost:8012/hello");

    //.Get() method is declared to 'fetch' data from given URI.
    //.Retrieve() gets all data from ".get()"
    //.BodytoMono change data back to Mono<here your class>.
    return client.get()
                    .retrieve()
                    .bodyToMono(String.class);  
    }
    

    //Get Personal Client and Products by Dni
    @GetMapping("/clientproductos/{dni}")


}