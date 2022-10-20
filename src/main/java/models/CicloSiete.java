package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CicloSiete(@JsonProperty("fechaCicloSiete") String fechaCicloSiete) {

    @Override
    public String fechaCicloSiete() {
        LocalDateTime hoy = LocalDateTime.now();
        LocalDateTime diasFuturos = hoy.plusDays(98);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        String formattedDateTime = diasFuturos.format(dateTimeFormatter);
        return formattedDateTime;
    }
}
