package services.modals;

import services.modals.base.Modal;

public class PublishOptions extends Modal {
    private int select;


    @Override
    public void run() {
        printModalHeader("publish options");
        print("1. publish");
        print("2. undo Publish ");
        select = input(2);
    }

    public int getSelect() {
        return select;
    }
}
