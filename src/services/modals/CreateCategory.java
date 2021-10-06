package services.modals;

import services.modals.base.Modal;

public class CreateCategory extends Modal {
    private String catName;
    @Override
    public void run() {
        printModalHeader("create category");
        catName = input("enter category name");

    }

    public String getCatName() {
        return catName;
    }
}
