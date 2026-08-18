package br.com.francombbs.service_b;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    public String message() {
        return "Ola! Estou funcionando!";
    }
}
