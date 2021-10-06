package models;

public class Tag extends BaseModel {

    public Tag(int id, String title) {
        super(id, title);
    }

    public Tag(String title) {
        this(0, title);
    }
}
