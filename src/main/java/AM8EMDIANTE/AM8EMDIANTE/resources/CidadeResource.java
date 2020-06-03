package AM8EMDIANTE.AM8EMDIANTE.resources;

import java.net.URI;
import java.util.List;

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

import AM8EMDIANTE.AM8EMDIANTE.model.Cidade;
import AM8EMDIANTE.AM8EMDIANTE.model.Clima;
import AM8EMDIANTE.AM8EMDIANTE.repository.CidadeRepository;

@RestController
@RequestMapping("/cidade")
public class CidadeResource {
	@Autowired
	private CidadeRepository CidadeRepo;
	
	@GetMapping("/lista")
	public ModelAndView listarCidade() {
		ModelAndView mv = new ModelAndView("lista_cidade");
		mv.addObject(new Clima());
		List<Cidade> cidade = CidadeRepo.findAll(); // traz todos FindAll
		mv.addObject("cidade", cidade);
		return mv;
	}
	
	/*@PostMapping("/salvar")
	//@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Livro> salvar(@RequestBody Livro livro) {
		Livro l = livroRepo.save(livro);
		URI uri = ServletUriComponentsBuilder.
				fromCurrentServletMapping().path("/{id}").
				buildAndExpand(l.getId()).
				toUri();
		//response.setHeader("Location", uri.toASCIIString());
		return ResponseEntity.created(uri).body(l);
	}
	
	@GetMapping("/{id}")
	public Livro buscarPeloId(@PathVariable Long id) {
		return livroRepo.getOne(id);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Livro> atualizar(@RequestBody Livro livro){
		Livro l = livroRepo.findById(livro.getId()).get();
		l.setAutor(livro.getAutor());
		l.setTitulo(livro.getTitulo());
		l.setEdicao(livro.getEdicao());
		l.setNumeroPaginas(livro.getNumeroPaginas());
		l = livroRepo.save(l);
		return ResponseEntity.status(HttpStatus.OK).body(l);
	}

	@DeleteMapping("/{id}")
	public void excluirPeloId(@PathVariable Long id) {
		Livro l =  livroRepo.getOne(id);
		livroRepo.delete(l);
	}
	*/
	
}






