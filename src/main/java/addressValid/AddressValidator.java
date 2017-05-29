package addressValid;

/**
 * Created by ahmed on 5/23/2017.
 */
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AddressValidator implements ConstraintValidator<IsvalidAddress, String> {

    private String ListOfAddress;

    public void initialize(IsvalidAddress List) {

        ListOfAddress = List.ListOfAddress();

    }

    public boolean isValid(String validate, ConstraintValidatorContext arg1) {
        // TODO Auto-generated method stub

        if (validate == null) {
            return false;

        }
        if (validate.matches(ListOfAddress)) {

            return true;
        } else {
            return false;

        }

    }

}
