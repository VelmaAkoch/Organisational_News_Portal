package models;

public class News {
    private int id;
    private String title;
    private String content;
    private int department_id;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
