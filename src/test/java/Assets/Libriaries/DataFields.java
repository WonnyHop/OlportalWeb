package Assets.Libriaries;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataFields {
    public String phoneNumberValue = "9000000015";

    public String getPhoneNumberValue() {
        return phoneNumberValue;
    }

    public String validationKey = "00000";

    public String getValidationKey() {
        return validationKey;
    }

    List< String> countryNumb = new ArrayList<String>();

    {
        countryNumb.add("+7");
        countryNumb.add("+1");
        countryNumb.add("+4");
    }
    public String getCountryNumb(Integer i) {

        return countryNumb.get(i);
    }

    public String getEmail() {
        return email="test@mail.com";
    }

    public String email;

    public String getFirstName() {
        return firstName="Test";
    }

    public String firstName;

    public String getLastName() {
        return lastName="Akk";
    }

    public String lastName;


}
