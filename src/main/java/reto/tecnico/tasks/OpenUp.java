package reto.tecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import reto.tecnico.userinterface.retotecnicoPage;

public class OpenUp implements Task {

    private reto.tecnico.userinterface.retotecnicoPage retotecnicoPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(retotecnicoPage), Click.on(retotecnicoPage.JOIN_BOTTON));

    }
}
