package  AM8EMDIANTE.AM8EMDIANTE;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import  AM8EMDIANTE.AM8EMDIANTE.model.Cidade;
import AM8EMDIANTE.AM8EMDIANTE.model.Clima;
import AM8EMDIANTE.AM8EMDIANTE.model.Semana;
import  AM8EMDIANTE.AM8EMDIANTE.repository.JPAUtil;

public class SemanaComClima {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Semana s = new Semana();
		s.setSemana("Quinta");
		manager.persist(s);
		Cidade ci = new Cidade();
		ci.setNome("Las Vegas");
		ci.setLatitude(21323);
		ci.setLongitude(31113);
		manager.persist(ci);
		Clima c = new Clima(null, 12, 21, 0.41, "nublado",
				new java.sql.Date(format.parse("03/06/2020").getTime()), s, ci);
		manager.persist(c);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}