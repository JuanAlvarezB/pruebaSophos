package tasks;

import models.CicloDos;
import models.CicloOcho;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.CicloOchoPruebaSophos.*;
import static userinterfaces.CicloUnoPruebaSophos.BTN_ENVIAR_CICLO_UNO;

public class IngresarCicloOchoPruebaSophos implements Task {

    private CicloOcho cicloOcho;

    public IngresarCicloOchoPruebaSophos(CicloOcho cicloOcho) {
        this.cicloOcho = cicloOcho;
    }

    public static IngresarCicloOchoPruebaSophos ingresarCicloOchoPruebaSophos(CicloOcho cicloOcho) {
        return Tasks.instrumented(IngresarCicloOchoPruebaSophos.class, cicloOcho);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(cicloOcho.letraM()).into(TEXTAREA_CICLO_OCHO),
                Click.on(NUMERO_195),
                Click.on(NUMERO_35),
                Click.on(BTN_ENVIAR_CICLO_UNO));
    }
}
