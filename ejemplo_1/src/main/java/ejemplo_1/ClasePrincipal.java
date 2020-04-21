package ejemplo_1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moto m=new Moto("Vespino", "Rosa", 2, 2);
		Moto m1=new Moto("Suzuki", "gs500", 2, 3);
		  StandardServiceRegistry s=new StandardServiceRegistryBuilder().configure().build();
		  SessionFactory sf=new MetadataSources(s).buildMetadata().buildSessionFactory();
		  Session sesion=sf.openSession();  
		  Transaction t=sesion.getTransaction();
		  t.begin();
		  sesion.save(m);
		  sesion.save(m1);
		  t.commit();
		  sesion.close();
		  sf.close();
		  
		   /* Session sesion=sf.openSession();
		    sesion.getTransaction().begin();
		    sesion.save(u);
		    sesion.getTransaction().commit();*/

	}

}
