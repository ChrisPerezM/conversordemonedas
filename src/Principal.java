import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        int opcion = 0;

        Scanner lectura = new Scanner(System.in);

        while(opcion != 7){
            Menu menu = new Menu();
            menu.imprimirMenu();
            opcion = lectura.nextInt();

            double cantidad = 0;
            switch (opcion) {
                case 1:
                    ExtraerDatos dolar = new ExtraerDatos();
                    dolar.extraccionDeDatos( "USD", "ARS",cantidad);
                    break;

                case 2:
                    ExtraerDatos pesoArgentino = new ExtraerDatos();
                    pesoArgentino.extraccionDeDatos( "ARS", "USD",cantidad);
                    break;

                case 3:
                    ExtraerDatos dolarAReal = new ExtraerDatos();
                    dolarAReal.extraccionDeDatos( "USD", "BRL",cantidad);
                    break;

                case 4:
                    ExtraerDatos realADolar = new ExtraerDatos();
                    realADolar.extraccionDeDatos( "BRL", "USD",cantidad);
                    break;

                case 5:
                    ExtraerDatos  dolarAColombia= new ExtraerDatos();
                    dolarAColombia.extraccionDeDatos( "USD", "COP",cantidad);
                    break;

                case 6:
                    ExtraerDatos colombiaADolar = new ExtraerDatos();
                    colombiaADolar.extraccionDeDatos( "COP", "USD",cantidad);
                    break;

                case 7:
                    System.out.println("Finalizando la aplicacion de conversión gracias por usar nuestros servicios.");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }


    }
}
