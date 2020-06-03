package AM8EMDIANTE.AM8EMDIANTE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import AM8EMDIANTE.AM8EMDIANTE.model.Clima;
import AM8EMDIANTE.AM8EMDIANTE.service.ClimaTempoService;


@Controller
public class ClimaTempoController {
	
	@Autowired
	private ClimaTempoService climaTempoService;
	
	@GetMapping("/previsao")
	public ModelAndView listarClima() {
		ModelAndView mv = new ModelAndView("lista_periodos");
		mv.addObject(new Clima());
		List<Clima> clima = climaTempoService.listarTodos(); // traz todos FindAll
		mv.addObject("clima", clima);
		return mv;
	}
	
}

