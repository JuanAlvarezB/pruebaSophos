package tasks;

import models.CicloCinco;
import models.CicloCuatro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;

import static userinterfaces.CicloCincoPruebaSophos.*;
import static userinterfaces.CicloUnoPruebaSophos.*;


public class IngresarCicloCincoPruebaSophos implements Task {
    CicloCinco cicloCinco;

    public IngresarCicloCincoPruebaSophos(CicloCinco cicloCinco) {
        this.cicloCinco = cicloCinco;
    }

    public static IngresarCicloCincoPruebaSophos ingresarCicloCincoPruebaSophos(CicloCinco cicloCinco) {
        return Tasks.instrumented(IngresarCicloCincoPruebaSophos.class, cicloCinco);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(cicloCinco.numeroSecuencia()).into(INPUT_RESPUESTA),
                Select.option(cicloCinco.selectCicloCinco()).from(SELECT_RESPUESTA_CICLO_CINCO),
                Click.on(BTN_ENVIAR_CICLO_UNO)
        );
    }
}
