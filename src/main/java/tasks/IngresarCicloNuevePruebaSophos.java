package tasks;

import models.CicloDos;
import models.CicloNueve;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.CicloNuevePruebaSophos.*;
import static userinterfaces.CicloUnoPruebaSophos.BTN_ENVIAR_CICLO_UNO;

public class IngresarCicloNuevePruebaSophos implements Task {

    private CicloNueve cicloNueve;

    public IngresarCicloNuevePruebaSophos(CicloNueve cicloNueve) {
        this.cicloNueve = cicloNueve;
    }

    public static IngresarCicloNuevePruebaSophos ingresarCicloNuevePruebaSophos(CicloNueve cicloNueve) {
        return Tasks.instrumented(IngresarCicloNuevePruebaSophos.class, cicloNueve);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(cicloNueve.fechaCicloNueve()).into(FECHA_CICLO_NUEVE),
                Click.on(INPUT_CICLO_NUEVE),
                Click.on(BTN_ENVIAR_CICLO_UNO)
        );
    }
}
