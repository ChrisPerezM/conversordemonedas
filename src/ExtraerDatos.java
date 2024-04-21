import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExtraerDatos {

    Scanner lectura = new Scanner(System.in);

    public void     extraccionDeDatos(String base_code, String target_code, double cantidad) throws IOException {
        double valorFinal = 0;
        System.out.println("Escriba el valor que desea convertir: ");
        cantidad = lectura.nextDouble();
        ConversionDeMoneda conversion = new ConversionDeMoneda();
    Monedas moneda = conversion.conversorDeMonedas(base_code, target_code, cantidad);
        valorFinal = cantidad * moneda.conversion_rate();
        System.out.println("El valor de " + cantidad + " [" + moneda.base_code() +"]" +
                " corresponde al valor final de ---> " + valorFinal + " [" + moneda.target_code() +"]");

        ArchivoMonedas archivo = new ArchivoMonedas();
        archivo.guardarJson(moneda);


    }

}
