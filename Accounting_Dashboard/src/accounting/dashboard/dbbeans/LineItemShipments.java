package accounting.dashboard.dbbeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Line_items_shipments")
public class LineItemShipments {

	@Id
	@GeneratedValue
	@Column(name = "id",length=100)
	private Integer id;
	
	@Column(name = "vendor_tracking_id",length=100)
	private String vendorTrackingId;

	@Column(name = "merchant_ref_id")
	private String merchantRefId;
	
	@Column(name = "module")
	private String module;

	@Column(name = "type")
	private String type;

	@Column(name = "amount_to_be_collected")
	private String amountToBeCollected;
	
	@Column(name = "fkl_status")
	private String fklStatus;
	
	@Column(name = "apl_status")
	private String aplStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVendorTrackingId() {
		return vendorTrackingId;
	}

	public void setVendorTrackingId(String vendorTrackingId) {
		this.vendorTrackingId = vendorTrackingId;
	}

	public String getMerchantRefId() {
		return merchantRefId;
	}

	public void setMerchantRefId(String merchantRefId) {
		this.merchantRefId = merchantRefId;
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

	public String getAmountToBeCollected() {
		return amountToBeCollected;
	}

	public void setAmountToBeCollected(String amountToBeCollected) {
		this.amountToBeCollected = amountToBeCollected;
	}

	public String getFklStatus() {
		return fklStatus;
	}

	public void setFklStatus(String fklStatus) {
		this.fklStatus = fklStatus;
	}

	public String getAplStatus() {
		return aplStatus;
	}

	public void setAplStatus(String aplStatus) {
		this.aplStatus = aplStatus;
	}
	
}
