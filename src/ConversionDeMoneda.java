import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversionDeMoneda {

    public Monedas conversorDeMonedas(String conversion, String convertido,double cantidadCambio) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/8409015d7b4becdaae45350d/pair/" + conversion + "/" + convertido + "/" + cantidadCambio);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();


        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre esa moneda");
        }

    }
}
