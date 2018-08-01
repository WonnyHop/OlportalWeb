package Assets.Libriaries.Links;

public class RegistrationDataLinks {

    public String getEmailField() {
        return emailField="//*[@id=\"email\"]";
    }

    public String emailField;

    public String getEmailValidButton() {
        return emailValidButton="/html/body/div[1]/div[1]/div/div[1]/div/div/form/div[2]";
    }

    public String emailValidButton;

    public String getFirstNameField() {
        return firstNameField="//*[@id=\"firstName\"]";
    }

    public String firstNameField;

    public String getLastNameField() {
        return lastNameField="//*[@id=\"lastName\"]";
    }

    public String lastNameField;

    public String regValidButton;

    public String getRegValidButton() {
        return regValidButton="/html/body/div[1]/div[1]/div/div[1]/div/div/form/div[3]";
    }
}
