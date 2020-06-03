package AM8EMDIANTE.AM8EMDIANTE.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mysql.cj.Query;

import AM8EMDIANTE.AM8EMDIANTE.model.Cidade;
import AM8EMDIANTE.AM8EMDIANTE.model.Clima;
import AM8EMDIANTE.AM8EMDIANTE.repository.CidadeRepository;
import AM8EMDIANTE.AM8EMDIANTE.repository.JPAUtil;

@RestController
@RequestMapping("/cidade")
public class CidadeResource {
	@Autowired
	private CidadeRepository CidadeRepo;
	
	@GetMapping("/lista")
	public ModelAndView listarCidade() {
		ModelAndView mv = new ModelAndView("lista_cidade");
		mv.addObject(new Cidade());
		List<Cidade> cidade = CidadeRepo.findAll(); // traz todos FindAll
		mv.addObject("cidade", cidade);
		return mv;
	}
	
}






