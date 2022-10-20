package tasks;

import models.CicloCuatro;
import models.CicloDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.CicloCuatroPruebaSophos.*;
import static userinterfaces.CicloUnoPruebaSophos.BTN_ENVIAR_CICLO_UNO;

public class IngresarCicloCuatroPruebaSophos implements Task {

    private CicloCuatro cicloCuatro;

    public IngresarCicloCuatroPruebaSophos(CicloCuatro cicloCuatro) {
        this.cicloCuatro = cicloCuatro;
    }

    public static IngresarCicloCuatroPruebaSophos ingresarCicloCuatroPruebaSophos(CicloCuatro cicloCuatro) {
        return Tasks.instrumented(IngresarCicloCuatroPruebaSophos.class, cicloCuatro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(cicloCuatro.letraZ()).into(TEXTAREA_LETRA),
                Enter.theValue(cicloCuatro.numeroRespuestaDos()).into(INPUT_RESPUESTA),
                Click.on(BTN_ENVIAR_CICLO_UNO)
        );
    }
}
