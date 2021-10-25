package reto.tecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TellAboutYourselfPage {
    public static final Target INPUT_NAME = Target.the("where do we write the name").
            located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the lastname").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email").
            located(By.id("email"));
    public static final Target OPTION_MONTH = Target.the("where do we choose the month of birth").
            located(By.id("birthMonth"));
    public static final Target OPTION_DAY = Target.the("where do we choose the day of birth").
            located(By.id("birthDay"));
    public static final Target OPTION_YEAR = Target.the("where do we choose the year of birth").
            located(By.id("birthYear"));
    public static final Target INPUT_LENGUAGE = Target.the("where do we choose the lenguage").
            located(By.xpath("//div[@id='languages']//input"));
    public static final Target BUTTON_NEXT_1 = Target.the("button go to the next view").
            located(By.xpath("//a[@aria-label='Next step - define your location']"));
}
