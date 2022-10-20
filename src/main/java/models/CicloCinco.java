package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CicloCinco(@JsonProperty("selectCicloCinco") String selectCicloCinco,
                         @JsonProperty("numeroSecuencia") String numeroSecuencia) {
}
