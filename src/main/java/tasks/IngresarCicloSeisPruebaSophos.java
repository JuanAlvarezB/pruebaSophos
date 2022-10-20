package tasks;

import models.CicloDos;
import models.CicloSeis;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.CicloSeisPruebasSophos.*;
import static userinterfaces.CicloUnoPruebaSophos.BTN_ENVIAR_CICLO_UNO;

public class IngresarCicloSeisPruebaSophos implements Task {

    private CicloSeis cicloSeis;

    public IngresarCicloSeisPruebaSophos(CicloSeis cicloSeis) {
        this.cicloSeis = cicloSeis;
    }

    public static IngresarCicloSeisPruebaSophos ingresarCicloSeisPruebaSophos(CicloSeis cicloSeis) {
        return Tasks.instrumented(IngresarCicloSeisPruebaSophos.class, cicloSeis);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(cicloSeis.fechaCicloSeis()).into(INPUT_FECHA_CICLO_SEIS),
                Click.on(INPUT_NUMERO_105),
                Click.on(BTN_ENVIAR_CICLO_UNO)
        );
    }
}