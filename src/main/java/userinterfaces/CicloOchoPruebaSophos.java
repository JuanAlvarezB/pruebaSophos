package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class CicloOchoPruebaSophos {

    public static Target TEXTAREA_CICLO_OCHO = PageElement.locatedBy("//textarea[@class='border-2 border-black rounded-sm p-2 resize-y']");
    public static Target NUMERO_195 = PageElement.locatedBy("//input[@value='195']");
    public static Target NUMERO_35 = PageElement.locatedBy("//input[@value='35']");
}
