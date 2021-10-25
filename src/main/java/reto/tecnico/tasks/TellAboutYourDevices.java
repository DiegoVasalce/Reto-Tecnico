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
import reto.tecnico.userinterface.TellAboutYourDevicesPage;

public class TellAboutYourDevices implements Task {

    DataTest dt;
    public TellAboutYourDevices(DataTest dt) {
        this.dt = dt;
    }

    public static TellAboutYourDevices onThePage(DataTest dt) {

        return Tasks.instrumented(TellAboutYourDevices.class,dt);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(TellAboutYourDevicesPage.DIV_COMPUTER_OS),
                Enter.theValue(dt.getStrComputerOS()).into(TellAboutYourDevicesPage.INPUT_COMPUTER_OS),
                Hit.the(Keys.ENTER).into(TellAboutYourDevicesPage.INPUT_COMPUTER_OS),
                Click.on(TellAboutYourDevicesPage.DIV_VERSION),
                Enter.theValue(dt.getStrComputerVersion()).into(TellAboutYourDevicesPage.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(TellAboutYourDevicesPage.INPUT_VERSION),
                Click.on(TellAboutYourDevicesPage.DIV_LANGUAGE),
                Enter.theValue(dt.getStrComputerLenguage()).into(TellAboutYourDevicesPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(TellAboutYourDevicesPage.INPUT_LANGUAGE),
                Click.on(TellAboutYourDevicesPage.DIV_BRAND),
                Enter.theValue(dt.getStrBrandMobil()).into(TellAboutYourDevicesPage.INPUT_BRAND),
                Hit.the(Keys.ENTER).into(TellAboutYourDevicesPage.INPUT_BRAND),
                Click.on(TellAboutYourDevicesPage.DIV_MODEL),
                Enter.theValue(dt.getStrModelMobil()).into(TellAboutYourDevicesPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(TellAboutYourDevicesPage.INPUT_MODEL),
                Click.on(TellAboutYourDevicesPage.DIV_MOBILE_OS),
                Enter.theValue(dt.getStrMobilOS()).into(TellAboutYourDevicesPage.INPUT_MOBILE_OS),
                Hit.the(Keys.ENTER).into(TellAboutYourDevicesPage.INPUT_MOBILE_OS),
                Click.on(TellAboutYourDevicesPage.BUTTON_NEXT_3)
        );

    }
}
