package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.CicloDiezPruebaSophos.TEXT_VALIDAR;

public class ValidarTextoPruebaSophos implements Question<Boolean> {

    private String textoRespuesta;

    public ValidarTextoPruebaSophos(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }

    public static ValidarTextoPruebaSophos validarTextoPruebaSophos(String textoRespuesta) {

        return new ValidarTextoPruebaSophos(textoRespuesta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String ObtenerTexto = BrowseTheWeb.as(actor).find(TEXT_VALIDAR).getText().trim();
        if (textoRespuesta.equals(ObtenerTexto)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

