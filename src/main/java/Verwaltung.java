import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Startup
public class Verwaltung {

    @PersistenceContext(name = "NewPersistenceUnit")
    EntityManager entityManager;

    @PostConstruct
    private void init(){
        System.out.println("****Starts****");
        Angestellte angestellte = new Angestellte(123151, "David", "Wein");
        entityManager.persist(angestellte);
    }


}
