package com.co.sena.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/accommodation.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.sena.stepsdefinitions"
)
public class AccommodationRunner {
}
