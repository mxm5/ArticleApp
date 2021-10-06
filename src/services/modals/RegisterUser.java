package services.modals;

import services.modals.base.Modal;

public class RegisterUser extends Modal {


    private String firstName="";
    private String lastName="";
    private String username="";
    private String password="";
    private String nationalCode="";
//    private String repeatPassword="";
//    private String error="";

    @Override
    public void run() {
        printModalHeader("register user");
        firstName = input("user firstName");
        lastName = input("user lastName");
        username = input("user name");
        password = input("user National Code");
        nationalCode = input("Password");
//        repeatPassword = input("type password again");


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNationalCode() {
        return nationalCode;
    }
}
