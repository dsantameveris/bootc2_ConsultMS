// package com.everis.ConsultMS.Service.Impl;

// import com.everis.ConsultMS.Model.PClientProducts;
// import com.everis.ConsultMS.Service.PersonalConsultService;

// import org.springframework.web.reactive.function.client.WebClient;

// import reactor.core.publisher.Flux;
// import reactor.core.publisher.Mono;

// public class PersonalConsultServiceImpl implements PersonalConsultService {

//     @Override
//     public Flux<PClientProducts> getAllClientsProducts() {

//     //This line creates a webclient(I think it is like a handler to retrieve info from another service) pointing to given URI
//     WebClient pclient = WebClient.create("http://localhost:8011/pclients/all");
//     pclient.get()                                             //.Get() method is declared to 'fetch' data from given URI.
//             .retrieve()                                     //.Retrieve() gets all data from ".get()"
//             .bodyToFlux(PClientProducts.class);           //.Bodyto... change data back to Mono/Flux<classname.class>.    

//     }

//     @Override
//     public Mono<PClientProducts> getClientProductsByDNI(String dni) {
//     //This line creates a webclient(I think it is like a handler to retrieve info from another service) pointing to given URI
//     WebClient client = WebClient.create("http://localhost:8012/hello");

//     //.Get() method is declared to 'fetch' data from given URI.
//     //.Retrieve() gets all data from ".get()"
//     //.BodytoMono change data back to Mono<here your class>.
//     return client.get()
//                     .retrieve()
//                     .bodyToMono(String.class);
//     }

// }