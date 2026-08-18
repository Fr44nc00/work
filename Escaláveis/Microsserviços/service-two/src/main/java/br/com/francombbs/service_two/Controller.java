package br.com.francombbs.service_two;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${message: Não encontrei o valor}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}
