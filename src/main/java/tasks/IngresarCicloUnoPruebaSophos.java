package tasks;

import models.CicloUno;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;

import static userinterfaces.CicloUnoPruebaSophos.*;

public class IngresarCicloUnoPruebaSophos implements Task {

    private CicloUno cicloUno;

    public IngresarCicloUnoPruebaSophos(CicloUno cicloUno) {
        this.cicloUno = cicloUno;
    }

    public static IngresarCicloUnoPruebaSophos ingresarCicloUnoPruebaSophos(CicloUno cicloUno) {
        return Tasks.instrumented(IngresarCicloUnoPruebaSophos.class, cicloUno);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_NUMBERO_66),
                Select.option(cicloUno.respuesta()).from(SELECT_RESPUESTA),
                Click.on(BTN_ENVIAR_CICLO_UNO)
        );
    }
}
