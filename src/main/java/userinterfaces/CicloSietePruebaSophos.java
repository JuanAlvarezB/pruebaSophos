package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class CicloSietePruebaSophos {


    public static Target SELECT_CICLO_SIETE = PageElement.locatedBy("//input[@class='border-2 border-black rounded-sm p-2']");

    public static Target INPUT_NUMBERO_95 = PageElement.locatedBy("//input[@value='95']");
    public static Target INPUT_NUMBERO_130 = PageElement.locatedBy("//input[@value='130']");
    public static Target INPUT_NUMBERO_125 = PageElement.locatedBy("//input[@value='125']");
    public static Target INPUT_NUMBERO_60 = PageElement.locatedBy("//input[@value='60']");

}
