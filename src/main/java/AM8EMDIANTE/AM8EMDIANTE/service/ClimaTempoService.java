package AM8EMDIANTE.AM8EMDIANTE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AM8EMDIANTE.AM8EMDIANTE.model.Clima;
import AM8EMDIANTE.AM8EMDIANTE.repository.ClimaTempoRepository;


@Service
public class ClimaTempoService {


	@Autowired
	private ClimaTempoRepository climaTempoRepo;

	public List<Clima> listarTodos() {
		List <Clima> periodos = climaTempoRepo.findAll();
		return periodos;
	}
}
