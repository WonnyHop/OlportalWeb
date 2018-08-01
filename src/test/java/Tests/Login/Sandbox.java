package Tests.Login;

import Assets.Libriaries.TestBase;
import org.testng.annotations.Test;

public class Sandbox extends TestBase {
    @Test
    public void Sandbox() {
      //  oAction.smartAutorise(dFields.getPhoneNumberValue());
       // comand.clickByXPath(dLinks.getMainProfileButton());
      //  oAction.clickOnCountryList();
        comand.changeTextboxByXPath(dLinks.getxPathPhoneNumberField(),"1101010");
        comand.clearField(dLinks.getxPathPhoneNumberField());
        comand.waitForHuman(10);
    }
}
