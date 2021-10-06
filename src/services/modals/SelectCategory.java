package services.modals;

import services.modals.base.Modal;

public class SelectCategory extends Modal {

    public SelectCategory( String[] catsNames) {
        this.catsNames = catsNames;
    }

    private final String[] catsNames;
    private int select = -1;


    @Override
    public void run() {
        printModalHeader("select category");
        int k =1;
        for (String cat : catsNames) {

            print(k +".  "+ cat);
            k++;
        }
        select = input(k);


    }

    public int getSelect() {
        return select;

    }
}
