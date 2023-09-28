package com.co.sena.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AttractionPage {
    public static final Target BTN_ATRACCION = Target.the("opcion ABRIR ATRACCION")
            .locatedBy("//a[@id='attractions']");
    public static final Target BTN_SEARCH = Target.the("opcion ABRIR ATRACCION")
            .locatedBy("//input[@name='query']");

    public static final Target BTN_DATE = Target.the("opcion fecha")
            .locatedBy("//div[@class='css-ck8kih']");

    public static final Target TXT_DATE_STAR = Target.the("Botón de fecha de salida")
            .located(By.xpath("//span[@data-date='2023-09-30']"));
    public static final Target TXT_DATE_END = Target.the("Botón de fecha de regreso")
            .located(By.xpath("//span[@data-date='2023-10-14']"));

    public static final Target BTN_SEARCH_ATR = Target.the("opcion buscar la atraccion")
            .locatedBy("//*[text()='Buscar']");
}
