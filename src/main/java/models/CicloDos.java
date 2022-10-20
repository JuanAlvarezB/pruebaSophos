package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CicloDos(@JsonProperty("fecha") String fecha) {
    @Override
    public String fecha() {
        LocalDateTime hoy = LocalDateTime.now();
        LocalDateTime diasFuturos = hoy.plusDays(48);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        String formattedDateTime = diasFuturos.format(dateTimeFormatter);
        return formattedDateTime;
    }
}
