package security;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by ahmed on 6/5/2017.
 */
public class PaswordEncrypt {
    static PaswordEncrypt paswordEncrypt = null;

    public static PaswordEncrypt GetInstance() {

        if (paswordEncrypt == null) {

            paswordEncrypt = new PaswordEncrypt();

        }

        return paswordEncrypt;
    }

    public String MD5Hash(String password) {
        Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();
        return md5PasswordEncoder.encodePassword(password, null);

    }

    public String Bycrpt(String password) {

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(password);


    }

}
