package notepad.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PublicUtil {
	private static EntityManagerFactory emf;
	static {
		emf = Persistence.createEntityManagerFactory("NotePad");
	}

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public static void close() {
		emf.close();
	}

}
