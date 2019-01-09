import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Geraet implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String serienNummer;
    private String TypBezeichnung;
    private LocalDate alter;


    public Geraet(String sn, String TB, LocalDate al){
        serienNummer = sn;
        TypBezeichnung = TB;
        alter = al;
    }
}
