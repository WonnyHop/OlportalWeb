package Tests.Login;

import Assets.Libriaries.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidAuthorisation extends TestBase {
    @Test
    private void ValidAuthorisation(){
    oAction.autorise(dFields.getPhoneNumberValue());
    comand.waitElement("/html/body/div[1]/div[1]/div/div[1]/nav/ul/li[6]/button", 3);
    Assert.assertTrue(comand.getURL().equals(dLinks.getMainpageLink()), "correctly autorise");
    }

}
