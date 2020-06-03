package AM8EMDIANTE.AM8EMDIANTE.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String login;
	private String senha;
	
	public Long getId() {
		return id;
	}



	public String getLogin() {
		return login;
	}



	public String getSenha() {
		return senha;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Usuario()
	{}


	public Usuario(Long id,String login, String senha)
	{
		this.id = id;
		this.login = login;
		this.senha = senha;
	}

}
