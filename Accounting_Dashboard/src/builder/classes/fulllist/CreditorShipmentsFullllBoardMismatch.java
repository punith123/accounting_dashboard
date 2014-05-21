package builder.classes.fulllist;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class CreditorShipmentsFullllBoardMismatch extends ActionSupport{
	
	private List<accounting.dashboard.dbbeans.LineItemShipments> deliveredLineitems = new ArrayList<accounting.dashboard.dbbeans.LineItemShipments>(); 
	private List<accounting.dashboard.dbbeans.LineItemShipments> rtoLineitems = new ArrayList<accounting.dashboard.dbbeans.LineItemShipments>(); 
	
	public String getTotalDeliveredShipmentsMismatch() {
		buildDeliveredTotalMismacth();
		return "fullboard";
		
	}

	public String getTotalRTOShipmentsMismatch() {
		buildRTOTotalMismacth();
		return "fullboard";
		
	}
	private void buildRTOTotalMismacth() {
		// TODO Auto-generated method stub
		FullBoardBuilder fullBoard = new FullBoardBuilder();
		setRtoLineitems(fullBoard.getRTOShipmentsFullMismatch("creditor"));
		
	}

	private void buildDeliveredTotalMismacth() {
		// TODO Auto-generated method stub
		FullBoardBuilder fullBoard = new FullBoardBuilder();
		setDeliveredLineitems(fullBoard.getDeliveredShipmentsFullMismatch("creditor"));
	}

	public List<accounting.dashboard.dbbeans.LineItemShipments> getDeliveredLineitems() {
		return deliveredLineitems;
	}

	public void setDeliveredLineitems(
			List<accounting.dashboard.dbbeans.LineItemShipments> deliveredLineitems) {
		this.deliveredLineitems = deliveredLineitems;
	}

	public List<accounting.dashboard.dbbeans.LineItemShipments> getRtoLineitems() {
		return rtoLineitems;
	}

	public void setRtoLineitems(
			List<accounting.dashboard.dbbeans.LineItemShipments> rtoLineitems) {
		this.rtoLineitems = rtoLineitems;
	}
}
