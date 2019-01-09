import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Ausgeliehen implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Geraet geraet;

    @OneToOne
    private Angestellte angestellte;

    public Ausgeliehen(Geraet ge, Angestellte an){
        geraet = ge;
        angestellte = an;
    }

    public Ausgeliehen() {
    }
}
