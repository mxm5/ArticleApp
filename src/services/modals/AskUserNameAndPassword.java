package services.modals;

import services.modals.base.Modal;

public class AskUserNameAndPassword extends Modal {

    private String userName;
    private String password;
    @Override
    public void run() {
        printModalHeader(" insert user name and password");
        userName = input("user name ");
        password = input("password ");

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
