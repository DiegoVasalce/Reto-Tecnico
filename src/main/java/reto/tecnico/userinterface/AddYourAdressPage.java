package reto.tecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddYourAdressPage extends PageObject {

    public static final Target INPUT_CITY = Target.the("input the city").
            located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("input the zip code").
            located(By.id("zip"));
    public static final Target DIV_COUNTRY = Target.the("div choose the country").
            located(By.xpath("//div[@name='countryId']//div[@placeholder]"));
    public static final Target INPUT_COUNTRY = Target.the("input choose country").
            located(By.xpath("//div[@name='countryId']//input[@placeholder]"));
    public static final Target BUTTON_NEXT_2 = Target.the("press button next").
            located(By.xpath("//a[@aria-label='Next step - select your devices']"));


}
