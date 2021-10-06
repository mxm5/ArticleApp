package services.pages;

import services.modals.RegisterUser;
import services.pages.base.Page;

public class SignupPage extends Page {

    RegisterUser modal = new RegisterUser();

    @Override
    public void run() {
        printTitle("Signup page");

        modal.run();
    }

}
