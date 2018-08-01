package Assets.Libriaries;

import java.awt.geom.Path2D;

public class Generators {

    public String getNewPhone(String number){
        Long buffer=0l;
        System.out.println(number.trim());
       try{
            buffer = Long.valueOf(number.trim());
        }catch(NumberFormatException ex){ // handle your exception
           System.out.println(buffer);
        }

        buffer++;
        number=Long.toString(buffer);
        System.out.println(buffer);
        System.out.println(number);

    return number;
    }
}
