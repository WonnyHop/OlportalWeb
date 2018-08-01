package Assets.Libriaries;


import Assets.Libriaries.Links.LoginDataLinks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class WebActions {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();
    WebDriverWait wait;
    WebElement element;

    private LoginDataLinks dLinks = new LoginDataLinks();
    private DataFields dFields = new DataFields();

    private List<WebElement> countryList;

   public WebDriver openBrowse(){

        driver=new FirefoxDriver();
        baseUrl="https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        return(driver);
        }

   public void goToPage(String link){
       driver.get(link);
   }


   public void changeTextboxByID(String ID, String value){
       driver.findElement(By.id(ID)).click();
       driver.findElement(By.id(ID)).sendKeys(value);
   }

    public void changeTextboxByXPath(String xPath, String value){
        driver.findElement(By.xpath(xPath)).click();
        driver.findElement(By.xpath(xPath)).sendKeys(value);
    }

   public void clickByXPath(String XPath){
       driver.findElement(By.xpath(XPath)).click();
   }

   public void close(){
       driver.quit();
   }

   public void waitForHuman(Integer time) {
       try {
           java.util.concurrent.TimeUnit.SECONDS.sleep(time);
       }
       catch(InterruptedException e)
       {
           // this part is executed when an exception (in this example InterruptedException) occurs
       }

   }

   public boolean findElemet(String XPath){
       if(driver.findElement(By.xpath(XPath))!=null)
        return true;
       else
           return  false;
   }

   public void clickByCSS(String cssLock) {
       driver.findElement(By.cssSelector(cssLock)).click();

   }

   public void waitElement(String xPath, Integer time){
        wait = new WebDriverWait(driver,time);
        element = driver.findElement(By.xpath(xPath));
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
   }

   public void waitPage(Integer time){
       wait = new WebDriverWait(driver, time);
       wait.until(ExpectedConditions.titleContains("title"));
   }

   public String getText(String xPath){
       return driver.findElement(By.xpath(xPath)).getText();
   }

   public String getURL(){
       return driver.getCurrentUrl();
   }

   public boolean findElementByClass(String className){
    if(driver.findElement(By.className(className))!=null) return true;
    else return false;
   }

   public void clearField(String xPath){
    driver.findElement(By.xpath(xPath)).click();
    driver.findElement(By.xpath(xPath)).clear();
   }

   public List<WebElement> getElements(String xPAth){
       return driver.findElements(By.xpath(xPAth));
   }

   public void clickOnElement(WebElement element){
       element.click();
   }

}
