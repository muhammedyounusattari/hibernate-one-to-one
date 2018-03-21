package younus.attari;

import java.security.SecureRandom;
import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	
	static SessionFactory factory = null;
	
	static {
		Properties prop = new Properties();
		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect" );
		prop.setProperty("hibernate.connection.url", "jdbc:mysql://abcd");
		prop.setProperty("hibernate.connection.username", "user");
		prop.setProperty("hibernate.connection.password", "pass#123");
		prop.setProperty("hibernate.connection.driver", "com.mysql.jdbc.Driver");
		prop.setProperty("hibernate.hbm2ddl.auto", "create-drop");

		factory = new Configuration().addPackage("younus.attari")
			.addAnnotatedClass(Employee.class)
			.addAnnotatedClass(EmployeeDetail.class)
			.addProperties(prop).buildSessionFactory();
	
	}

	public static void main(String[] args) {
		String id = Long.toHexString(new SecureRandom().nextLong());
		
		EmployeeDetail empDetail = new EmployeeDetail();
//		empDetail.setEmpId(id);
		empDetail.setEmpFirstName("Yash");
		empDetail.setEmpLastName("Chopra");
		empDetail.setEmpManager("manager");
		empDetail.setEmpAddress("address");
		
		
		Employee emp = new Employee();
//		emp.setEmpId(id);
		emp.setEmpDesig("Software Engineer");
		emp.setEmpProject("Airtel");
		emp.setEmpReporting("Yash");
		emp.setEmpDetail(empDetail);
		
		Session session = factory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(emp);
		transaction.commit();
		//emp =(Employee) session.get(Employee.class, id);
		//System.out.println(emp.getEmpId()+"...."+emp.getEmpDesig()+"..."+emp.getEmpProject()+"..."+emp.getEmpReporting());
	}
}
