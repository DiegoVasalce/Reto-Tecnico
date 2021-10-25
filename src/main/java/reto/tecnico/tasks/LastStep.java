package reto.tecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import reto.tecnico.model.DataTest;
import reto.tecnico.userinterface.LastStepPage;

public class LastStep implements Task {

    DataTest dt;

    public LastStep(DataTest dt) {
        this.dt = dt;
    }

    public static LastStep createUser(DataTest user) {

        return Tasks.instrumented(LastStep.class,user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(dt.getStrPassword()).into(LastStepPage.INPUT_PASSWORD_1),
                Enter.theValue(dt.getStrPassword()).into(LastStepPage.INPUT_PASSWORD_2),
                Click.on(LastStepPage.CHECKBOX_TERMS),
                Click.on(LastStepPage.CHECKBOX_PRIVACITY),
                Click.on(LastStepPage.BUTTON_FINISH)
        );

    }
}
