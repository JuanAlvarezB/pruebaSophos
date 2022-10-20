package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CicloDiez(@JsonProperty("letraV") String letraV) {
    @Override
    public String letraV() {
        return letraV.repeat(368);
    }
}
