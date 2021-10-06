package services.pages.userPages;

import services.pages.base.Page;

public class DashboardPage extends Page
{
    @Override
    public void run() {
        printTitle("dashboard page");
        print("1.  Write A new Article");
        print("2.  edit an Article of mine ");
        print("3.  show list of my article");
        print("4.  change password of my Account");

        input(3);
        new AddArticlePage().run();

    }
}
