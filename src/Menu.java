public class Menu {
     String menu = """
            **********************************************
            Sea bienvenido(a) al conversor de monedas \n
            1) Dólar -----> Peso argentino
            2) Peso argentino -----> Dólar
            3) Dólar -----> Real brasileño
            4) Real brasileño -----> Dólar
            5) Dólar ----> Peso colombiano
            6) Peso colombiano ----> Dólar
            7) Salir
            Elija una opción válida:
            **********************************************
            """;

    public void imprimirMenu(){
        System.out.println(menu);
    }
}
