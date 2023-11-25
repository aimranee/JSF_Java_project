package abstractFacade;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import util.HibernateUtil;

public abstract class AbstractFacade<T> {
    
    private Class<T> entityClass;
    

    // Le constructeur prend la classe de l'entité en paramètre
    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    // Méthode pour ajouter une entité à la base de données
    public void create(T entity) {
        // Implémenter la logique de création ici
        Session session=null;
        try {
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("hello");

            session.getTransaction().rollback();
        }finally{
                        System.out.println("hello");

            if(session!=null){
                session.close();
            }
        }
    }

    // Méthode pour mettre à jour une entité dans la base de données
    public void edit(T entity) {
        // Implémenter la logique de mise à jour ici
    }

    // Méthode pour supprimer une entité de la base de données
    public void remove(T entity) {
        // Implémenter la logique de suppression ici
    }

    // Méthode pour rechercher une entité par son identifiant
    public T find(Object id) {
        // Implémenter la logique de recherche ici
        return null;
    }

    // Méthode pour obtenir toutes les entités de la base de données
    public List<T> findAll() {
        // Implémenter la logique pour récupérer toutes les entités ici
        return null;
    }

    // Méthode pour obtenir une liste d'entités à partir d'une plage donnée
    public List<T> findRange(int[] range) {
        // Implémenter la logique pour récupérer une plage d'entités ici
        return null;
    }

    // Méthode pour obtenir le nombre total d'entités dans la base de données
    public int count() {
        // Implémenter la logique pour compter le nombre total d'entités ici
        return 0;
    }
}
