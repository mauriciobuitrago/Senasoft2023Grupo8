package com.co.sena.questions;

import com.co.sena.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class GmailIncomplete implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LoginPage.TXT_MESSAGE_GMAIL_ERROR).viewedBy(actor).asBoolean();
    }
    public static GmailIncomplete compareGmail()
    {
        return new GmailIncomplete();
    }
}
