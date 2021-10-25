package reto.tecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastStepPage extends PageObject {

    public static final Target INPUT_PASSWORD_1 = Target.the("password account").
            located(By.id("password"));
    public static final Target INPUT_PASSWORD_2 = Target.the("confirm password account").
            located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERMS = Target.the("confirm terms").
            located(By.xpath("//span[contains(@ng-class,'termOfUse')]"));
    public static final Target CHECKBOX_PRIVACITY = Target.the("confirm privacity y security policy").
            located(By.xpath("//span[contains(@ng-class,'privacySetting')]"));
    public static final Target BUTTON_FINISH = Target.the("button finish create user").
            located(By.id("laddaBtn"));
    public static final Target STRING_QUESTION = Target.the("obtain text of button").
            located(By.xpath("//a[@id='laddaBtn']/span"));
}
