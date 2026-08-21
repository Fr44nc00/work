package com.example.serviceone;

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    @Value("${message:Olá do service-one (config server indisponível)}")
//    private String message;
//
//    @GetMapping("/message")
//    public String message() {
//        return message;
//    }

    private final ServiceTwoClient serviceTwoClient;
    public HelloController(ServiceTwoClient serviceTwoClient) {
        this.serviceTwoClient = serviceTwoClient;
    }

    @GetMapping("/")
    public String call() {
        return "ME CHAMOU !!!!!";
    }

    @GetMapping("/call-service-two")
    public String callServiceTwo() {
        String respostaServico2 = this.serviceTwoClient.getMessage();
        return "SERVICO 2 RETORNOU: " + respostaServico2;
    }

    @PostMapping("/call-service-two")
    public String callPostServiceTwo(@RequestBody String texto) {
        String responseServiceTwoPost = this.serviceTwoClient.postMessage(texto);
        return responseServiceTwoPost;
    }
}
