import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversion {
@SerializedName("base_code")
    private String baseCode;
@SerializedName("target_code")
    private String targetCode;
    private double monto;
    @SerializedName("conversion_result")
    private double resultado;

    public Conversion() {
    }

    public Conversion(String baseCode, String targetCode, double monto) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.monto = monto;
    }


    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Conversion convertir(String codBase, String codFin, int monto) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/6c8c431b284fad5c38102308/pair/"
                +codBase+"/"+codFin+"/"+monto);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Conversion conversion = new Gson().fromJson(response.body(), Conversion.class);

        // Asigna el valor convertido a la propiedad correspondiente


        return conversion;



    }

    @Override
    public String toString() {
        return
                " son , " + resultado +" "+
                targetCode;
    }
}
