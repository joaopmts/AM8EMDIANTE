package  AM8EMDIANTE.AM8EMDIANTE;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("usjtAtiv");
	}
}
