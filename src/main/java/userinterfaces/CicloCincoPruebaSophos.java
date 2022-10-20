package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class CicloCincoPruebaSophos {
    public static Target SELECT_RESPUESTA_CICLO_CINCO = PageElement.locatedBy("//select[@class='form-select appearance-none block w-full p-3 text-base font-normal bg-white bg-clip-padding bg-no-repeat border border-solid border-gray-300 rounded transition ease-in-out']");
    public static Target INPUT_RESPUESTA = PageElement.locatedBy("//input[@class='border-2 border-black rounded-sm p-2']");
}
