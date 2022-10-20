package tasks;

import models.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.LoginPruebaSophos.*;

public class IngresarCredencialesPruebaSophos implements Task {


    private Credenciales credenciales;

    public IngresarCredencialesPruebaSophos(Credenciales credenciales) {
        this.credenciales = credenciales;
    }

    public static IngresarCredencialesPruebaSophos ingresarCredencialesPruebaSophos(Credenciales credenciales) {
        return Tasks.instrumented(IngresarCredencialesPruebaSophos.class, credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(credenciales.user()).into(INPUT_USER),
                Enter.theValue(credenciales.password()).into(INPUT_PASSWORD),
                Click.on(BTN_ENVIAR)
        );
    }
}
