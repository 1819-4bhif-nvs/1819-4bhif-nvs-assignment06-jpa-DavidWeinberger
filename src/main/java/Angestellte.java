import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Angestellte implements Serializable {
    @Id
    private long personalNummer;
    private String vorname;
    private String nachname;

    public Angestellte(long persoId, String firstName, String lastName){
        personalNummer = persoId;
        vorname = firstName;
        nachname = lastName;
    }

    public Angestellte() {
    }
}
