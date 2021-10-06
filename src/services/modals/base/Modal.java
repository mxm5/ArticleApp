package services.modals.base;

import services.pages.base.Page;

public abstract class Modal extends Page {
    public void printModalHeader(String str){
        print("-------------------------------------");
        print(String.format("|  %s ",str.toUpperCase()+" MODAL"));
        print("-------------------------------------");

    }

}
