package dev.nugget.cadastrodeninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class controller {

    @GetMapping("/boasvindas")

    public String boasVindas() {
         return "Ola mundo";
    }
}
