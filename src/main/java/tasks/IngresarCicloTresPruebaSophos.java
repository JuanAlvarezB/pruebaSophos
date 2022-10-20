package tasks;

import models.CicloDos;
import models.CicloTres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.CicloTresPruebaSophos.*;
import static userinterfaces.CicloUnoPruebaSophos.BTN_ENVIAR_CICLO_UNO;

public class IngresarCicloTresPruebaSophos implements Task {

    private CicloTres cicloTres;

    public IngresarCicloTresPruebaSophos(CicloTres cicloTres) {
        this.cicloTres = cicloTres;
    }

    public static IngresarCicloTresPruebaSophos ingresarCicloTresPruebaSophos(CicloTres cicloTres) {
        return Tasks.instrumented(IngresarCicloTresPruebaSophos.class, cicloTres);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(cicloTres.letra()).into(ESCRIBIR_LETRA_R),
                Enter.theValue(cicloTres.numeroRespuesta()).into(INPUT_CISNE),
                Click.on(BTN_ENVIAR_CICLO_UNO)
        );
    }
}
