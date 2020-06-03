package AM8EMDIANTE.AM8EMDIANTE.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AM8EMDIANTE.AM8EMDIANTE.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);
	
}
