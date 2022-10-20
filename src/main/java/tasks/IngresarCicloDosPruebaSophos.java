package tasks;

import models.CicloDos;
import models.CicloUno;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

import static userinterfaces.CicloDosPruebaSophos.*;
import static userinterfaces.CicloUnoPruebaSophos.BTN_ENVIAR_CICLO_UNO;

public class IngresarCicloDosPruebaSophos implements Task {

    private CicloDos cicloDos;

    public IngresarCicloDosPruebaSophos(CicloDos cicloDos) {
        this.cicloDos = cicloDos;
    }

    public static IngresarCicloDosPruebaSophos ingresarCicloDosPruebaSophos(CicloDos cicloDos) {
        return Tasks.instrumented(IngresarCicloDosPruebaSophos.class, cicloDos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(cicloDos.fecha()).into(INPUT_FECHA),
                Click.on(NUMERO_176),
                Click.on(NUMERO_196),
                Click.on(NUMERO_44),
                Click.on(NUMERO_64),
                Click.on(NUMERO_96),
                Click.on(BTN_ENVIAR_CICLO_UNO)
        );
    }
}
