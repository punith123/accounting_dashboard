package accounting.dashboard.dbbeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dashBoard_elements")
public class DashBoardElement {

	@Id
	@GeneratedValue
	@Column(name = "id",length=100)
	private Integer id;

//	@ManyToOne
//	@JoinColumn(name = "ad_owner")
//	private AdOwner adowner;

	@Column(name = "name",length=100)
	private String Elementname;

	@Column(name = "value")
	private String value;
	
	@Column(name = "module")
	private String module;

	@Column(name = "type")
	private String type;

	@Column(name = "amount_to_be_collected")
	private String amountToBeCollected;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getElementname() {
		return Elementname;
	}

	public void setElementname(String elementname) {
		Elementname = elementname;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public DashBoardElement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAmountToBeCollected() {
		return amountToBeCollected;
	}

	public void setAmountToBeCollected(String amountToBeCollected) {
		this.amountToBeCollected = amountToBeCollected;
	}
	
}
