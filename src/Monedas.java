import java.time.*;

public record Monedas(String base_code,
                        String target_code,
                        double cantidad,
                        double conversion_rate,
                      double conversion_result) {
}
