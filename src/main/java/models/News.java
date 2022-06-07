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

    public News(int id, String title, String content, int department_id) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.department_id = department_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
}
