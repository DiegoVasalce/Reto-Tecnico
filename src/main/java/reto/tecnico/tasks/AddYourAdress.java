package reto.tecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import reto.tecnico.model.DataTest;
import reto.tecnico.userinterface.AddYourAdressPage;

public class AddYourAdress implements Task {
    private DataTest d;

    public AddYourAdress(DataTest d) {
        this.d = d;
    }

    public static AddYourAdress onThePage(DataTest user) {

        return Tasks.instrumented(AddYourAdress.class, user);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(d.getStrCity()).into(AddYourAdressPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(AddYourAdressPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(AddYourAdressPage.INPUT_CITY),
                Enter.theValue(Integer.toString(d.getIntZipCode())).into(AddYourAdressPage.INPUT_ZIP),
                Click.on(AddYourAdressPage.DIV_COUNTRY),
                Enter.theValue(d.getStrCountry()).into(AddYourAdressPage.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(AddYourAdressPage.INPUT_COUNTRY),
                Click.on(AddYourAdressPage.BUTTON_NEXT_2)
        );

    }
}
