package service;

import Dominio.Mercado;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

public class ServiceDeMercado {


    @Value("${google.maps.api.key}")
    private String chaveApiGoogleMaps;

    private final RestTemplate restTemplate;



    public ServiceDeMercado(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Mercado encontrarMercadoMaisProximo(String endereco) {
        String apiUrl = "https://maps.googleapis.com/maps/api/place/textsearch/json" +
                "?query=mercado" +
                "&locationbias=circle:5000@" + endereco +
                "&key=" + chaveApiGoogleMaps;

        Mercado[] mercados = restTemplate.getForObject(apiUrl, Mercado[].class);

        if (mercados != null && mercados.length > 0) {
            return mercados[0];
        }

        return null;
    }
}
