package database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Using this class you wont need to deal with Hibernate assets
 * Make sure you provide the hibernate config file (hibernate.cfg.xml) in your project root
 *
 * @param <E> entity
 * @author Elattar Saad
 */
public class AbstractRepository<E> {
    /**
     * Hibernate assets
     */
    private Configuration configuration;
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    /**
     * No args construct for the implementation
     */
    public AbstractRepository() {
        this.configuration = new Configuration().configure().addAnnotatedClass((Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
        this.sessionFactory = configuration.buildSessionFactory();
    }

    /**
     * for opening a session or resuming an existing one
     *
     * @return Session
     */
    protected Session getSession() {
        if (session == null) {
            this.session = sessionFactory.openSession();
        }
        return this.session;
    }

    /**
     * for opening a transaction or resuming an existing one
     *
     * @return Transaction
     */
    protected Transaction getTransaction() {
        if (this.transaction == null) {
            this.transaction = getSession().beginTransaction();
        }
        if (!this.transaction.isActive()) {
            this.transaction.begin();
        }
        return transaction;
    }
    /**
     * use this function to save the entity as a record in the configured database
     *
     * @param entity
     */
    public void save(E entity) {
        try {
            getSession().save(entity);
            getTransaction().commit();
        } catch (Exception e) {
            getTransaction().rollback();
            e.printStackTrace();
        }
    }
    /**
     * use this function to update an existing record in the configured database
     *
     * @param entity
     */
    public void saveOrUpdate(E entity) {
        try {
            getSession().saveOrUpdate(entity);
            getTransaction().commit();
        } catch (Exception e) {
            getTransaction().rollback();
            e.printStackTrace();
        }
    }
    /**
     * use this function to update an existing record in the configured database
     *
     * @param entity
     */
    public void update(E entity) {
        try {
            getSession().update(entity);
            getTransaction().commit();
        } catch (Exception e) {
            getTransaction().rollback();
            e.printStackTrace();
        }
    }

    /**
     * use this function to delete an existing record in the configured database
     *
     * @param entity
     */
    public void delete(E entity) {
        try {
            getSession().delete(entity);
            getTransaction().commit();
        } catch (Exception e) {
            getTransaction().rollback();
            e.printStackTrace();
        }
    }
    /**
     * use this function to retrieve all the records
     */
    public List<E> findAll() {
        Query query = getSession().createQuery("from "+ ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0].getTypeName());
        return query.list();
    }
    /**
     * use this function to find a record by id
     */
    public E findById(Long id) {
        return getSession().get((Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0], id);
    }

    public E find(Long id){
        return getSession().find((Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0],id);
    }
}
