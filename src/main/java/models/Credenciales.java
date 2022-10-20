package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Credenciales(@JsonProperty("user") String user,
                           @JsonProperty("password") String password) {
}
