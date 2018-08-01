package Tests.Login;

import Assets.Libriaries.TestBase;
import org.testng.annotations.Test;

public class CorrectProfileFill extends TestBase {
    @Test
    public void CorrectProfileFill() {
        oAction.autorise(dFields.getPhoneNumberValue());
        comand.clickByXPath(dLinks.getMainProfileButton());

    }
}
