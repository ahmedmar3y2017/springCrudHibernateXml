package dao;

import Entities.user;

import java.util.List;

/**
 * Created by ahmed on 5/29/2017.
 */
public interface userDao {
    void saveUser(user user);

    List<user> GetAllUser();

    int deleteUser(int id);

    user getUserById(int id);

    int updateUser(user user);
}
