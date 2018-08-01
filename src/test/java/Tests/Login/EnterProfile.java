package Tests.Login;

import Assets.Libriaries.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnterProfile extends TestBase {
    @Test
    public void EnterProfile(){
        oAction.autorise(dFields.getPhoneNumberValue());
        comand.clickByXPath(dLinks.getMainProfileButton());
        Assert.assertEquals(comand.getURL(), dLinks.getProfileURL());
    }
}
