package models;

public class Department {
        private int id;
        private String name;
        private  String description;
        private int size;

    public Department(String name, String description, int size) {
        this.name = name;
        this.description = description;
        this.size = size;
    }
}
