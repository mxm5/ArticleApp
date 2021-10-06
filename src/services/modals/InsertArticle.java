package services.modals;

import services.modals.base.Modal;

import java.util.ArrayList;

public class InsertArticle extends Modal {
    //    private String article;
//    private ArrayList<String> article;
    private String article = "";
    private boolean running = true;

    @Override
    public void run() {
        printModalHeader(" insert article");
        print("write the article ");
        print("to end the article write END ");

        while (running) {
            String text = input("");
            if (text.endsWith("END")) {
                running = false;
                break;
            }
            else
                article = article + "\n" + text;

        }

    }

    public String getArticle() {
        return article;
    }
}
