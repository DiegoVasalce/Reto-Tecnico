package reto.tecnico.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import reto.tecnico.model.DataTest;
import reto.tecnico.userinterface.LastStepPage;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {

        this.question = question;
    }

    public static Answer toThe(DataTest uTestData) {
        return new Answer(uTestData.getStrQuestion());
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String q = Text.of(LastStepPage.STRING_QUESTION).viewedBy(actor).asString();
        result = question.equals(q);
        return result;
    }
}
