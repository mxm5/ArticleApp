package services.modals;

import services.modals.base.Modal;

public class CreateTag extends Modal {
    private String tagName;
    @Override
    public void run() {
        tagName = input("enter tag name");
    }

    public String getTagName() {
        return tagName;
    }
}
