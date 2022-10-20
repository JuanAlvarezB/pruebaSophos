package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class CicloDiezPruebaSophos {
    public static Target TEXTAREA_LETRA_CICLO_DIEZ = PageElement.locatedBy("//textarea[@class='border-2 border-black rounded-sm p-2 resize-y']");
    public static Target TEXT_VALIDAR = PageElement.locatedBy("//h1[contains(text(),'Felicidades, has terminado la prueba exitosamente')]");

}
