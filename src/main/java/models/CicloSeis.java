package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CicloSeis(@JsonProperty("fechaCicloSeis") String fechaCicloSeis) {
    @Override
    public String fechaCicloSeis() {
        LocalDateTime hoy = LocalDateTime.now();
        LocalDateTime diasPasado = hoy.minusDays(92);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        String formattedDateTime = diasPasado.format(dateTimeFormatter);
        return formattedDateTime;
    }
}
