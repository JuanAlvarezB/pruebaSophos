package tasks;

import models.CicloDos;
import models.CicloSiete;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;

import static userinterfaces.CicloCincoPruebaSophos.SELECT_RESPUESTA_CICLO_CINCO;
import static userinterfaces.CicloSietePruebaSophos.*;
import static userinterfaces.CicloUnoPruebaSophos.BTN_ENVIAR_CICLO_UNO;

public class IngresarCicloSietePruebaSophos implements Task {
    private CicloSiete cicloSiete;

    public IngresarCicloSietePruebaSophos(CicloSiete cicloSiete) {
        this.cicloSiete = cicloSiete;
    }

    public static IngresarCicloSietePruebaSophos ingresarCicloSietePruebaSophos(CicloSiete cicloSiete) {
        return Tasks.instrumented(IngresarCicloSietePruebaSophos.class, cicloSiete);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(cicloSiete.fechaCicloSiete()).into(SELECT_CICLO_SIETE),
                Click.on(INPUT_NUMBERO_95),
                Click.on(INPUT_NUMBERO_130),
                Click.on(INPUT_NUMBERO_125),
                Click.on(INPUT_NUMBERO_60),
                Click.on(BTN_ENVIAR_CICLO_UNO)
        );
    }
}
