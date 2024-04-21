import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.text.SimpleDateFormat;
import java.time.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ArchivoMonedas {

    String fecha = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE);
    public void guardarJson(Monedas moneda) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create().newBuilder().create();
        FileWriter escritura = new FileWriter( fecha +".json");
        escritura.write(gson.toJson(moneda));
        escritura.close();
    }
}
