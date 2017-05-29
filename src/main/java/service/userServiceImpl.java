package service;

import Entities.user;
import dao.userDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ahmed on 5/29/2017.
 */

@Service
public class userServiceImpl implements userService {
    userDao userDao;

    public dao.userDao getUserDao() {
        return userDao;
    }

    public void setUserDao(dao.userDao userDao) {
        this.userDao = userDao;
    }


    @Transactional
    public void saveUser(user user) {
        userDao.saveUser(user);
    }

    @Transactional
    public List<user> GetAllUser() {
        List<user> list = userDao.GetAllUser();
        return list;
    }

    @Transactional
    public int deleteUser(int id) {
        return userDao.deleteUser(id);
    }

    @Transactional
    public user getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Transactional
    public int updateUser(user user) {
        return userDao.updateUser(user);
    }
}
