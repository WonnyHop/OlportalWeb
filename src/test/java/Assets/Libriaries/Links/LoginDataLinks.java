package Assets.Libriaries.Links;

import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginDataLinks {
    public String olportal = "https://development.olportal-lk.dev.smedialink.com/login";
    public String xPathPhoneNumberField = "//*[@id=\"phone\"]";
    public String xPathCheckboxAgeValidation = "/html/body/div[1]/div[1]/div/div[1]/div/form/div/label/div[1]";
    public String xPathLoginNextButton  = "/html/body/div[1]/div[1]/div/div[1]/div/form/div/div[2]";
    public String xPathSMSValidationField = "/html/body/div[1]/div[1]/div/div[1]/div/form/div/div[2]/div/div/input";
    public String xPathLoginAutorisationButton = "/html/body/div[1]/div[1]/div/div[1]/div/form/div/div[4]/button";
    public String droplistCountryLogin = "/html/body/div[1]/div[1]/div/div[1]/div/form/div/div[1]/div/div/div[1]";
    public String nElement;

    public String getMainpageLink() {
        return mainpageLink="https://development.olportal-lk.dev.smedialink.com/dashboard/main";
    }

    public String mainpageLink;

    public String getRegistrationLink() {
        return registrationLink="https://development.olportal-lk.dev.smedialink.com/registration";
    }

    public String registrationLink;


    public String getCountryNumber() {
        return countryNumber = "/html/body/div[1]/div[1]/div/div[1]/div/form/div/div[1]/div/div/div[2]/p";
    }

    public String countryNumber;

    //    public String dropListCountryElement = "/html/body/div[1]/div[1]/div/div[1]/div/form/div/div[1]/div/div/div[1]/ul/li["+ nElement +"]/img";
    public String dropListCountryElement;

    public String getDropListCountryElement(){
        this.dropListCountryElement = "//img[@data-country=\"";
        return dropListCountryElement;
    }

    public String getDroplistCountryLogin() {
        return droplistCountryLogin;
    }

    public String getxPathLoginAutorisationButton(){
        return xPathLoginAutorisationButton;
    }


    public String getxPathSMSValidationField() {
        return xPathSMSValidationField;
    }

    public String getxPathLoginNextButton() {
        return xPathLoginNextButton;
    }

    public String getxPathCheckboxAgeValidation() {
        return xPathCheckboxAgeValidation;
    }



    public String getxPathPhoneNumberField() {
        return xPathPhoneNumberField;
    }

    public String getOlportal() {
        return olportal;
    }

    public String getMainProfileButton() {
        return mainProfileButton= "/html/body/div[1]/div[1]/div/div[1]/nav/a/div";
    }

    public String mainProfileButton;

    public String getProfileURL() {
        return profileURL="https://development.olportal-lk.dev.smedialink.com/dashboard/profile";
    }

    public String profileURL;





}
