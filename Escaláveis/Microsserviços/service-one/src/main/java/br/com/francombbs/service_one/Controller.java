package br.com.francombbs.service_one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Controller {

    @Value("${message: Não encontrei o valor}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}
