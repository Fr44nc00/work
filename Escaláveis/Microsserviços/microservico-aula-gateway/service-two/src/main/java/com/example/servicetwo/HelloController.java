package com.example.servicetwo;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    @Value("${message:Olá do service-two (config server indisponível)}")
//    private String message;

    @GetMapping("/message")
    public String message() {
        return "EU SOU O SERVICO 2";
    }

    @PostMapping("/message")
    public String postMethodName(@RequestBody String entity) {
        return entity;
    }
}