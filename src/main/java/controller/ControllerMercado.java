package controller;


import Dominio.Mercado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ServiceDeMercado;

@RestController
public class ControllerMercado {



    private final ServiceDeMercado serviceDeMercado;


    public ControllerMercado(ServiceDeMercado serviceDeMercado) {
        this.serviceDeMercado = serviceDeMercado;
    }



    @GetMapping("/encontrarMercadoMaisProximo")
    public Mercado encontrarMercadoMaisProximo(@RequestParam String endereco) {
        return serviceDeMercado.encontrarMercadoMaisProximo(endereco);
    }
}
