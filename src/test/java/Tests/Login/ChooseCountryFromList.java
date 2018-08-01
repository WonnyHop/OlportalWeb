package Tests.Login;

import Assets.Libriaries.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ChooseCountryFromList extends TestBase{

    public Integer n = 2;

    @Test
    public void ChooseCountriesFromList(){

       // oAction.ChooseCountriesFromList(dLinks.getDroplistCountryLogin(),dFields.getPhoneNumberValue(),dLinks.getDropListCountryElement(),n);
        comand.waitForHuman(2);
       // oAction.Autorise();
    }
}
