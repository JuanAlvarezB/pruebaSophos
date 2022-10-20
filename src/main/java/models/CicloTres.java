package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CicloTres(@JsonProperty("letra") String letra,
                        @JsonProperty("numeroRespuesta") String numeroRespuesta) {

    @Override
    public String letra() {
        return letra.repeat(294);
    }
}
