package AM8EMDIANTE.AM8EMDIANTE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AM8EMDIANTE.AM8EMDIANTE.model.Usuario;
import AM8EMDIANTE.AM8EMDIANTE.repository.UsuarioRepository;



@Service
public class LoginService {
	
	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar(Usuario usuario) {
		
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}