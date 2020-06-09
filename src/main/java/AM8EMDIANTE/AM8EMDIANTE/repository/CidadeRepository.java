package AM8EMDIANTE.AM8EMDIANTE.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import AM8EMDIANTE.AM8EMDIANTE.model.Cidade;

public interface CidadeRepository extends JpaRepository <Cidade, Long>{
	
	Cidade findByLatitudeAndLongitude(double latitude, double longitude);
	
	
    List<Cidade> findByNomeStartingWith(String nome);
	
	
}