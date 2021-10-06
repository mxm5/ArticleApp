package models;

public class Category extends BaseModel {
    private String description;

    public Category(int id, String title, String description) {
        super(id, title);
        this.description = description;
    }

    public Category(String title, String description) {
        this(0, title, description);
    }

        public String getDescription() {
        return description;
    }
}
