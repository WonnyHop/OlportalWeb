package Assets.Libriaries;

import Assets.Libriaries.Links.LoginDataLinks;
import Assets.Libriaries.Links.RegistrationDataLinks;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class TestBase {
  public WebDriver driver;
  public boolean acceptNextAlert = true;
  public StringBuffer verificationErrors = new StringBuffer();

  public WebActions comand = new WebActions();
  public LoginDataLinks dLinks = new LoginDataLinks();
  public DataFields dFields = new DataFields();
  public RegistrationDataLinks regLinks = new RegistrationDataLinks();
  public OlportalActions oAction = new OlportalActions(comand, dLinks, dFields, regLinks);

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = comand.openBrowse();
    comand.goToPage(dLinks.getOlportal());
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    comand.close();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
  public boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
  public boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
  public String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
