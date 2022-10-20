package tasks;


import models.CicloDiez;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.CicloDiezPruebaSophos.*;
import static userinterfaces.CicloUnoPruebaSophos.BTN_ENVIAR_CICLO_UNO;

public class IngresarCicloDiezPruebaSophos implements Task {

    private CicloDiez cicloDiez;

    public IngresarCicloDiezPruebaSophos(CicloDiez cicloDiez) {
        this.cicloDiez = cicloDiez;
    }

    public static IngresarCicloDiezPruebaSophos ingresarCicloDiezPruebaSophos(CicloDiez cicloDiez) {
        return Tasks.instrumented(IngresarCicloDiezPruebaSophos.class, cicloDiez);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(cicloDiez.letraV()).into(TEXTAREA_LETRA_CICLO_DIEZ),
                Click.on(BTN_ENVIAR_CICLO_UNO)
        );

    }
}
