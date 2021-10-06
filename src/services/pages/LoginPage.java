package services.pages;

import services.modals.AskUserNameAndPassword;
import services.pages.base.Page;
import services.pages.userPages.DashboardPage;

public class LoginPage extends Page {

     AskUserNameAndPassword modal = new AskUserNameAndPassword();

    @Override
    public void run() {
        printTitle("login page");
        modal.run();

        checkTheUser();

       new DashboardPage().run();

    }

    private void checkTheUser() {
        // search data base for users with that name
        String p = modal.getPassword();
        // see what is the password for them
        String t = modal.getUserName();
        // check if its valid
        // then use it if possible
        // and return user
    }

}
