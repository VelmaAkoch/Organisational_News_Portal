package models;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, department_id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return id== news.id && department_id == news.department_id && title.equals(news.title) && content.equals(news.content);
    }
}
