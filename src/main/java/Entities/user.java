package Entities;

import addressValid.IsvalidAddress;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by ahmed on 5/29/2017.
 */


@Entity
@Table
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Pattern(regexp = "^[a-z0-9_-]{3,15}$", message = "Enter valid username ....")
    private String username;
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20})", message = "password invalid .... ")
    private String password;
    @IsvalidAddress(ListOfAddress = "tanta|cairo|shebin", message = "address should be (tanta|cairo|shebin)")
    private String address;
    private Long mobile;
    @Past(message = "BirthDate Should Be in the past ")
    private Date birthdate;

    public user() {
    }

    public user(int id) {

        this.id = id;
    }

    public user(String username, String password, String address, Long mobile, Date birthdate) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.mobile = mobile;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
