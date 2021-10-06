package services.modals;

import services.modals.base.Modal;

public class SelectTag extends Modal {

    private int select = -1;
    private final String[] cats;

    public SelectTag(String[] cats) {
        this.cats = cats;
    }

    @Override
    public void run() {
        printModalHeader("select tag ");
        int k = 1;
        for (String cat : cats) {
            print(k+".  "+cat);

            k++;
        }
        int select = input(k);
    }

    public int getSelect() {
        return select;
    }
}
