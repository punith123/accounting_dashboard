package builder.classes;

import java.util.ArrayList;
import java.util.List;

 

public class DebtorDashBoard {

	private List<accounting.dashboard.dbbeans.DashBoardElement> deliveredMetrics = new ArrayList<accounting.dashboard.dbbeans.DashBoardElement>();
	private List<accounting.dashboard.dbbeans.DashBoardElement> rtoedMetrics = new ArrayList<accounting.dashboard.dbbeans.DashBoardElement>();
	private List<accounting.dashboard.dbbeans.DashBoardElement> bulletMetrics = new ArrayList<accounting.dashboard.dbbeans.DashBoardElement>();

	
	public List<accounting.dashboard.dbbeans.DashBoardElement> getDeliveredMetrics() {
		return deliveredMetrics;
	}
	public void setDeliveredMetrics(
			List<accounting.dashboard.dbbeans.DashBoardElement> deliveredMetrics) {
		this.deliveredMetrics = deliveredMetrics;
	}
	public List<accounting.dashboard.dbbeans.DashBoardElement> getRtoedMetrics() {
		return rtoedMetrics;
	}
	public void setRtoedMetrics(
			List<accounting.dashboard.dbbeans.DashBoardElement> rtoedMetrics) {
		this.rtoedMetrics = rtoedMetrics;
	}
	public List<accounting.dashboard.dbbeans.DashBoardElement> getBulletMetrics() {
		return bulletMetrics;
	}
	public void setBulletMetrics(
			List<accounting.dashboard.dbbeans.DashBoardElement> bulletMetrics) {
		this.bulletMetrics = bulletMetrics;
	}

	
	
}
