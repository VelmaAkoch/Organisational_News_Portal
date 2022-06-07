package dao;

import models.User;

import java.util.List;

public interface UserDao {
    //CRUD

    //create a user
    void add (User user);

    //read
    List<User> getAll();
    User findById(int id);
    List<User> getAllUsersByDepartment(int user_id);



}
