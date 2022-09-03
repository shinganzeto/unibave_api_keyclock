package br.com.unibave.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boletos")
public class BoletosController {

    @PutMapping
    public String lancar() {
        return "Pago";
    }

    @GetMapping
    public String cancelar() {
        return "Cancelado";
    }
}
