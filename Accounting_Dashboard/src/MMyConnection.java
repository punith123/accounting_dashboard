import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MMyConnection {

	private static SessionFactory sessionFactory = getConnection();
	
	private static SessionFactory getConnection() {

		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				configuration.getProperties()).buildServiceRegistry();
		SessionFactory sf = configuration.buildSessionFactory(sr);

		sf.openSession();

		return  sf;
	}

	public SessionFactory getFactory() {
		return  sessionFactory;
	}

	public MMyConnection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
