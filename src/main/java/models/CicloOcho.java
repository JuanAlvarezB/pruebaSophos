package models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CicloOcho(@JsonProperty("letraM") String letraM) {

    @Override
    public String letraM() {
        return letraM.repeat(471);
    }
}
