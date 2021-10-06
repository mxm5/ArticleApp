package services.pages;

import services.pages.base.Page;

public class ShowAllArticleListPage extends Page {
    @Override
    public void run() {
        printTitle("article list page");
        print("Here is a list of articles");
    }
}
