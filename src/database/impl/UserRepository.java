package database.impl;

import database.AbstractRepository;
import model.User;
import org.hibernate.query.Query;

/**
 * @author Elattar Saad
 */
public class UserRepository extends AbstractRepository<User> {

    public User login(String username, String password) {
        Query query = getSession().createQuery("from  User where username='" + username + "' and password='" + password + "'");
        return (User) query.uniqueResult();
    }


}
