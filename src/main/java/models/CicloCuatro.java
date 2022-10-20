package models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CicloCuatro(@JsonProperty("letraZ") String letraZ,
                          @JsonProperty("numeroRespuestaDos") String numeroRespuestaDos) {
    @Override
    public String letraZ() {
        return letraZ.repeat(67);
    }
}
