package AM8EMDIANTE.AM8EMDIANTE;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import AM8EMDIANTE.AM8EMDIANTE.model.Usuario;
import  AM8EMDIANTE.AM8EMDIANTE.repository.JPAUtil;

public class TesteInsereUmUsuario {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();// inicio
		Usuario u = new Usuario(null, "marino", "1234567");
		manager.persist(u);
		transaction.commit();// manda
		manager.close();// fecha
		JPAUtil.close();
	}

}
