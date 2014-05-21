package builder.classes;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import accounting.dashboard.dbbeans.DashBoardElement;

public class DashBoardBuilder {

	public CreditorDashBoard buildCreditorDashBoard() {
		CreditorDashBoard cb = new CreditorDashBoard();
		cb.setDeliveredMetrics(getDeliveredMetrics("creditor"));
		cb.setRtoedMetrics( getRTOMetrics("creditor"));
		cb.setBulletMetrics(getbulletMetrics("creditor"));
		return cb;		
	}
	
	public DebtorDashBoard buildDebtorDashBoard() {
		DebtorDashBoard db = new DebtorDashBoard();
		db.setDeliveredMetrics(getDeliveredMetrics("debtor"));
		db.setRtoedMetrics( getRTOMetrics("debtor"));
		db.setBulletMetrics(getbulletMetrics("debtor"));
		return db;		
	}
	
	public List<DashBoardElement> getDeliveredMetrics(String module) {
		MyConnection my = new MyConnection();
		SessionFactory sf = my.getFactory();
		Session ss = sf.openSession();
		String hql = "FROM DashBoardElement E WHERE E.type ='delivered' and module='"+module+"' ";
	Query query = ss.createQuery(hql);
	List results = query.list();
	return results;
	}
	
	
	public List<DashBoardElement> getRTOMetrics(String module) {
		MyConnection my = new MyConnection();
		SessionFactory sf = my.getFactory();
		Session ss = sf.openSession();
		String hql = "FROM DashBoardElement E WHERE E.type ='rto' and module='"+module+"' ";
	Query query = ss.createQuery(hql);
	List results = query.list();
	return results;
	}
	
	public List<DashBoardElement> getbulletMetrics(String module) {
		MyConnection my = new MyConnection();
		SessionFactory sf = my.getFactory();
		Session ss = sf.openSession();
		String hql = "FROM DashBoardElement E WHERE E.type ='bullets' and module='"+module+"' ";
	Query query = ss.createQuery(hql);
	List results = query.list();
	return results;
	}
}
