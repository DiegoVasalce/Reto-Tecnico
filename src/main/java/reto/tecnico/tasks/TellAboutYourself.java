package reto.tecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import reto.tecnico.model.DataTest;
import reto.tecnico.userinterface.TellAboutYourselfPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class TellAboutYourself implements Task {

    private DataTest d;

    public TellAboutYourself(DataTest d) {
        this.d = d;
    }

    public static TellAboutYourself onThePage(DataTest user) {
        return Tasks.instrumented(TellAboutYourself.class,user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(d.getStrFirstName()).into(TellAboutYourselfPage.INPUT_NAME),
                Enter.theValue(d.getStrLastName()).into(TellAboutYourselfPage.INPUT_LASTNAME),
                Enter.theValue(d.getStrEmail()).into(TellAboutYourselfPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(d.getStrMonth()).from(TellAboutYourselfPage.OPTION_MONTH),
                SelectFromOptions.byVisibleText(Integer.toString(d.getIntDay())).from(TellAboutYourselfPage.OPTION_DAY),
                SelectFromOptions.byVisibleText(Integer.toString(d.getIntYear())).from(TellAboutYourselfPage.OPTION_YEAR),
                Click.on(TellAboutYourselfPage.INPUT_LENGUAGE),
                Enter.theValue(d.getStrLenguage()).into(TellAboutYourselfPage.INPUT_LENGUAGE),
                Hit.the(Keys.ENTER).into(TellAboutYourselfPage.INPUT_LENGUAGE),
                WaitUntil.the(TellAboutYourselfPage.BUTTON_NEXT_1, isEnabled()),
                Click.on(TellAboutYourselfPage.BUTTON_NEXT_1)
        );

    }
}
