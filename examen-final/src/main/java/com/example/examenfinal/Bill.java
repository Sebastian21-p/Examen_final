import javax.persistence.Basic;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.date

@Entity
@Table(name = "bill")
public class Bill implements Serializable{
	
	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "id")
	    private Integer id;
	    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
	    @Basic(optional = false)
	    @NotNull
	    @Column(name = "date_bill")
	    private Date dateBill;
	    @Basic(optional = false)
	    @Column(name = "value")
	    private Integer value;
	    @Basic(optional = false)
	    @Column(name = "value")
	    private Integer value;
	    @Basic(optional = false)
	    @Column(name = "observation")
	    private String observation;
	    @Basic(optional = false)
	    @Column(name = "observation")
	    private String observation;
	    @JoinColumn(name = "usuario", referencedColumnName = "id_usuario")
	    @ManyToOne
	    private Usuario usuario;
	    
	   
	   
}
