package reto.tecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class retotecnicoPage extends PageObject {
    public static final Target JOIN_BOTTON = Target.the("Botton that show us the form to Join")
            .located(By.className("unauthenticated-nav-bar__sign-up"));

}
