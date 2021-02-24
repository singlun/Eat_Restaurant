package website.programming.androideatit.Model;

/**
 * Created by cokel on 2/27/2018.
 */

public class User {
    private String Name;
    private String Password;
    private String Phone;
    private String IsStaff;
    private String secureCode;

    public User(String name, String password, String secureCode) {
        this.Name = name;
        this.Password = password;
        this.IsStaff = "false";
        this.secureCode = secureCode;
    }

    public String getSecureCode() {
        return secureCode;
    }

    public void setSecureCode(String secureCode) {
        this.secureCode = secureCode;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public User() {
    }

    public String getIsStaff() {
        return IsStaff;
    }

    public void setIsStaff(String isStaff) {
        IsStaff = isStaff;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
