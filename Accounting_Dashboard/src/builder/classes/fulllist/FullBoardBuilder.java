package builder.classes.fulllist;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import builder.classes.MyConnection;
import accounting.dashboard.dbbeans.LineItemShipments;

public class FullBoardBuilder {

	public List<LineItemShipments> getDeliveredShipmentsFullMismatch(String module) {
		
		MyConnection my = new MyConnection();
		SessionFactory sf = my.getFactory();
		Session ss = sf.openSession();
		String hql = "FROM LineItemShipments E WHERE E.type ='delivered' and module='"+module+"' ";
	Query query = ss.createQuery(hql);
	List results = query.list();
	return results;
		
	}
	
public List<LineItemShipments> getRTOShipmentsFullMismatch(String module) {
		
		MyConnection my = new MyConnection();
		SessionFactory sf = my.getFactory();
		Session ss = sf.openSession();
		String hql = "FROM LineItemShipments E WHERE E.type ='rto' and module='"+module+"' ";
	Query query = ss.createQuery(hql);
	List results = query.list();
	return results;
		
	}
}
