package Assets.Libriaries;

import Assets.Libriaries.Links.LoginDataLinks;
import Assets.Libriaries.Links.RegistrationDataLinks;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class OlportalActions extends WebActions {

    private WebActions comand ;
    private LoginDataLinks loginDL;
    private RegistrationDataLinks regDL;
    private DataFields dFields;
    private Generators generator = new Generators();

    public    OlportalActions(WebActions gcomand, LoginDataLinks gdata, DataFields gdFields, RegistrationDataLinks rdata){
        comand = gcomand;
        loginDL =gdata;
        dFields = gdFields;
        regDL = rdata;
            }

    public void autorise(String number){
        comand.goToPage(loginDL.getOlportal());
        comand.changeTextboxByXPath(loginDL.getxPathPhoneNumberField(), number);
        comand.clickByXPath(loginDL.getxPathCheckboxAgeValidation());
        comand.clickByXPath(loginDL.getxPathLoginNextButton());
        comand.changeTextboxByXPath(loginDL.getxPathSMSValidationField(), dFields.getValidationKey());
        comand.clickByXPath(loginDL.getxPathLoginAutorisationButton());
    }

    public void registration(String email, String firstname, String lastname){
            comand.changeTextboxByXPath(regDL.getEmailField(), email);
            comand.clickByXPath(regDL.getEmailValidButton());
            comand.changeTextboxByXPath(regDL.getFirstNameField(),firstname);
            comand.changeTextboxByXPath(regDL.getLastNameField(),lastname);
            comand.clickByXPath(regDL.getRegValidButton());
    }

    public void ChooseCountriesFromList(String xPathList, String xPathNumber, String xPathElemet, Integer n) {
        int i = 0;
        String pathNumberElement = xPathElemet+Integer.toString(i)+"\"]";
        String number, trueNumber;
        comand.clickByXPath(xPathList);
        while ((comand.findElemet(pathNumberElement)) && (i <= n)) {
            comand.waitElement(pathNumberElement, 5);
            comand.clickByXPath(pathNumberElement);
            trueNumber = dFields.getCountryNumb(i).toString();
            number = comand.getText(loginDL.getCountryNumber());
            Assert.assertFalse((!trueNumber.equals(number)), "не соотвествует страна № " + i + "");
            i++;
            comand.clickByXPath(xPathList);
        }
    }

    public void smartAutorise(String number){
        String newNumber = number;
        comand.goToPage(loginDL.getOlportal());


        comand.changeTextboxByXPath(loginDL.getxPathPhoneNumberField(), newNumber);
        comand.clearField(loginDL.getxPathPhoneNumberField());
        comand.waitForHuman(10);

        comand.clickByXPath(loginDL.getxPathCheckboxAgeValidation());
        comand.clickByXPath(loginDL.getxPathLoginNextButton());
        if(comand.findElementByClass("styles_validError_jOM1L")) {
            System.out.println("yep");
            newNumber=generator.getNewPhone(newNumber);
            comand.clearField(loginDL.getxPathPhoneNumberField());
            comand.waitForHuman(5);
            comand.changeTextboxByXPath(loginDL.getxPathPhoneNumberField(), newNumber);
            comand.waitForHuman(5);
        }

    }

    public void superAutorisation(String number){
    autorise(number);
    if(comand.getURL().equals(loginDL.getMainpageLink())) return;
    else {
        registration(dFields.getEmail(), dFields.getFirstName(), dFields.getLastName());
    }

    }

    public void clickOnCountryList(){
        comand.changeTextboxByXPath("/html/body/div[1]/div[1]/div/div[2]/div/div[1]/div/div[2]/form/div[3]/div/input", "по");
        comand.waitForHuman(1);
        comand.changeTextboxByXPath("/html/body/div[1]/div[1]/div/div[2]/div/div[1]/div/div[2]/form/div[3]/div/input", "л");
        comand.waitForHuman(5);
        List <WebElement> list = comand.getElements("/html/body/div[1]/div[1]/div/div[2]/div/div[1]/div/div[2]/form/div[3]/div/ul/li");
            comand.clickOnElement(list.get(0));
            comand.waitForHuman(3);
        comand.changeTextboxByXPath("/html/body/div[1]/div[1]/div/div[2]/div/div[1]/div/div[2]/form/div[4]/div/input", "ва");
        comand.waitForHuman(1);
        comand.changeTextboxByXPath("/html/body/div[1]/div[1]/div/div[2]/div/div[1]/div/div[2]/form/div[4]/div/input", "р");
        comand.waitForHuman(3);
        List <WebElement> listT = comand.getElements("/html/body/div[1]/div[1]/div/div[2]/div/div[1]/div/div[2]/form/div[4]/div/ul/li");
        comand.clickOnElement(listT.get(1));
        comand.waitForHuman(10);
    }

}
