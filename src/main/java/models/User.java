package models;

public class User {
    private int id;
    private String name;
    private String position;
    private String role;
    private int department_id;

    public User(String name, String position, String role) {
        this.name = name;
        this.position = position;
        this.role = role;
        this.id = id;
        this.department_id = department_id;
    }


}
