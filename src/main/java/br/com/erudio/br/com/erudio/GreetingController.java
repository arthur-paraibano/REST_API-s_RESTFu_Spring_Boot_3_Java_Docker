package br.com.erudio.br.com.erudio;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    public static final String template = "Hello, %s!";
}
