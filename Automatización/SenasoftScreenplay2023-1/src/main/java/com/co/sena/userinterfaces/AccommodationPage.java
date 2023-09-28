package com.co.sena.userinterfaces;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


import net.serenitybdd.screenplay.targets.Target;

public class AccommodationPage {
    public static final Target TXT_DESTINATION = Target.the("destino")
            .locatedBy("//input[@placeholder='¿Adónde vas?']");
    public static final Target BTN_DATE_STAR = Target.the("Fecha de salida")
            .locatedBy("//button[@class='d47738b911 e246f833f7 fe211c0731']");
    public static final Target TXT_DATE_STAR = Target.the("Botón de fecha de salida")
            .located(By.xpath("//span[@data-date='2023-09-30']"));
    public static final Target TXT_DATE_END = Target.the("Botón de fecha de regreso")
            .located(By.xpath("//span[@aria-label='7 octubre 2023']"));

    public static final Target TXT_ADULT = Target.the("cantidad de adulto   ")
            .locatedBy("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e bb803d8689 f4d78af12a']");

    public static final Target TXT_CHILDREN = Target.the("cantidad de niños  ")
            .locatedBy("//input[@id='group_children' and @value='2']");
    public static final Target BTN_OCCUOANCY = Target.the("destino")
            .locatedBy("//button[@data-testid='occupancy-config']");
    public static final Target BTN_USD = Target.the("opcion USD")
            .locatedBy("//span[@class='cf67405157']");

    public static final Target BTN_COP= Target.the("Clic en botón login")
            .locatedBy("//button[@data-testid='header-currency-picker-trigger']");



}
