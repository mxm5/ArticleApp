package services.pages;

import services.pages.base.Page;

public class FirstPage extends Page {


    @Override
    public void run() {
        printTitle("main page");
        print("1. A list of Articles");
        print("2. Register as Author");
        print("3. Login as Author");
        print("4. exit");
        int select = input(4);
        switch (select){
            case 1:
                break;
            case 2:
                new SignupPage().run();
                break;
            case 3:
                new LoginPage().run();
                break;
            case 4:
                printTitle("exiting .....");
                print("thank you for using our app");
                break;
        }

    }
}
