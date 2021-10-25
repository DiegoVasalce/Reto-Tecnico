package reto.tecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TellAboutYourDevicesPage extends PageObject {

    public static final Target DIV_COMPUTER_OS = Target.the("div computer os").
            located(By.xpath("//div[@name='osId']//div[@placeholder]"));
    public static final Target INPUT_COMPUTER_OS = Target.the("input computer os").
            located(By.xpath("//div[@name='osId']//input[@placeholder]"));
    public static final Target DIV_VERSION = Target.the("div version os").
            located(By.xpath("//div[@name='osVersionId']//div[@placeholder]"));
    public static final Target INPUT_VERSION = Target.the("input version os").
            located(By.xpath("//div[@name='osVersionId']//input[@placeholder]"));
    public static final Target DIV_LANGUAGE = Target.the("div language os").
            located(By.xpath("//div[@name='osLanguageId']//div[@placeholder]"));
    public static final Target INPUT_LANGUAGE = Target.the("input language os").
            located(By.xpath("//div[@name='osLanguageId']//input[@placeholder]"));
    public static final Target DIV_BRAND = Target.the("div brand mobile").
            located(By.xpath("//div[@name='handsetMakerId']//div[@placeholder]"));
    public static final Target INPUT_BRAND = Target.the("input brand mobile").
            located(By.xpath("//div[@name='handsetMakerId']//input[@placeholder]"));
    public static final Target DIV_MODEL = Target.the("div model mobile").
            located(By.xpath("//div[@name='handsetModelId']//div[@placeholder]"));
    public static final Target INPUT_MODEL = Target.the("input model mobile").
            located(By.xpath("//div[@name='handsetModelId']//input[@placeholder]"));
    public static final Target DIV_MOBILE_OS = Target.the("div mobile os").
            located(By.xpath("//div[@name='handsetOSId']//div[@placeholder]"));
    public static final Target INPUT_MOBILE_OS = Target.the("input mobile os").
            located(By.xpath("//div[@name='handsetOSId']//input[@placeholder]"));
    public static final Target BUTTON_NEXT_3 = Target.the("button next").
            located(By.xpath("//a[@aria-label='Next - final step']"));


}
