
/*Importacion de anotaciones y clases necesaria*/
package com.co.sena.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/*Indica cual es la clase que se ejecutara en la automatización*/
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature", /* Ruta de feature) que se van a ejecutar */
        snippets = SnippetType.CAMELCASE, /* Configura el codigo del featuro para los metodos de Cucumber*/
        glue = "com.co.sena.stepsdefinitions" /* Paquete donde se encuentran las definiciones de pasos (step definitions)*/
)
public class LoginRunner {


    /* En esta clase se define cómo se ejecutarán las pruebas de automatización de login*/
}
