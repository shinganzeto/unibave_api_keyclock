package br.com.unibave.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @PostMapping
    public String lancar() {
        return "Pedido Realizado";
    }

    @GetMapping
    public String consultar() {
        return "Pedido 123456";
    }

}
