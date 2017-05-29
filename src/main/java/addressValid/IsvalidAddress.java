package addressValid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by ahmed on 5/23/2017.
 */@Documented
@Constraint(validatedBy = AddressValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IsvalidAddress {
    String ListOfAddress();

    String message() default "please provide a valid hoppy (tanta|cairo|shebin)";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};



}
