package dao;

import Entities.user;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ahmed on 5/29/2017.
 */
@Repository
public class userDaoImpl implements userDao {


    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //    @Transactional
    public void saveUser(user user) {

        sessionFactory.getCurrentSession().save(user);


    }

    @SuppressWarnings("unchecked")
    public List<user> GetAllUser() {
        return sessionFactory.getCurrentSession().createCriteria(user.class).list();
    }

    public int deleteUser(int id) {
        sessionFactory.getCurrentSession().delete(new user(id));
        return id;
    }

    public user getUserById(int id) {
        user user = (Entities.user) sessionFactory.getCurrentSession().get(user.class, id);
        return user;
    }

    public int updateUser(user user) {
        sessionFactory.getCurrentSession().update(user);

        return user.getId();
    }


}

